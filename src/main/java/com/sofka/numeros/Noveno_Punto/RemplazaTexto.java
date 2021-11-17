package com.sofka.numeros.Noveno_Punto;
import java.util.Scanner;
public class RemplazaTexto {
    private static final String TEXTO="La sonrisa sera la mejor arma contra la tristeza";
    public void IniciarApp(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 9");
        try{
            String frase=TEXTO.replace("a", "e");
            System.out.print("Ingrese una frase que quiera incluir: ");
            String palabra= input.nextLine();
            System.out.println(frase+" "+palabra+"\n");
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
