public class Javat09 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        a = 29; b = 4;
        System.out.println("Remainder: " + (a % b));

        a = 5; b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);

        a = 5; b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);

        int num = 7;
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        num = -10;
        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        a = 10; b = 20;
        if (a > b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");

        a = 10; b = 20; int c = 30;
        if (a > b && a > c)
            System.out.println("a is greatest");
        else if (b > c)
            System.out.println("b is greatest");
        else
            System.out.println("c is greatest");

        int year = 2024;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");

        num = 55;
        if (num % 5 == 0 && num % 11 == 0)
            System.out.println("Divisible by 5 and 11");
        else
            System.out.println("Not divisible");

        char ch = 'e';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");

        num = 7;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");

        int age = 20;
        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible");

        int marks = 85;
        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 60)
            System.out.println("Grade C");
        else
            System.out.println("Fail");

        ch = 'A';
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else
            System.out.println("Not an alphabet");
    }
}
