package com.sofka.numeros.Punto6;
public class ParImparFor {
    public void Iniciar(){
        System.out.println("Bienvenido al punto numero 6");
        for (int i = 1; i <=100; i++) {
            if (i%2==0)
                System.out.print(i+" Es Par \n");
            else
                System.out.print(i+" Es Impar \n");
        }
    }
}
