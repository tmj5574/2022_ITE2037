public class Dog extends Animal implements Barkable{
    Dog(){
        super("Dog");
    }

    @Override
    public String bark() {
        return "Bowwow" ;
    }
}
