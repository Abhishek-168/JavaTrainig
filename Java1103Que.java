import java.util.Scanner;

public class Java1103Que {
    public static void main(String[] args)
    {
        //Q1
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        if (a==0)
            System.out.println("Zero");
        else if (a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        s.close();

        // Q2
        // int b;
        // Scanner s = new Scanner(System.in);
        // b = s.nextInt();
        // if (a>0)
        //     System.out.println("Positive");
        // else if (a<0)
        //     System.out.println("Negative");
        // else
        //     System.out.println("Zero");
        // s.close();

        // Q3
        // int p , q;
        // Scanner s = new Scanner(System.in);
        // p = s.nextInt();
        // q = s.nextInt();
        // if (p==q)
        //     System.out.println("Equal");
        // else if (p>q)
        //     System.out.println("Greater");
        // else
        //     System.out.println("Smaller");
        // s.close();

        //Q4
        // char ch;
        // Scanner s = new Scanner(System.in);
        // ch = s.next().charAt(0);
        // switch(ch)
        // {
        //     case 'a':
        //     case 'e':
        //     case 'i':
        //     case 'o':
        //     case 'u':
        //         System.out.println("Vowel");
        //         break;
        //     default:
        //         System.out.println("Consonant");
        // }
        // s.close();  

        //Q5
        // int n;
        // Scanner s = new Scanner(System.in);
        // n = s.nextInt();
        // for (int i = 1; i < n; i++)
        // {
        //     System.out.println(i);
        // }
        // s.close();

        //Q6
        // int n, sum = 0;
        // Scanner s = new Scanner(System.in);
        // n = s.nextInt();
        // for (int i = 0; i < n; i++)
        // {
        //     sum += i;
        // }
        // System.out.println("Sum = " + sum);
        // s.close();

        //Q7
        // Scanner sc = new Scanner(System.in);
        // int base = sc.nextInt();
        // for (int i = 1; i <= 10; i++)
        //     System.out.println(base + " * " + i + " = " + base * i);
        // sc.close();

        //Q8
        // Scanner sc = new Scanner(System.in);
        // int value = sc.nextInt();
        // if (value % 5 == 0 && value % 11 == 0)
        //     System.out.println("Divisible by 5 and 11");
        // else
        //     System.out.println("Not divisible by 5 and 11");
        // sc.close();

        //Q9
        // float f = (float) 2.4;
        // int d = (int)f;
        // System.out.println(d);
        // System.out.println(f);

        //Q10
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num%3==0)
        //     System.out.println("Divisible by 3");
        // else
        //     System.out.println("Not divisible by 3");
        // sc.close();

        //Q11
        // Scanner sc = new Scanner(System.in);
        // char inputChar = sc.next().charAt(0);
        // System.out.println("ASCII: " + (int)inputChar);

        
        //Q12
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(), fact = 1;
        // for (int i = 1; i <= n; i++)
        //     fact *= i;
        // System.out.println("Factorial: " + fact);
    
        // Q13
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt(), rev = 0;
        // while (num != 0) {
        //     rev = rev * 10 + num % 10;
        //     num /= 10;
        // }
        // System.out.println("Reversed: " + rev);

        // Q14
        // Scanner sc = new Scanner(System.in);
        // int val = sc.nextInt();
        // boolean isPrime = val > 1;
        // for (int i = 2; i <= val / 2; i++) {
        //     if (val % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }
        // System.out.println(isPrime ? "Prime" : "Not Prime");
    
        //Q15
        // Scanner sc = new Scanner(System.in);
        // double num1 = sc.nextDouble();
        // double num2 = sc.nextDouble();
        // char op = sc.next().charAt(0);
        // switch(op) {
        //     case '+':
        //         System.out.println("Result: " + (num1 + num2));
        //         break;
        //     case '-':
        //         System.out.println("Result: " + (num1 - num2));
        //         break;
        //     case '*':
        //         System.out.println("Result: " + (num1 * num2));
        //         break;
        //     case '/':
        //         if (num2 != 0)
        //             System.out.println("Result: " + (num1 / num2));
        //         else
        //             System.out.println("Cannot divide by zero");
        //         break;
        //     default:
        //         System.out.println("Invalid Operator");
    
        // Extra Time Coding
        // Printing a reloading buffer
        
    }
}
