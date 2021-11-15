package com.sofka.numeros.Punto12;
import java.util.Scanner;
public class PalabraDiferencias {
    public void Iniciar(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 12");
        System.out.print("Ingrese una palabra: ");
        String palabra = input.nextLine();
        System.out.print("Ingrese otra palabra: ");
        String palabraDos = input.nextLine();
       if (palabra.equals(palabraDos))
           System.out.println("las dos palabras ingresadas son iguales");
        else if (palabra.length()==palabraDos.length())
            System.out.println("las dos palabras ingresadas son diferentes y ademas tienen el mismo tamaño");
        else
            System.out.println("las dos palabras ingresadas son diferentes y ademas tienen tamaño diferente");
    }
}
