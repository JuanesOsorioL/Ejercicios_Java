package com.sofka.numeros.DecimoTercer_Punto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Fecha {
    public void IniciarApp(){
        LocalDateTime Fecha = LocalDateTime.now();
        DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("(yyyy/MM/dd)(HH:mm:ss)");
        String formattedDate = Fecha.format(FormatoFecha);
        System.out.println(formattedDate);
    }
}
