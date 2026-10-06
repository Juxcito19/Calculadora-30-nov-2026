/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Suma;
import Modelo.Resta;
import Modelo.Multiplicacion;
import Modelo.Division;
import Modelo.RaizCuadrada;
import Modelo.RaizCubica;
import Modelo.LogaritmoNatural;

public class CalculadoraControlador {

    private Suma suma;
    private Resta resta;
    private Multiplicacion multiplicacion;
    private Division division;
    private RaizCuadrada raizCuadrada;
    private RaizCubica raizCubica;
    private LogaritmoNatural logaritmoNatural;

    public CalculadoraControlador() {
        suma = new Suma();
        resta = new Resta();
        multiplicacion = new Multiplicacion();
        division = new Division();
        raizCuadrada = new RaizCuadrada();
        raizCubica = new RaizCubica();
        logaritmoNatural = new LogaritmoNatural();
    }
    public double sumar(double a, double b) {
    return suma.calcular(a, b);
}

public double restar(double a, double b) {
    return resta.calcular(a, b);
}

public double multiplicar(double a, double b) {
    return multiplicacion.calcular(a, b);
}

public double dividir(double a, double b) {
    return division.calcular(a, b);
}
}
