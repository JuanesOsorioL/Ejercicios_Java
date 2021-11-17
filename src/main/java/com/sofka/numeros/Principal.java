package com.sofka.numeros;
import com.sofka.numeros.Decimo_Punto.Espacios;
import com.sofka.numeros.Primer_Punto.Numero;
import com.sofka.numeros.Quinto_Punto.ImparPar;
import com.sofka.numeros.Undecimo_Punto.Vocales;
import com.sofka.numeros.Duodecimo_Punto.Diferencias;
import com.sofka.numeros.DecimoTercer_Punto.Fecha;
import com.sofka.numeros.DecimoCuarto_Punto.Numeros;
import com.sofka.numeros.DecimoQuinto_Punto.Menu;
import com.sofka.numeros.DecimoSexto_Punto.Personas;
import com.sofka.numeros.DecimoSeptimo_Punto.Electrodomesticos;
import com.sofka.numeros.DecimoOctavo_Punto.SerieVideo;
import com.sofka.numeros.Segundo_Punto.NumeroMayor;
import com.sofka.numeros.Tercer_Punto.AreaCirculo;
import com.sofka.numeros.Cuarto_Punto.Iva;
import com.sofka.numeros.Sexto_Punto.ParImpar;
import com.sofka.numeros.Septimo_Punto.Comprobar;
import com.sofka.numeros.Octavo_Punto.SemanaLabora;
import com.sofka.numeros.Noveno_Punto.RemplazaTexto;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int opcion=19;
        while (opcion!=0){
            System.out.print("****** Taller Java ******** \n" +
                    "Ingrese un numero del 1 al 18 correspondiente a cada punto o ingrese 0 para Salir  \n" +
                    "Ingrese una opcion: ");
            opcion = input.nextInt();
            switch (opcion){
                case 1:{
                    Numero numero=new Numero();
                    numero.IniciarApp();
                    break;}
                case 2:{
                    NumeroMayor numeroMayor=new NumeroMayor();
                    numeroMayor.IniciarApp();
                    break;}
                case 3:{
                    AreaCirculo areaCirculo=new AreaCirculo();
                    areaCirculo.IniciarApp();
                    break;}
                case 4:{
                    Iva iva=new Iva();
                    iva.IniciarApp();
                    break;}
                case 5:{
                    ImparPar imparPar=new ImparPar();
                    imparPar.IniciarApp();
                    break;}
                case 6:{
                    ParImpar parImpar=new ParImpar();
                    parImpar.IniciarApp();
                    break;}
                case 7: {
                    Comprobar comprobar=new Comprobar();
                    comprobar.IniciarApp();
                    break;}
                case 8: {
                    SemanaLabora semanaLaboral=new SemanaLabora();
                    semanaLaboral.IniciarApp();
                    break;}
                case 9: {
                    RemplazaTexto remplazarTexto=new RemplazaTexto();
                    remplazarTexto.IniciarApp();
                    break;}
                case 10: {
                    Espacios espacios=new Espacios();
                    espacios.IniciarApp();
                    break;}
                case 11: {
                    Vocales vocales=new Vocales();
                    vocales.IniciarApp();
                    break;}
                case 12: {
                    Diferencias diferencia=new Diferencias();
                    diferencia.IniciarApp();
                    break;}
                case 13: {
                    Fecha fecha=new Fecha();
                    fecha.IniciarApp();
                    break;}
                case 14: {
                    Numeros numeros=new Numeros();
                    numeros.IniciarApp();
                    break;}
                case 15: {
                    Menu menu=new Menu();
                    menu.IniciarApp();
                    break;}
                case 16: {
                    Personas personas=new Personas();
                    personas.IniciarApp();
                    break;}
                case 17: {
                    Electrodomesticos electrodomesticos=new Electrodomesticos();
                    electrodomesticos.IniciarApp();
                    break;}
                case 18: {
                    SerieVideo serieVideo=new SerieVideo();
                    serieVideo.IniciarApp();
                    break;}
                default:{
                    System.out.println(" OPCION INCORRECTO");
                }
            }
        }
    }
}
