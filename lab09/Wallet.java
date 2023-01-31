public class Wallet {
    private String name;
    private int balance;
    private int txIndex;

    //Wallet(){}

    public Wallet(String name){
        this.name = name;
        this.txIndex = 0;
        this.balance = 100;
    }

    int getBalance(){
        return balance;
    }

    void increaseIndex() {
        txIndex += 1;
    }

    void decreaseBalance(int expense){
        balance -= expense;
    }

    public void empty() throws Exception {
          if (balance <= 0) {
                throw new Exception("Go Home");
            }


    }

    public String toString(){
        return "name: "+this.name+", #"+this.txIndex+", balance: "+this.balance;
    }
}
