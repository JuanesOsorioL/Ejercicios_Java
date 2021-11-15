package com.sofka.numeros.Punto9;
import java.util.Scanner;
public class RemplazaTexto {
    public void Iniciar(){
        Scanner input =new Scanner(System.in);
        String texto="La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Bienvenido al punto numero 9");
        try{
            String nuevafrase=texto.replace("a", "e");
            System.out.print("Ingrese una frase que quiera incluir: ");
            String frase= input.nextLine();
            System.out.println(nuevafrase+" "+frase+"\n");
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
