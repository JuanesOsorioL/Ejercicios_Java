package com.sofka.numeros.Punto17;
import com.sofka.numeros.Punto17.Lavadora.Lavadora;
import com.sofka.numeros.Punto17.SuperElectrodomestico.Electrodomestico;
import com.sofka.numeros.Punto17.Television.Television;
import java.util.ArrayList;
import java.util.List;
public class Ejecutable {
    private List<Electrodomestico> lista=new ArrayList<>();
    public void iniciar(){
        Electrodomestico e1=new Electrodomestico(100,"azul",'A',100);
        Lavadora l1=new Lavadora(50,"azul",'D',30,50);
        Television t1=new Television(300,"azul",'D',5,50,true);
        Electrodomestico e2=new Electrodomestico();
        Lavadora l2=new Lavadora();
        Television t2=new Television();
        lista.add(e1);
        lista.add(l1);
        lista.add(t1);
        lista.add(e2);
        lista.add(l2);
        lista.add(t2);
        lista.forEach(x->x.precioFinal());
        lista.forEach(x->x.toString());
        int cont = lista.stream().map(Electrodomestico::getPrecioBase).mapToInt(y -> y).sum();
        System.out.println("El precio final es de : "+cont+" € ");
    }
}
