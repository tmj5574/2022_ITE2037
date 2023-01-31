package account;

    import java.time.LocalDate;

    public class Account {
        private String name;
        private double yearlyInterest;
        private double balance;
        private LocalDate created;

        public Account(String name, double yearlyInterest, LocalDate created){
            this.name = name;
            this.yearlyInterest = yearlyInterest;
            this.created = created;
            this.balance = 0;
        }

        public double getBalance(){
            return this.balance;
        }

        public LocalDate getCreate(){
            return this.created;
        }

        public void increaseYearlyInterest(int increase){
            this.yearlyInterest += increase;
        }

        public void recieveIncome(double income){
            this.balance += income;
        }

        public void recieveInterest(){
            this.balance += ((this.balance*(this.yearlyInterest)/100)/12);
        }

        public String toString(){
            return "이름: " + this.name + ", 연이자: " + this.yearlyInterest + ", 잔고: "+this.balance + ", 가입일: "+this.created;
        }
    }
