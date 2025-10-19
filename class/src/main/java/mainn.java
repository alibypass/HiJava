import java.util.Scanner;

public class mainn {

    public static void main (String... args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("PLease enter your lastname: ");
        String lastname = scanner.nextLine();

        System.out.println("Please enter your age: ");
        String age = scanner.nextLine();

        System.out.println("Hi my name is " + name + " and my lastname is " + lastname + "  my age is " + age);

    }
}
