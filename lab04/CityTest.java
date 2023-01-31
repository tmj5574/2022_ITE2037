public class test {
    public static void main(String[] args) {
        City seoul = new City("Seoul",23,45);
        City paris = new City("Paris",123,41);
        City racoon = new City("Racoon City");
        City mega = new City("Mega City");

        System.out.println(seoul.toString());
        System.out.println(paris.toString());
        System.out.println(racoon.toString());;
        System.out.println(mega.toString());;

        System.out.println(seoul.getName()+"-"+paris.getName()+":"+City.distance(seoul,paris));
        System.out.println(seoul.getName()+"-"+racoon.getName()+":"+City.distance(seoul,racoon));
        System.out.println(paris.getName()+"-"+mega.getName()+":"+City.distance(seoul,mega));
    }
}
