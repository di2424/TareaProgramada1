package cr.ac.ulead.tda;

import Objetos.Person;

import java.io.PrintStream;
import java.util.Scanner;

public class Pila2 {
    private Scanner input = new Scanner(System.in);
    private PrintStream output = new PrintStream(System.out);

    Person[] person = new Person[50];

    String name;
    String lastName;
    String dateOfBirth;
    String weight;
    String height;
    int position=0;
    Person aux;

    public void push() {
        if (position == person.length - 1) {
            System.out.println("La pila está llena");
        } else {
            System.out.println("***Ingrese los datos de persona");
            System.out.println();
            System.out.println("Ingrese el nombre");
            name = input.nextLine();
            System.out.println("Ingrese el apellido");
            lastName = input.nextLine();
            System.out.println("Ingrese la fecha de nacimiento");
            dateOfBirth = input.nextLine();
            System.out.println("Ingrese el peso");
            weight = input.nextLine();
            System.out.println("Ingrese la estatura");
            height = input.nextLine();
            Person persona = new Person(name, lastName, dateOfBirth, weight, height);
            person[position] = persona;
            aux = persona;
            position++;
        }
    }

    public void lowerHeight(int position){
        if (position<=0){
            System.out.println("No hay elementos para mostrar");
            return;
        }
        if (Float.parseFloat(aux.getHeight()) > Float.parseFloat(person[position-1].getHeight())) {
                aux = person[position - 1];
        }

        lowerHeight(position-1);
    }
}
