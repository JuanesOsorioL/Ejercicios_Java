package com.sofka.numeros.Punto3;
import java.util.Scanner;
public class AreaCirculo {
    public void Iniciar() {
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 3");
        try {
            System.out.print("Ingrese el Radio: ");
            while (!input.hasNextDouble()) {
                System.out.println("Radio no válido, Si tiene decimales separalo con ',' ");
                input.next();
                System.out.print("Ingrese el Radio: ");
            }
            double radio=input.nextDouble();
            double Area=Math.PI * Math.pow(radio,2);
            System.out.print("El Area de un Circulo es: "+Area+"\n");
        }catch (NumberFormatException event){
            System.out.println("ingrese solo numeros"+"\n");
        }
    }
}
