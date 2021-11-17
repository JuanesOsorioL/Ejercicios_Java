package com.sofka.numeros.Septimo_Punto;
import java.util.Scanner;
public class Comprobar {
    public  void IniciarApp(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 7");
        try {
            int numero;
            do {
                System.out.print("Ingrese un numero: ");
                numero = input.nextInt();
            } while (numero < 0); {
                System.out.println(numero==0?"Numero "+numero+" Es igual a 0 \n":"Numero "+numero+" Es mayor que 0 \n");
            }
        }catch (Exception e){
            System.out.println("ingrese solo numeros");
        }
    }

}
