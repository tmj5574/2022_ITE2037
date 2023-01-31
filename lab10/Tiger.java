public class Tiger extends Animal implements Barkable{
    Tiger(){
        super("Tiger");
    }
    @Override
    public String bark() {
        return "Growl";
    }
}
