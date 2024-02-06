import java.util.Scanner;

class SimpleCalculator {
    public static void calculator() {
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {

                System.out.println("1 for Addition");
                System.out.println("2 for Subtraction");
                System.out.println("3 for Multiplication");
                System.out.println("4 for Division");
                System.out.println("5 for Exponentiation");
                System.out.println("6 for square root");
                System.out.println("7 for exit");

                System.out.print("Enter your Number :");
                int num = sc.nextInt();
                //This if condition will terminate the loop
                if (num == 7)
                    break;

                if (num == 6) {

                    System.out.println("Enter num1 :");
                    int num11 = sc.nextInt();

                    System.out.println("The answer is :" + Math.sqrt(num11));
                    continue;

                }

                System.out.println("Enter num1 :");
                double num1 = sc.nextInt();
                System.out.println("Enter num2 :");
                double num2 = sc.nextInt();
                double ans = 0;
                switch (num) {
                    case 1:

                        ans = num1 + num2;
                        System.out.println("The answer is :" + ans);
                        break;

                    case 2:

                        ans = num1 - num2;
                        System.out.println("The answer is :" + ans);
                        break;

                    case 3:

                        ans = num1 * num2;
                        System.out.println("The answer is :" + ans);
                        break;

                    case 4:

                        ans = num1 / num2;
                        System.out.println("The answer is :" + ans);
                        break;

                    case 5:

                        ans = Math.pow(num1, num2);
                        System.out.println("The answer is :" + ans);
                        break;

                }
            }
        //This try and catch block will handle the errors without terminating the program
        } catch (Exception e) {

            System.out.println(e);
            
            calculator();

        }
    }

    public static void main(String args[]) {

        calculator();

    }
}
