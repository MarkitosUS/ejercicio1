package com.open_bootcamp;

import java.util.ArrayList;

public class Main {

   public static void main(String[] args){


       Coche miCoche = new Coche();
       miCoche.añadirPuerta();

       int param1 = 10;
       int param2 = 10;
       int param3 = 4;

       var valor = suma(param1, param2, param3);

       System.out.println(valor);
       System.out.println(  " Este vehiculo tiene "  + miCoche.puertas + " Puertas. ");

   }

    public static int suma(int a, int b, int c){

       return a + b + c;

    }
}