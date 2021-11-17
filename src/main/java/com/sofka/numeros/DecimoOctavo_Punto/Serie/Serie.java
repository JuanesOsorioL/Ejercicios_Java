package com.sofka.numeros.DecimoOctavo_Punto.Serie;
import com.sofka.numeros.DecimoOctavo_Punto.Entregable.Entregable;

public class Serie implements Entregable{

    private static final int NUMEROTEMPORADAS=3;
    private static final boolean ENTREGADO=false;

    public String título;
    public int numeroDeTemporadas;
    public boolean entregado;
    public String genero;
    public String creador;

    public Serie() {
        this.numeroDeTemporadas = NUMEROTEMPORADAS;
        this.entregado = ENTREGADO;
        this.título="";
        this.genero="";
        this.creador="";
    }

    public Serie(String título, String creador) {
        this.título = título;
        this.numeroDeTemporadas = NUMEROTEMPORADAS;
        this.entregado = ENTREGADO;
        this.creador = creador;
        this.genero="";
    }

    public Serie(String título, int numeroDeTemporadas, String genero, String creador) {
        this.título = título;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = ENTREGADO;
    }

    public String getTítulo() {return título;}

    public void setTítulo(String título) {this.título = título;}

    public int getNumeroDeTemporadas() {return numeroDeTemporadas;}

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {this.numeroDeTemporadas = numeroDeTemporadas;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public String getCreador() {return creador;}

    public void setCreador(String creador) {this.creador = creador;}

    @Override
    public String toString() {
        return "Serie { " +"\n"+
                "   título = '" + título + '\'' +"\n"+
                "   numeroDeTemporadas = " + numeroDeTemporadas +"\n"+
                "   entregado = " + entregado +"\n"+
                "   genero = '" + genero + '\'' +"\n"+
                "   creador = '" + creador + '\'' +
                '}'+"\n";
    }

    public void entregar() {entregado=true;}

    public void devolver() {entregado=false;}

    public boolean isEntregado() {return entregado;}

    public boolean compareTo(Object a) {
        Serie anterior=(Serie)a;
        return numeroDeTemporadas>anterior.getNumeroDeTemporadas();
    }
}
