package org.example;

import org.example.modelos.Seguro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Seguro seguro = new Seguro();
        seguro.setNombreAsegurado("Rita Carvajal");
        seguro.setEdadAsegurado(65);
        seguro.setMontoCobertura(20000000);

        seguro.calcularPrima();




    }
}