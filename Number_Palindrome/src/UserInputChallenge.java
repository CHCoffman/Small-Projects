import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter < 10){
           int order = counter + 1;
            System.out.println("Enter number#" + order + ":");

            boolean isAnInt = scanner.hasNextInt();//Checks if valid number enters console

            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                    if(counter == 10){
                        break;
                    }
            } else {
                System.out.println("Invalid number.");
            }

            scanner.nextLine(); // Handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
