package com.sofka.numeros.DecimoOctavo_Punto;

import com.sofka.numeros.DecimoOctavo_Punto.Serie.Serie;
import com.sofka.numeros.DecimoOctavo_Punto.VideoJuego.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class SerieVideo {
    private List<Serie> series=new ArrayList<>();
    private List<VideoJuego> videojuegos=new ArrayList<>();

    public void IniciarApp(){

        Serie serieDefault=new Serie();
        Serie serieTronos=new Serie("Juego de tronos", "George R. R. Martin ");
        Serie serieCasa=new Serie("La Casa De Papel", 5, "Suspenso", "talex Pina");
        Serie serieZombi=new Serie("The Walking Dead", 11 ,"Horror", "Frank Darabont");
        Serie serieBad=new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
        series.add(serieDefault);
        series.add(serieTronos);
        series.add(serieCasa);
        series.add(serieZombi);
        series.add(serieBad);
        VideoJuego videoDefault=new VideoJuego();
        VideoJuego videoSoccer=new VideoJuego("Pro Evolution Soccer 2021", 30, "Fútbol", "Konami");
        VideoJuego videoGog=new VideoJuego("God of war 3", 45);
        VideoJuego videoAuto=new VideoJuego("Grand Theft Auto 6", 300, "Aventura", "Rockstar Games");
        VideoJuego videoFantasy=new VideoJuego("Final fantasy X", 200, "Rol", "Square Enix");
        videojuegos.add(videoDefault);
        videojuegos.add(videoSoccer);
        videojuegos.add(videoGog);
        videojuegos.add(videoAuto);
        videojuegos.add(videoFantasy);
        //se cambia el estado de entregado
        serieTronos.entregar();
        serieZombi.entregar();
        videoDefault.entregar();
        videoGog.entregar();
        videoFantasy.entregar();
        //se cuentan los que se cambiaron el estado y se muestran
        System.out.println("La cantidad de Series entregados son : "+series.stream().filter(x->x.isEntregado()==true).count());
        series.stream().filter(x->x.isEntregado()==true).forEach(System.out::println);
        System.out.println("La cantidad de Video Juegos entregados son : "+videojuegos.stream().filter(x->x.isEntregado()==true).count());
        videojuegos.stream().filter(x->x.isEntregado()==true).forEach(System.out::println);
        //cual tiene mayor horas o temporadas
        Serie serieMayor=series.get(0);
        VideoJuego videojuegoMayor=videojuegos.get(0);
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
