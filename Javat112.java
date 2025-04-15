import java.util.Scanner;

public class Javat112 {
    public static void main(String[] args) {


        // Printing weekday as per user input
        // int day;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter day number (1-7): ");
        // day = sc.nextInt();
        // switch(day)
        // {
        //     case 1: System.out.println("Monday"); break;
        //     case 2: System.out.println("Tuesday"); break;
        //     case 3: System.out.println("Wednesday"); break;
        //     case 4: System.out.println("Thursday"); break;
        //     case 5: System.out.println("Friday"); break;
        //     case 6: System.out.println("Saturday"); break;
        //     case 7: System.out.println("Sunday"); break;
        //     default: System.out.println("Invalid day");
        // }





        // Simple Calculator


        // int a, b, op;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter two numbers: ");
        // a = sc.nextInt();
        // b = sc.nextInt();
        // System.out.print("Enter operation + , - , * , / : ");
        // op = sc.next().charAt(0);
        // switch (op) {
        //     case '+':
        //         System.out.println("Addition: " + (a + b));
        //         break;
        //     case '-':
        //         System.out.println("Subtraction: " + (a - b));
        //         break;
        //     case '*':
        //         System.out.println("Multiplication: " + (a * b));
        //         break;
        //     case '/':
        //         if (b != 0) {
        //             System.out.println("Division: " + String.format("%.2f", (double)a / b));
        //         } else {
        //             System.out.println("Cannot divide by zero");
        //         }
        //         break;
        //     default:
        //         System.out.println("Invalid operation");
        // }
        // sc.close();





        // Print number in words
        // int n;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number (0-10): ");
        // n = sc.nextInt();

        // switch(n)
        // {
        //     case 0: System.out.println("Zero"); break;
        //     case 1: System.out.println("One"); break;
        //     case 2: System.out.println("Two"); break;
        //     case 3: System.out.println("Three"); break;
        //     case 4: System.out.println("Four"); break;
        //     case 5: System.out.println("Five"); break;
        //     case 6: System.out.println("Six"); break;
        //     case 7: System.out.println("Seven"); break;
        //     case 8: System.out.println("Eight"); break;
        //     case 9: System.out.println("Nine"); break;
        //     case 10: System.out.println("Ten"); break;
        //     default: System.out.println("Invalid number"); 
        // }
        // sc.close();
        



        // Greeting User with their name
        // String name;
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // name = s.next();

        // System.out.println("Hello, " + name);
        // s.close();


        // Loops in Java
        // Pattern
        // *
        // **
        // ***
        // ****
        // *****
        // for (int i = 0; i < 5; i++)
        // {
        //     for (int j = 0; j <= i; j++)
        //         System.out.print("*");
        //     System.out.println();
        // }

        // Pattern
        // *****
        //  ****
        //   ***
        //    **
        //     *
        
        // for (int i = 0; i < 5; i++)
        // {
        //     for (int j = 5-i; j > 0; j--)
        //         System.out.print("*");
        //     System.out.println();
        // }

        // Triangle Pattern
        //     *     
        //    ***    
        //   *****   
        //  *******  
        // ********* 
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for (int i = 0; i < num; i+=2){
            for (int a = 0; a < (num-i)/2; a++){
                System.out.print(" ");
            }
            for (int b = 0; b <= i; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();





        // int a = 2;
        // while(a<5){
        //     System.out.println("While Loop"); a++;
        // }


        // Do while Loop
        // int a;
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter num betwen (0-10)");
        // do {
        //     a = s.nextInt();
        // } while(a<0 || a>10);
        // System.out.println("Value entered is: " + a);
        // s.close();
    }
}
