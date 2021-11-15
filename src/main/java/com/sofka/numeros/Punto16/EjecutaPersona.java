package com.sofka.numeros.Punto16;
import com.sofka.numeros.Punto16.Persona.Persona;
import java.util.Scanner;
public class EjecutaPersona {
    public void Iniciar(){
        Scanner input=new Scanner(System.in);
        Persona P1;
        Persona P2;
        Persona P3;

        try {
            System.out.println("Bienvenido al punto numero 16");
            System.out.print("Ingresa tu Nombre: ");
            String nombre=input.nextLine();
            System.out.print("Ingresa tu Edad: ");
            int edad=input.nextInt();
            System.out.print("Ingresa tu Sexo digita: \nH = Hombre\nM = Mujer\n(Si ingresas otro valor por defecto es H): ");
            char sexo=input.next().charAt(0);
            System.out.print("Ingresa tu Peso, Si tiene decimales separalo con ',' : ");
            while (!input.hasNextDouble()) {
                System.out.println("Valor no válido, Si tiene decimales separalo con ',' ");
                input.next();
                System.out.print("Ingresa tu Peso: ");
            }
            double peso=input.nextDouble();
            System.out.print("Ingresa tu Altura, Si tiene decimales separalo con ',': ");
            while (!input.hasNextDouble()) {
                System.out.println("Valor no válido, Si tiene decimales separalo con ',' ");
                input.next();
                System.out.print("Ingresa tu Altura: ");
            }
            double altura=input.nextDouble();

            P1 =new Persona(nombre,edad,sexo,peso,altura);
            P2 =new Persona(nombre,edad,sexo);
            P3 =new Persona();

            P3.setNombre("Carlos");
            P3.setEdad(55);
            P3.setPeso(100);
            P3.setSexo('M');
            P3.setAltura(1.78);

            System.out.println("\nLos Resultados son : ");

            System.out.println(P1.toString());
            System.out.println(Iniciar(P1.calcularIMC()));
            System.out.println(Edad(P1.esMayorDeEdad()));
            System.out.println("-----------------------");

            System.out.println(P2.toString());
            System.out.println(Iniciar(P2.calcularIMC()));
            System.out.println(Edad(P2.esMayorDeEdad()));
            System.out.println("-----------------------");

            System.out.println(P3.toString());
            System.out.println(Iniciar(P3.calcularIMC()));
            System.out.println(Edad(P3.esMayorDeEdad()));
            System.out.println("-----------------------");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String Iniciar(int num){
        String msj="";
        switch (num){
            case 0: {msj= "Estás por debajo de su peso ideal, tienes que comer mas!!";break;}
            case 1: {msj= "Estás por encima de tu peso ideal, tienes sobrepeso!!";break;}
            default:{msj= "Estás en tu peso ideal, Felicitaciones!!";break;}
            }
        return msj;
        }

    public String Edad(boolean control){
        return control?"Si es mayor de edad\n":"No eres mayor de edad\n";
    }

}
