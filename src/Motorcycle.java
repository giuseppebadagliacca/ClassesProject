public class Motorcycle extends Car{

    private String make;
    private double price;
    private int year;
    private String color;
    private int wheels;

    public Motorcycle(String make, double price, int year, String color, String[] parts, int wheels){
        super(make,price, year,color, parts);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
