package task2;

// Використовуючи IDEA, створіть проект із пакетом.
// Потрібно: Створити клас із ім'ям Rectangle.
// У тілі класу створити два поля, що описують довжини сторін double side1, double side2.
// Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2)
// і периметр прямокутника - double perimeterCalculator (double side1, double side2).
// Написати програму, яка приймає від користувача довжини двох сторін прямокутника
// і виводить на екран периметр та площу.

public class Rectangle {
    double side1;
    double side2;

    double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    double perimeterCalculator(double side1, double side2) {
        return side1 * 2 + side2 * 2;
    }
}
