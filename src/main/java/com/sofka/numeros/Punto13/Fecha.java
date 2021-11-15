package com.sofka.numeros.Punto13;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Fecha {
    public void Iniciar(){
        LocalDateTime Fecha = LocalDateTime.now();
        DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("(yyyy/MM/dd)(HH:mm:ss)");
        String formattedDate = Fecha.format(FormatoFecha);
        System.out.println(formattedDate);
    }
}
