package com.sofka.numeros.Quinto_Punto;
public class ImparPar {
    public void IniciarApp(){
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
