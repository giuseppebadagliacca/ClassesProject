import java.util.ArrayList;

public class Garage {

    ArrayList<Car> inGarage = new ArrayList<Car>();

    public void parkInGarage(Car object){
        inGarage.add(object);
        System.out.println(this.inGarage);
    }
    public void removeFromGarage(Car object){
        inGarage.remove(object);
        System.out.println(this.inGarage);
    }
}
