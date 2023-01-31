package manager;

import account.Account;

import java.time.LocalDate;
import java.util.Random;

public class AccountManager {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021,12,1);
        Account account = new Account("탁", 5, date);
        System.out.println(account.toString());

        int temp = 0;

        while(account.getBalance() <= 10000) {
            account.recieveIncome(100);
            account.recieveInterest();
            temp++;
            date = date.plusMonths(1);
            int month = date.getMonthValue();
            if (month == 1) {
                Random random = new Random();
                int num = random.nextInt(10);
                if (num == 6) {
                    account.recieveIncome(100);
                    System.out.println("이벤트 당첨! "+ date);
                }
            }

            if (temp == 36) {
                account.increaseYearlyInterest(2);
                System.out.println("가입 후 3년이 지나서 이자율이 2%로 인상되었습니다.");
            }

        }
        System.out.println(account.toString());
    }

}
