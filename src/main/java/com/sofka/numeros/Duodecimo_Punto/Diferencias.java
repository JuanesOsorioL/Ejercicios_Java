package com.sofka.numeros.Duodecimo_Punto;
import java.util.Scanner;
public class Diferencias {

    public void IniciarApp(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 12");
        System.out.print("Ingrese una palabra: ");
        String primera = input.nextLine();
        System.out.print("Ingrese otra palabra: ");
        String segunda = input.nextLine();
       if (primera.equals(segunda))
           System.out.println("las dos palabras ingresadas son iguales");
        else if (primera.length()==segunda.length()){
            System.out.println("las dos palabras ingresadas son diferentes,pero tienen el mismo tamaño\n" +
                    "Primera frase: "+primera+"\n"+
                    "Segunda frase: "+segunda+"\n");
            Letra(primera,segunda);
       }else
            System.out.println("las dos palabras ingresadas son diferentes y ademas tienen tamaño diferente\n" +
                    "Primera frase: "+primera+"\n"+
                    "Segunda frase: "+segunda+"\n");
    }

    public void Letra(String primera,String segunda){
        int cantidad=primera.length();
        for (int i = 0; i < cantidad; i++) {
            if (primera.charAt(i)!=segunda.charAt(i))
                System.out.println("En la posicion "+(i+1)+" de ambas frases tienen diferentes letras\n" +
                        "Primera frase: "+primera.charAt(i)+"\n"+
                        "Segunda frase: "+segunda.charAt(i)+"\n");
        }
    }
}
