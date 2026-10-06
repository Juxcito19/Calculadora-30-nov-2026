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
}