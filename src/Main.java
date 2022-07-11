import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] parts = {"Tries", "keys"};
    Car nissan = new Car("Shit",2000.24,2021, "Navy", parts);
        System.out.println(nissan.toString());
        nissan.sayHello();
        nissan.drive();
        System.out.println(Arrays.toString(nissan.getParts()));


    }

}
