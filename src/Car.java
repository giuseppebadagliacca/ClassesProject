public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

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

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void sayHello(){
        System.out.println("HEllOOO!");
    }
    public Car(String make, double price, int year, String color){
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;

    }
}
