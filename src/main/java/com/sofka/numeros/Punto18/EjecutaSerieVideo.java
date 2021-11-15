package com.sofka.numeros.Punto18;

import com.sofka.numeros.Punto18.Serie.Serie;
import com.sofka.numeros.Punto18.VideoJuego.Videojuego;
import java.util.ArrayList;
import java.util.List;

public class EjecutaSerieVideo {
    private List<Serie> series=new ArrayList<>();
    private List<Videojuego> videojuegos=new ArrayList<>();

    public void iniciar(){

        Serie s1=new Serie();
        Serie s2=new Serie("Juego de tronos", "George R. R. Martin ");
        Serie s3=new Serie("La Casa De Papel", 5, "Suspenso", "talex Pina");
        Serie s4=new Serie("The Walking Dead", 11 ,"Horror", "Frank Darabont");
        Serie s5=new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
        series.add(s1);
        series.add(s2);
        series.add(s3);
        series.add(s4);
        series.add(s5);
        Videojuego v1=new Videojuego();
        Videojuego v2=new Videojuego("Pro Evolution Soccer 2021", 30, "Fútbol", "Konami");
        Videojuego v3=new Videojuego("God of war 3", 45);
        Videojuego v4=new Videojuego("Grand Theft Auto 6", 300, "Aventura", "Rockstar Games");
        Videojuego v5=new Videojuego("Final fantasy X", 200, "Rol", "Square Enix");
        videojuegos.add(v1);
        videojuegos.add(v2);
        videojuegos.add(v3);
        videojuegos.add(v4);
        videojuegos.add(v5);
        //se cambia el estado de entregado
        s2.entregar();
        s4.entregar();
        v1.entregar();
        v3.entregar();
        v5.entregar();
        //se cuentan los que se cambiaron el estado y se muestran
        System.out.println("La cantidad de Series entregados son : "+series.stream().filter(x->x.isEntregado()==true).count());
        series.stream().filter(x->x.isEntregado()==true).forEach(System.out::println);
        System.out.println("La cantidad de Video Juegos entregados son : "+videojuegos.stream().filter(x->x.isEntregado()==true).count());
        videojuegos.stream().filter(x->x.isEntregado()==true).forEach(System.out::println);
        //cual tiene mayor horas o temporadas
        Serie serieMayor=series.get(0);
        Videojuego videojuegoMayor=videojuegos.get(0);
        for (int i = 1; i < 5; i++) {
            if(series.get(i).compareTo(serieMayor)){
                serieMayor=series.get(i);
            }
        }
        for (int i = 1; i < 5; i++) {
            if(videojuegos.get(i).compareTo(videojuegoMayor)){
                videojuegoMayor=videojuegos.get(i);
            }
        }
        System.out.println("la Serie que tiene mas Temporadas es: \n"+serieMayor+"\n");
        System.out.println("El Video Juego con mas Horas es : \n"+videojuegoMayor+"\n");
        }
}
