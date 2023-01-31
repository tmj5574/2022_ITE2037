

import java.time.LocalDate;

public class ICE extends Car{
    private static int carNum;
    private static int CO2emission;
    private static final int GHGPERCAR = 35;

    ICE(){};
    ICE(String name_, LocalDate date_, int carNum_){
        this.name = name_;
        date = date_;
        carNum += carNum_;
        CO2emission += carNum_ * GHGPERCAR;

    }
    @Override
    int totalCO2() {
        System.out.println("ICE emit CO2 most when driving");
        return CO2emission;
    }

    Boolean equals(ICE ice){
        if((this.name.equals(ice.name))&&this.date.equals(ice.date)){
            return true;
        }
        return false;
    }

    public String toString(){ return "name: "+this.name +", date: "+this.date+", carNum: "+this.carNum;}
}
