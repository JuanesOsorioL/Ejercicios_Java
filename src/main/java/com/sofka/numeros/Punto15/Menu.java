package com.sofka.numeros.Punto15;
import java.util.Scanner;
public class Menu {
    public  void Iniciar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido Punto numero 15");
        String texto="****** GESTION CINEMATOGRAFICA ******** \n" +
                "1-NUEVO ACTOR \n" +
                "2-BUSCAR ACTOR \n" +
                "3-ELIMINAR ACTOR \n" +
                "4-MODIFICAR ACTOR \n" +
                "5-VER TODOS LOS ACTORES \n" +
                "6- VER PELICULAS DE LOS ACTORES \n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n" +
                "8-SALIR \n" +
                "Ingrese una opcion: ";
        boolean control=true;
        while (control){
            System.out.print(texto);
            int numero = input.nextInt();
            switch (numero){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7: { break;}
                case 8:{ control=false;break;}
                default:{
                    System.out.println(" OPCION INCORRECTO");
                }
            }
        }
    }
}
