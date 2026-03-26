import java.util.ArrayList;
import java.util.Scanner;

class NameManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Add Name");
            System.out.println("2. Remove Name");
            System.out.println("3. Display Names");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    names.add(name);
                    System.out.println("Name added!");
                    break;

                case 2:
                    System.out.print("Enter name to remove: ");
                    String removeName = sc.nextLine();
                    names.remove(removeName);
                    System.out.println("Name removed (if it existed).");
                    break;

                case 3:
                    System.out.println("Names List:");
                    for (String n : names) {
                        System.out.println(n);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}