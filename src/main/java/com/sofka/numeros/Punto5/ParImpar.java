package com.sofka.numeros.Punto5;
public class ParImpar {
    public void Iniciar(){
        System.out.println("Bienvenido al punto numero 5");
        int numero=1;
        while (numero<=100){
            if (numero%2==0)
                System.out.print(numero+" Es Par \n");
            else
                System.out.print(numero+" Es Impar \n");
            numero++;
        }
    }
}
