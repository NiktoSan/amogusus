/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author nikto
 */
public class Calc {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Сложение
        int sum = add(a, b);
        System.out.println("Сумма: " + sum);

        // Вычитание
        int difference = subtract(a, b);
        System.out.println("Разность: " + difference);

        // Умножение
        int product = multiply(a, b);
        System.out.println("Произведение: " + product);

        // Деление
        int quotient = divide(a, b);
        System.out.println("Частное: " + quotient);
    }
}
