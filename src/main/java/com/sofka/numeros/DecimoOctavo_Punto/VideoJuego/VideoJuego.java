package com.sofka.numeros.DecimoOctavo_Punto.VideoJuego;
import com.sofka.numeros.DecimoOctavo_Punto.Entregable.Entregable;

public class VideoJuego implements Entregable {

    private static final int HORAS_ESTIMADAS=10;
    private static final boolean Entregado=false;

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public VideoJuego() {
        this.horasEstimadas = HORAS_ESTIMADAS;
        this.entregado = Entregado;
        this.titulo = "";
        this.genero = "";
        this.compania = "";
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = Entregado;
        this.genero = "";
        this.compania = "";
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = Entregado;
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getHorasEstimadas() {return horasEstimadas;}

    public void setHorasEstimadas(int horasEstimadas) {this.horasEstimadas = horasEstimadas;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public String getCompania() {return compania;}

    public void setCompania(String compania) {this.compania = compania;}

    @Override
    public String toString() {
        return "Videojuego { " +"\n"+
                "   titulo = '" + titulo + '\'' +"\n"+
                "   horasEstimadas = " + horasEstimadas +"\n"+
                "   entregado = " + entregado +"\n"+
                "   genero = '" + genero + '\'' +"\n"+
                "   compañia = '" + compania + '\'' +
                '}'+"\n";
    }

    public void entregar() {
        entregado=true;
    }

    public void devolver() {
        entregado=false;
    }

    public boolean isEntregado() {return entregado;}

    public boolean compareTo(Object a) {
        VideoJuego anterior=(VideoJuego)a;
        return horasEstimadas>anterior.getHorasEstimadas();
    }
}
