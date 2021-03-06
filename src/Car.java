import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void drive(){
        System.out.println("You bought the beautiful " +
                this.year +
                " " +this.color +
                " " +this.make +
                " for $" + this.getPrice()+
                ".");
        System.out.println("Please drive your car to the nearest exit. \n");
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String[] getParts() {
        return Arrays.copyOf(parts, parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void sayHello(){
        System.out.println("HEllOOO!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", parts=" + Arrays.toString(parts) +
                '}';
    }

    public Car(String make, double price, int year, String color, String[] parts){
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
    this.parts = Arrays.copyOf(parts, parts.length);
    }
}
