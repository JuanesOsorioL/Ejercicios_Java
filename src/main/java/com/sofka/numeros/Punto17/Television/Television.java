package com.sofka.numeros.Punto17.Television;
import com.sofka.numeros.Punto17.SuperElectrodomestico.Electrodomestico;
public class Television extends Electrodomestico {

    private static final int RESOLUCION=20;
    private static final boolean SINTONIZADOR=false;
    private int resolucion;
    private boolean TDT;

    public Television() {
        this.resolucion = RESOLUCION;
        this.TDT = SINTONIZADOR;
    }
    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION;
        this.TDT = SINTONIZADOR;
    }
    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean TDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {return resolucion;}
    public boolean isTDT() {return TDT;}
    public void precioFinal(){
        int valor=(getPrecioBase()*30)/100;
        if (resolucion>40)
            setPrecioBase(getPrecioBase()+valor);
        if (TDT)
            setPrecioBase(getPrecioBase()+50);
       super.precioFinal();
    }
   @Override
    public String toString() {
        System.out.println(super.toString()+ "       Television { resolucion = " + resolucion +" pulgadas, TDT = " + TDT +" }"+"\n"); ;
        return "";
    }
}
