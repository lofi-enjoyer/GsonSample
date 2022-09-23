package me.lofienjoyer.gsonsample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class GsonSample {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            System.out.print("Introduce el nombre: ");
            persona.setNombre(scanner.nextLine());

            System.out.print("Introduce los apellidos: ");
            persona.setApellidos(scanner.nextLine());

            System.out.print("Introduce la edad: ");
            persona.setEdad(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Error: El dato introducido no es válido.");
        }

        String json = gson.toJson(persona);
        System.out.println(json);
    }

}
