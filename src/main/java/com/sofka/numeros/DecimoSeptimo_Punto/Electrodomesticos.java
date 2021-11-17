package com.sofka.numeros.DecimoSeptimo_Punto;
import com.sofka.numeros.DecimoSeptimo_Punto.Lavadora.Lavadora;
import com.sofka.numeros.DecimoSeptimo_Punto.Electrodomestico.Electrodomestico;
import com.sofka.numeros.DecimoSeptimo_Punto.Television.Television;
import java.util.ArrayList;
import java.util.List;
public class Electrodomesticos {
    private List<Electrodomestico> lista=new ArrayList<>();
    public void IniciarApp(){
        Electrodomestico primero=new Electrodomestico(100,"azul",'A',100);
        Lavadora tercero=new Lavadora(50,"azul",'D',30,50);
        Television quinto=new Television(300,"azul",'D',5,50,true);
        Electrodomestico segundo=new Electrodomestico();
        Lavadora cuarto=new Lavadora();
        Television sexto=new Television();
        Electrodomestico septimo=new Electrodomestico(40,80);
        Lavadora octavo=new Lavadora(40,78);
        Television noveno=new Television(89,46);
        Electrodomestico decimo=new Electrodomestico(400,850);
        lista.add(primero);
        lista.add(tercero);
        lista.add(quinto);
        lista.add(segundo);
        lista.add(cuarto);
        lista.add(sexto);
        lista.add(septimo);
        lista.add(octavo);
        lista.add(noveno);
        lista.add(decimo);
        lista.forEach(x->x.precioFinal());
        lista.forEach(x->x.toString());
        int acumulador = lista.stream().map(Electrodomestico::getPrecioBase).mapToInt(y -> y).sum();
        System.out.println("\nEl precio final es de : "+acumulador+" € \n");
    }
}
