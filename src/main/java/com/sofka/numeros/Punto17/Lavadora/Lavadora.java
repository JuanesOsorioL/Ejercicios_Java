package com.sofka.numeros.Punto17.Lavadora;
import com.sofka.numeros.Punto17.SuperElectrodomestico.Electrodomestico;

public class Lavadora extends Electrodomestico {

    private static final int CARGA=5;

    private int carga;

    public Lavadora() {this.carga = CARGA;}

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = CARGA;
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {return carga;}

    public void precioFinal(){
    if (carga>30)
        setPrecioBase(getPrecioBase()+50);
    super.precioFinal();
    }

    @Override
    public String toString() {
        System.out.println(super.toString()+
                "       Lavadora { carga = " + carga +" kg }");
        return "";
    }
}
