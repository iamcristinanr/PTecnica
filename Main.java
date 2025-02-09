
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the number to choose the function: ");
        System.out.println("1. Calculate IMC ");
        System.out.println("2. Sum digit ");
        System.out.println("3. Move Zero");
        System.out.println("4. Exit ");

        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option){
            case 1:

                System.out.println("Add your weith in kg: ");
                double weight = scanner.nextDouble();

                System.out.println("Add your height in cm: ");
                double height = scanner.nextDouble();

                String result = IMC.calculateIMC(weight, height);
                System.out.println("The IMC result is " + result);

            break;
            case 2:
            
                System.out.println("Insert a numbers: ");
                int inputUser = scanner.nextInt();
                int resultSum = Sum.sumDigit(inputUser);

                System.out.println("The result of the sum is: " + resultSum);

            break;
            case 3:

                System.out.println("Insert a list of elements separated by commas");
                String inputUser2 = scanner.nextLine();

                List<Object> inputUserList2 = MoveZero.processList(inputUser2);
                List<Object> moveZeroList = MoveZero.moveZero(inputUserList2);
                
                System.out.println("The list after move zeros: " + moveZeroList);
            break;

            case 4:
            break;

        }

        scanner.close();
    }
}