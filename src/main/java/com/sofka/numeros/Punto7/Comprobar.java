package com.sofka.numeros.Punto7;
import java.util.Scanner;
public class Comprobar {
    public  void Iniciar(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 7");
        try {
            int Numero;
            do {
                System.out.print("Ingrese un numero: ");
                Numero = input.nextInt();
            } while (Numero < 0); {
                System.out.println(Numero==0?"Numero "+Numero+" Es igual a 0 \n":"Numero "+Numero+" Es mayor que 0 \n");
            }
        }catch (Exception e){
            System.out.println("ingrese solo numeros");
        }
    }

}
