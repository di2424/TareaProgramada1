package Objetos;

import java.io.PrintStream;
import java.util.Scanner;

public class Funciones {
    private Scanner input = new Scanner(System.in);
    private PrintStream output = new PrintStream(System.out);


    public Person newPerson(){
        System.out.println("***Ingrese los datos de persona");
        System.out.println();
        System.out.println("Ingrese el nombre");
        String name = (String)input.nextLine();
        System.out.println("Ingrese el apellido");
        String lastName = input.nextLine();
        System.out.println("Ingrese la fecha de nacimiento");
        String dateOfBirth = input.nextLine();
        System.out.println("Ingrese el peso");
        String weight = input.nextLine();
        System.out.println("Ingrese la estatura");
        String height = input.nextLine();
       return new Person (name, lastName, dateOfBirth, weight, height);
    }
    public Pet newPet(){
        System.out.println("***Ingrese los datos de mascota***");
        System.out.println();
        System.out.println("Ingrese el nombre: ");
        String name = input.nextLine();
        System.out.println("Ingrese el tipo de animal: ");
        String typeOfAnimal = input.nextLine();
        System.out.println("Ingrese la edad: ");
        int age = input.nextInt();
        return new Pet(name,typeOfAnimal,age);
    }
}
