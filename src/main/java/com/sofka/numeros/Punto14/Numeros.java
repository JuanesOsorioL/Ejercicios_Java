package com.sofka.numeros.Punto14;
import java.util.Scanner;
public class Numeros {
    public void Iniciar(){
        Scanner input=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = input.nextInt();
        for (int i = numero; i <= 1000; i=i+2) {
            System.out.println(i);
        }
    }
}
