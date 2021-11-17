package com.sofka.numeros.Octavo_Punto;
import java.util.Scanner;
public class SemanaLabora {
    public void IniciarApp(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 8");
        System.out.print("Ingrese el dia de la semana: ");
        String dia = input.next().toLowerCase();
        switch (dia){
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("si es un día laboral");
                break;
            case "sábado":
            case "sabado":
            case "domingo":{
                System.out.println("no es un día laboral");
                break;
            }
            default:{
                System.out.println("verifica el dia ingresado");
                break;
            }
        }
    }
}
