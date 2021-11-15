package com.sofka.numeros.Punto1;
public class VariablesNumericas {
    public void Iniciar(){
        System.out.println("Bienvenido al punto numero 1");
        try {
            int valor=5;
            int valorDos=9;
            if (valor==valorDos){
                System.out.println("El numero: "+valor+", y el numero: "+valorDos+" son iguales.");
            }else{
                if (valor>valorDos) {
                    System.out.println(valor+" es mayor que "+valorDos);
                }else{
                    System.out.println(valorDos+" es mayor que "+valor);
                }
            }
        }catch (Exception e){
            System.out.println("ingrese solo numeros");
        }
    }
}


/*
 public void Iniciar(){
        System.out.println("Bienvenido al punto numero 1");
    }
 */