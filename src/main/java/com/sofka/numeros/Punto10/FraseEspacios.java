package com.sofka.numeros.Punto10;
import java.util.Scanner;
public class FraseEspacios {
    public void Iniciar(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 10");
        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine();
        System.out.println(frase.replace(" ", ""));
    }
}
