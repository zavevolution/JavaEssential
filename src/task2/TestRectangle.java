package task2;


// Використовуючи IDEA, створіть проект із пакетом.
// Потрібно: Створити клас із ім'ям Rectangle.
// У тілі класу створити два поля, що описують довжини сторін double side1, double side2.
// Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2)
// і периметр прямокутника - double perimeterCalculator (double side1, double side2).
// Написати програму, яка приймає від користувача довжини двох сторін прямокутника
// і виводить на екран периметр та площу.


import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side1, side2;
        System.out.println("Введіть ширину прямокутника");
        side1 = in.nextDouble();
        System.out.println("Введіть висоту прямокутника");
        side2 = in.nextDouble();

        Rectangle rec = new Rectangle();
        double perimeter = rec.perimeterCalculator(side1, side2);
        double area = rec.areaCalculator(side1, side2);
        System.out.println("Периметер прямокутника " + perimeter + "\nПлоща прямокутника " + area);
    }
}
