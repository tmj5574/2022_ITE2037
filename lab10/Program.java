public class Program {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Turtle turtle = new Turtle();

        Animal[] animal = new Animal[3];
        animal[0] = dog;
        animal[1] = tiger;
        animal[2] = turtle;


        Person person = new Person() {
            @Override
            public void control(Animal animal) {
                if (animal instanceof Tiger) {
                    this.hp = hp - 80;
                    System.out.println("You have overpowered the Tiger");
                }
                if (animal instanceof Dog) {
                    this.hp -= 10;
                    System.out.println("You have overpowered the Dog");
                }
                if (animal instanceof Turtle){
                    System.out.println("You have overpowered the Turtle");
                }
            }

            @Override
            public void showInfo() {
                System.out.println("Person HP : " + this.hp);
            }

            private int hp = 100;


        };

        showResult(animal,person);
    }
    private static void showResult(Animal[] animal , Person person){
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        for (int i = 0; i < animal.length; i++){
            System.out.println("Animal"+ (i+1)+": " + animal[i].getName());
            if (animal[i] instanceof Barkable){
                System.out.println("Animal"+ (i+1)+" barked " + ((Barkable) animal[i]).bark());
            }
            person.control(animal[i]);
            person.showInfo();
        }

    }


}
