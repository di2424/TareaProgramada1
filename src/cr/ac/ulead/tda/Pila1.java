package cr.ac.ulead.tda;

import Objetos.Person;

import java.io.PrintStream;
import java.util.Scanner;

public class Pila1 {
    private Scanner input = new Scanner(System.in);
    private PrintStream output = new PrintStream(System.out);
    Person[] person = new Person[10];

    String name;
    String lastName;
    String dateOfBirth;
    String weight;
    String height;
    int position = 0;

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
            person[position] = persona; //new Person(name, lastName, dateOfBirth, weight, height);
            System.out.println(person[0].serializadorJSON());
            position++;
        }
    }

    public void pop() {
        if (position == 0) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Se removio un elemento de la pila");
            System.out.println("El elemento que se removio fue: " + person[position].serializadorXML());
            person[position] = null;

            position --;
        }
    }
    public void showPila() {
       for (int i=0; i< person.length; i++){
           if(person[i]==null){
               break;
           }
           System.out.println("Personas en la pila: "+" ["+i+"] " + person[i].getName() + "" + person[i].getLastName()
                   + "" + person[i].getWeight() + ""+ person[i].getHeight() + ""+  person[i].getDateOfBirth());
       }
        
    }




    }


