package com.sofka.numeros.Decimo_Punto;
import java.util.Scanner;
public class Espacios {
    public void IniciarApp(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 10");
        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine();
        System.out.println(frase.replace(" ", ""));
    }
}
