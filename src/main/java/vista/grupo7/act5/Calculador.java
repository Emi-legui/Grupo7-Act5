/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.grupo7.act5;

/**
 *
 * @author FRANCO
 */
public class Calculador {

    public Calculador() {
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int dividendo, int divisor) {
        if (divisor == 0 || divisor == 0 & dividendo == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero");
        }
        return dividendo / divisor;
    }
}
