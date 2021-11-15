package com.sofka.numeros.Punto11;
import java.util.Scanner;
public class FraseVocales {
    public static void Iniciar(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bienvenido al punto numero 11");
        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine().toLowerCase();
        int a=0,e=0,i=0,o=0,u=0;
        for (int j = 0; j < frase.length(); j++) {
            switch (frase.charAt(j)){
                case 'u':{u++;break;}
                case 'a':{a++;break;}
                case 'e':{e++;break;}
                case 'i':{i++;break;}
                case 'o':{o++;break;}
                default:{
                }
            }
        }
        System.out.println("La longitud de esta frase es: "+frase.length()+"\n" +
                "La frase tiene: \n" +
                a+" vocales 'a' \n" +
                e+" vocales 'e' \n" +
                i+" vocales 'i' \n" +
                o+" vocales 'o' \n" +
                u+" vocales 'u' \n" +
                "");
    }
}
