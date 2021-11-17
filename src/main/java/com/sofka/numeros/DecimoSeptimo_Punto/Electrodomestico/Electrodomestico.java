package com.sofka.numeros.DecimoSeptimo_Punto.Electrodomestico;
import java.util.Arrays;
public class Electrodomestico {

    private static final int PRECIOBASE=100;
    private static final int PESO=5;
    private static final String COLOR="blanco";
    private static final char CONSUMO='F';
    private static final String LETRAS[]={"A","B","C","D","E","F"};
    private static final String COLORES[]={"blanco", "negro", "rojo", "azul", "gris"};

    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
        this.precioBase = PRECIOBASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO;
        this.peso = PESO;
    }
    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO;
        this.peso = peso;
    }
    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public int getPrecioBase() {return precioBase;}

    public String getColor() {return color;}

    public char getConsumoEnergetico() {return consumoEnergetico;}

    public int getPeso() {return peso;}

    public void setPrecioBase(int precioBase) {this.precioBase = precioBase;}

    private char comprobarConsumoEnergetico(char letra){
        char UpperLetra=Character.toUpperCase(letra);
        int cantidad= (int) Arrays.stream(LETRAS).filter(x->(x).equals(String.valueOf(UpperLetra))).count();
        if (cantidad==1)
           return UpperLetra;
        else
            return 'A';
    }

    private String comprobarColor(String color){
        String LowerColor=color.toLowerCase();
        int cantidad= (int) Arrays.stream(COLORES).filter(x->x.equals(LowerColor)).count();
        if (cantidad==1)
            return LowerColor;
        else
            return "blanco";
    }

    public void calcularConsumo(){
        switch (consumoEnergetico){
            case 'A':{precioBase+=100;break;}
            case 'B':{precioBase+=80;break;}
            case 'C':{precioBase+=60;break;}
            case 'D':{precioBase+=50;break;}
            case 'E':{precioBase+=30;break;}
            case 'F':{precioBase+=10;break;}
        }
    }

    public void calcularPeso(){
        if (peso>=0&&peso<=19)
            precioBase+=10;
        else if (peso>=20&&peso<=49)
            precioBase+=50;
        else if (peso>=50&&peso<=79)
            precioBase+=80;
        else if (peso>=80)
            precioBase+=100;
    }

    public void precioFinal(){
        calcularConsumo();
        calcularPeso();
    }

   @Override
    public String toString() {
        System.out.println("\n Electrodoméstico { " +"\n"+
                "   Precio Base = " + precioBase +" € \n"+
                "   Color = " + color +"\n"+
                "   Consumo Energetico = " + consumoEnergetico +"\n"+
                "   Peso = " + peso +" kg }");
        return "";
    }
}
