package com.sofka.numeros.Punto16.Persona;

import java.util.Random;

public class Persona {

    private static final int MAYOR=18;
    private static final int INICIALIZAR=0;
    private static final char SEXO='H';
    private static final char[] LETRAS={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private static final Random R=new Random();

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo ;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = INICIALIZAR;
        generaDNI();
        this.sexo = SEXO;
        this.peso = INICIALIZAR;
        this.altura = INICIALIZAR;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        generaDNI();
        this.peso = INICIALIZAR;
        this.altura = INICIALIZAR;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setEdad(int edad) {this.edad = edad;}

    public void setSexo(char sexo) {this.sexo = sexo;}

    public void setPeso(double peso) {this.peso = peso;}

    public void setAltura(double altura) {this.altura = altura;}

    public int calcularIMC(){
        int IMC= (int) (peso/(Math.pow(altura, 2)));
        if (IMC>=20 && IMC<=25)
            return  0;
        else if (IMC<20)
            return -1;
        else
            return 1;
    }

    public boolean esMayorDeEdad(){return edad>=MAYOR;}

    private char comprobarSexo(char sexo) {
        char UpperSexo=Character.toUpperCase(sexo);
        if (UpperSexo=='H' || UpperSexo=='M')
            return UpperSexo;
        else
            return 'H';
    }

    public String toString(){
        return  "Datos de Persona \n" +
                "DNI: "+DNI+"\n" +
                "Nombre: "+nombre+"\n" +
                "Edad: "+edad+"\n" +
                "Sexo: "+sexo+"\n" +
                "Peso: "+peso+"  kg.\n" +
                "altura: "+altura+" m.\n";
    }

    public void generaDNI(){
        String letras="";
        for (int i = 1; i <=8 ; i++) {
            letras += String.valueOf(LETRAS[R.nextInt(26)]);
        }
        DNI=letras;
    }
}

