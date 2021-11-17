package com.sofka.numeros.Tercer_Punto;
import java.util.Scanner;
public class AreaCirculo {
    public void IniciarApp() {
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
            double area=Math.PI * Math.pow(radio,2);
            System.out.print("El Area de un Circulo es: "+area+"\n");
        }catch (NumberFormatException event){
            System.out.println("ingrese solo numeros"+"\n");
        }
    }
}
