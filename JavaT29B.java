

// class Student{
//     String name;
//     String age;
//     Student(String n, String a)
//     {
//         name = n;
//         age = a;
//     }
//     void print(){
//         System.out.println("Name : " + name + " Age : " + age);

//     }
// }
// public class JavaT29B{
//     public static void main(String[] args) {
//         Student s = new Student("Abhishek", "19");
//         s.print();
//     }
// }

// Area of Rectangle using Classes

// import javax.sound.sampled.SourceDataLine;

// class Rect{
//     int len;
//     int wid;
//     Rect(int l, int w)
//     {
//         len = l;
//         wid = w;
//     }
//     int area()
//     {
//         return len*wid;
//     }
// }

// public class JavaT29B{
//     public static void main(String[] args) {
//         Rect rect = new Rect(10, 15);
//         System.out.println("Rectangle area is: " + rect.area());
//     }
// }


// Question 1

// Create a class Student with fields name, rollNumber, and marks. Write a method to display
// student details. Create 3 student objects and display their data.

// class student {
//     String name;
//     String rollNumber;
//     int marks;

//     student(String n, String r, int m) {
//         name = n;
//         rollNumber = r;
//         marks = m;
//     }
//     void displayinfo()
//     {
//         System.out.println("Name: " + name + " Roll Number: " + rollNumber + " and marks are " + marks);
//     }
// }
// public class JavaT29B{
//     public static void main(String[] args)
//     {
//         student s1 = new student("Abhishek", "0246CS231O1O", 100);
//         s1.name = "Abhi";
//         student s2 = new student("Prince", "0246CS231158", 30);
//         student s3 = new student("Yogesh", "0246CS231234", 80);
//         s1.displayinfo();
//         s2.displayinfo();
//         s3.displayinfo();
//     }
// }


// Question 6
//Create a class Book with title, author, and price. Add a method to apply a discount of 10% and
// display the final price.

// class book{
//     String title;
//     String author;
//     double price;
//     double buyprice;
//     book(String t, String a, double p)
//     {
//         title = t;
//         author = a;
//         price = p;
//         buyprice = p;
//     }
//     void applydiscount(int rate)
//     {
//         buyprice -= price/rate;
//     }
//     void displaytotalamount()
//     {
//         System.out.println("Total is " + buyprice + " rs");
//     }
// }

// public class JavaT29B{
//     public static void main(String[] args)
//     {
//         book b = new book("Harry Potter", "Abhishek", 1000);
//         b.displaytotalamount();
//         b.applydiscount(10);
//         b.displaytotalamount();
//     }
// }


// Question 8
//  Create a class Movie with name, rating, and releaseYear. Create 5 movie objects and display
// movies released after 2020.

// class movie{
//     String name;
//     double rating;
//     int releaseYear;
//     movie(String n, double r, int ry){
//         name = n;
//         rating = r;
//         releaseYear = ry;
//     }
//     void display()
//     {
//         System.out.println("Name: " + name + " Rating: " + rating + " released in " + releaseYear);
//     }
// }

// public class JavaT29B{
//     public static void main(String[] args) {
//         movie[] films = new movie[5];
//         films[0] = new movie("InterStellar", 8.5, 2021);
//         films[1] = new movie("Inception", 7.2, 2019);
//         films[2] = new movie("Shawshank Redemption", 9.0, 2022);
//         films[3] = new movie("The Truman Show", 8.8, 2020);
//         films[4] = new movie("Dune", 8.0, 2023);

//         for (movie i: films)
//         {
//             if (i.rating >= 8.0)
//             {
//                 i.display();
//             }
//         }
//     }
// }

// class Comp{
//     String brand;
//     String RAM;
//     double price;

//     Comp(String b, String r, double p)
//     {
//         brand = b;
//         RAM = r;
//         price = p;
//     }
//     void displayinfo()
//     {
//         System.out.println("Brand: "+brand+" RAM: "+RAM+" at price "+price);
//     }
// }
// public class JavaT29B{
//     public static void main(String[] args) {
//         Comp c1 = new Comp("HP", "16GB", 53000);
//         c1.displayinfo();
//     }
// }