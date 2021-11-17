package com.sofka.numeros.Cuarto_Punto;
import java.util.Scanner;
public class Iva {
    public static void IniciarApp(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 4");
        try {
            System.out.print("Ingrese el Precio del Producto: ");
            while (!input.hasNextDouble()) {
                System.out.println("Precio no válido, Si tiene decimales separalo con ',' ");
                input.next();
                System.out.print("Ingrese el Precio del Producto: ");
            }
            double precio= input.nextDouble();
            double total=(precio+((precio*21)/100));
            System.out.print("El Precio final es: "+total+"\n");
        }catch (NumberFormatException event){
            System.out.println("ingrese solo numeros");
        }
    }
}
