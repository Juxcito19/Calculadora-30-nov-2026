/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class RaizCuadrada {

    public double calcular(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular la raiz cuadrada de un numero negativo");
        }

        return Math.sqrt(numero);
    }
}