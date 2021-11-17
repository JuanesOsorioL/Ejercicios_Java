package com.sofka.numeros.DecimoSexto_Punto;
import com.sofka.numeros.DecimoSexto_Punto.Persona.Persona;
import java.util.Scanner;
public class Personas {
    public void IniciarApp(){
        Scanner input=new Scanner(System.in);
        Persona primeraPersona;
        Persona segundaPersona;
        Persona terceraPersona;
        try {
            System.out.println("Bienvenido al punto numero 16");
            System.out.print("Ingresa tu Nombre: ");
            String nombre=input.nextLine();
            System.out.print("Ingresa tu Edad: ");
            int edad=input.nextInt();
            System.out.print("Ingresa tu Sexo digita: \n" +
                    "H = Hombre\nM = Mujer\n" +
                    "(Si ingresas otro valor por defecto es H): ");
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

            primeraPersona =new Persona(nombre,edad,sexo,peso,altura);
            segundaPersona =new Persona(nombre,edad,sexo);
            terceraPersona =new Persona();

            terceraPersona.setNombre("Carlos");
            terceraPersona.setEdad(55);
            terceraPersona.setPeso(100);
            terceraPersona.setSexo('M');
            terceraPersona.setAltura(1.78);

            System.out.println("\nLos Resultados son : ");

            System.out.println(primeraPersona);
            System.out.println(IMC(primeraPersona.calcularIMC()));
            System.out.println(Edad(primeraPersona.esMayorDeEdad()));
            System.out.println("-----------------------");

            System.out.println(segundaPersona);
            System.out.println(IMC(segundaPersona.calcularIMC()));
            System.out.println(Edad(segundaPersona.esMayorDeEdad()));
            System.out.println("-----------------------");

            System.out.println(terceraPersona);
            System.out.println(IMC(terceraPersona.calcularIMC()));
            System.out.println(Edad(terceraPersona.esMayorDeEdad()));
            System.out.println("-----------------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String IMC(int numero){
        String msj="";
        switch (numero){
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
