package com.sofka.numeros.Primer_Punto;
public class Numero {
    public void IniciarApp(){
        System.out.println("Bienvenido al punto numero 1");
        try {
            int valorUno=5;
            int valorDos=9;
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