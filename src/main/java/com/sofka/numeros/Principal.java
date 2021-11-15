package com.sofka.numeros;
import com.sofka.numeros.Punto1.VariablesNumericas;
import com.sofka.numeros.Punto10.FraseEspacios;
import com.sofka.numeros.Punto11.FraseVocales;
import com.sofka.numeros.Punto12.PalabraDiferencias;
import com.sofka.numeros.Punto13.Fecha;
import com.sofka.numeros.Punto14.Numeros;
import com.sofka.numeros.Punto15.Menu;
import com.sofka.numeros.Punto16.EjecutaPersona;
import com.sofka.numeros.Punto17.Ejecutable;
import com.sofka.numeros.Punto18.EjecutaSerieVideo;
import com.sofka.numeros.Punto2.VariablesNumericas2;
import com.sofka.numeros.Punto3.AreaCirculo;
import com.sofka.numeros.Punto4.Iva;
import com.sofka.numeros.Punto5.ParImpar;
import com.sofka.numeros.Punto6.ParImparFor;
import com.sofka.numeros.Punto7.Comprobar;
import com.sofka.numeros.Punto8.SemanaLabora;
import com.sofka.numeros.Punto9.RemplazaTexto;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        boolean control=true;
        while (control){
            System.out.print("****** Taller Java ******** \n" +
                    "Ingrese un numero del 1 al 18 correspondiente a cada punto o ingrese 0 para Salir  \n" +
                    "Ingrese una opcion: ");
            int numero = input.nextInt();
            switch (numero){
                case 1:{
                    VariablesNumericas p1=new VariablesNumericas();
                    p1.Iniciar();
                    break;}
                case 2:{
                    VariablesNumericas2 p2=new VariablesNumericas2();
                    p2.Iniciar();
                    break;}
                case 3:{
                    AreaCirculo p3=new AreaCirculo();
                    p3.Iniciar();
                    break;}
                case 4:{
                    Iva p4=new Iva();
                    p4.Iniciar();
                    break;}
                case 5:{
                    ParImpar p5=new ParImpar();
                    p5.Iniciar();
                    break;}
                case 6:{
                    ParImparFor p6=new ParImparFor();
                    p6.Iniciar();
                    break;}
                case 7: {
                    Comprobar p7=new Comprobar();
                    p7.Iniciar();
                    break;}
                case 8: {
                    SemanaLabora p8=new SemanaLabora();
                    p8.Iniciar();
                    break;}
                case 9: {
                    RemplazaTexto p9=new RemplazaTexto();
                    p9.Iniciar();
                    break;}
                case 10: {
                    FraseEspacios p10=new FraseEspacios();
                    p10.Iniciar();
                    break;}
                case 11: {
                    FraseVocales p11=new FraseVocales();
                    p11.Iniciar();
                    break;}
                case 12: {
                    PalabraDiferencias p12=new PalabraDiferencias();
                    p12.Iniciar();
                    break;}
                case 13: {
                    Fecha p13=new Fecha();
                    p13.Iniciar();
                    break;}
                case 14: {
                    Numeros p14=new Numeros();
                    p14.Iniciar();
                    break;}
                case 15: {
                    Menu p15=new Menu();
                    p15.Iniciar();
                    break;}
                case 16: {
                    EjecutaPersona p16=new EjecutaPersona();
                    p16.Iniciar();
                    break;}
                case 17: {
                    Ejecutable p17=new Ejecutable();
                    p17.iniciar();
                    break;}
                case 18: {
                    EjecutaSerieVideo p18=new EjecutaSerieVideo();
                    p18.iniciar();
                    break;}
                case 0:{ control=false;break;}
                default:{
                    System.out.println(" OPCION INCORRECTO");
                }
            }
        }
    }
































}
