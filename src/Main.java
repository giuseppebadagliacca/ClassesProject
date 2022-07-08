public class Main {
    public static void main(String[] args) {
    Car nissan = new Car("Shit",2000.24,2021, "Navy");
        System.out.println(nissan.getMake());
        System.out.println(nissan.getPrice());
        System.out.println(nissan.getYear());
        System.out.println(nissan.getColor());

        Car.sayHello();
        nissan.setYear(1991);
        System.out.println(nissan.getYear());
    }
}
