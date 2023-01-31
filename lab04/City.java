import java.util.Random;

public class City{
    private String name;
    private int locationX;
    private int locationY;

    City(String name, int locationX, int locationY){
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    City(String name){
        this.name = name;

        Random rnd = new Random();
        int r_nm = rnd.nextInt(361);
        this.locationX = r_nm;
        r_nm = rnd.nextInt(361);
        this.locationY = r_nm;
    }

    public String getName(){
        return this.name;
    }

    public int getLocationX(){
        return locationX;
    }

    public int getLocationY(){
        return getLocationY();
    }

    public Boolean equals(City city){
        if(this.name == city.name && this.locationX == city.locationX && this.locationY == city.getLocationY()){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return this.name + ", " + this.locationX + ", " + this.locationY;
    }

    public static double distance(City city1, City city2){
        double X = Math.pow(city1.locationX-city2.locationX,2);
        double Y = Math.pow(city1.locationY-city2.locationY,2);
        return Math.sqrt(X+Y);
    }
}
