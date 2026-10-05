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
public class LogaritmoNatural {

    public double calcular(double numero) {
        if (numero <= 0) {
            throw new ArithmeticException("El logaritmo natural requiere un numero mayor que cero");
        }

        return Math.log(numero);
    }
}