package com.sofka.numeros.Punto2;

import java.util.Scanner;

public class VariablesNumericas2 {
    public void Iniciar(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 2");
        try {
            System.out.print("Ingrese el primer numero: ");
            int valor=input.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            int valorDos=input.nextInt();
            if (valor==valorDos){
                System.out.println("El numero: "+valor+", y el numero: "+valorDos+" son iguales.");
            }else{
                if (valor>valorDos) {
                    System.out.println(valor+" es mayor que "+valorDos);
                }else{
                    System.out.println(valorDos+" es mayor que "+valor);
                }
            }
        }catch (Exception e){
            System.out.println("ingrese solo numeros");
        }
    }
}
