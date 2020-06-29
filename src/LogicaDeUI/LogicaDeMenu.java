package LogicaDeUI;

import Objetos.Funciones;
import Objetos.Person;
import Objetos.Pet;

import java.io.PrintStream;
import java.io.StringReader;
import java.util.Scanner;

public class LogicaDeMenu {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

  Funciones funciones = new Funciones();


public void showMenu () {
    System.out.println("****MENU****");
    System.out.println("1. Ingrese datos de persona");
    System.out.println("2. Ingrese datos de mascota");
    System.out.println("3. Salir");
}
public void showMenu2 () {
    System.out.println("***Elija el tipo de formato");
    System.out.println("1. Formato XML");
    System.out.println("2.Formato Json");
    System.out.println("3.Salir");
}

public void wrongOption(){
    System.out.println("Opcion incorrecta!");
}


    public void executeMenu(int option){
        switch (option){
            case 1:
                Person person = funciones.newPerson();
                showMenu2();
                int option2 = input.nextInt();
                if (option2 == 1){
                    System.out.println(person.serializadorXML());
                }
                if (option2==2){
                    System.out.println(person.serializadorJSON());
                }

                break;
            case 2:
                Pet pet = funciones.newPet();
                showMenu2();
                option2= input.nextInt();
                if(option2==1){
                    System.out.println(pet.serializadorXML());
                }
                if(option2==2){
                    System.out.println(pet.serializadorJSON());
                }
                break;
            default:
                wrongOption();





        }
    }





}
