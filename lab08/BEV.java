import java.time.LocalDate;

public class BEV extends Car {

    private static int carNum;
    private static int CO2emission;
    private static final int GHGPERCAR = 25;

    @Override
    int totalCO2() {
        System.out.println("BEV emit CO2 most when generating electric energy");
        return CO2emission;
    }

    BEV(){};

    BEV(String name_, LocalDate date_, int carNum_){
        name = name_;
        date = date_;
        carNum += carNum_;
        CO2emission += carNum_*GHGPERCAR;
    }

    Boolean equals(BEV bev){
        if((this.name.equals(bev.name))&&this.date.equals(bev.date)){
            return true;
        }
        return false;
    }

    public String toString(){ return "name: "+this.name +", date: "+this.date+", carNum: "+this.carNum;}
}
