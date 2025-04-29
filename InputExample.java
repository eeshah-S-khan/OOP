import java.util.Scanner;

public class InputExample {

    // Function to read name and age from the user
    public void readNameAndAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name? ");
        String name = scanner.next();

        System.out.print("Age? ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " springs young");

        scanner.close();
    }

    public static void main(String[] args) {
        InputExample example = new InputExample();
        example.readNameAndAge();
    }
}

