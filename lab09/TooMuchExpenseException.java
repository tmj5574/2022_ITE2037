public class TooMuchExpenseException extends Exception{
    private int intputNum;

    public TooMuchExpenseException(){
        super("Not enough balance");
    }

    public TooMuchExpenseException(int intputNum){
        super("Over the limit!");
        this.intputNum = intputNum;

    }

    public int getIntputNum(){
        return intputNum;
    }
}
