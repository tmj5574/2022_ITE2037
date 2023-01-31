import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("my wallet");

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {
                wallet.empty();
                try {

                    System.out.print("Enter price: ");
                    int price = sc.nextInt();
                    wallet.empty(); //객체의 지갑 잔고 체크
                    if (price < 0) {
                        throw new NegativeException();
                    }

                    if (price > 100) {
                        throw new TooMuchExpenseException(price);
                    }

                    if (price > wallet.getBalance()) {
                        throw new TooMuchExpenseException();
                    } else {
                        System.out.println("peace~~");
                        wallet.increaseIndex();
                        wallet.decreaseBalance(price);
                    }

                } catch (NegativeException e) {
                    System.out.println(e);
                    System.out.println("\tat " + e.getStackTrace()[0]);
                    System.out.println("oh, sorry!");
                } catch (TooMuchExpenseException e) {
                    System.out.println(e);
                    System.out.println("\tat " + e.getStackTrace()[0]);
                    if (e.getMessage() == "Over the limit!") {
                        System.out.println("you pay " + e.getIntputNum());
                    }
                    System.out.println("oh, my!");

                }

            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("\tat " + e.getStackTrace()[0]);
                System.out.println("the end..");
                return;
            }
            finally {
                System.out.println(wallet.toString());
                System.out.println("---transaction complete---\n");
            }

        }
    }
}