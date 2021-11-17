package com.sofka.numeros.Segundo_Punto;
import java.util.Scanner;
public class NumeroMayor {
    public void IniciarApp(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 2");
        try {
            System.out.print("Ingrese el primer numero: ");
            int valorUno=input.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            int valorDos=input.nextInt();
            if (valorUno==valorDos){
                System.out.println("El numero: "+valorUno+", y el numero: "+valorDos+" son iguales.");
            }else{
                if (valorUno>valorDos) {
                    System.out.println(valorUno+" es mayor que "+valorDos);
                }else{
                    System.out.println(valorDos+" es mayor que "+valorUno);
                }
            }
        }catch (Exception e){
            System.out.println("ingrese solo numeros");
        }
    }
}
