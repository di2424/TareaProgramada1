package cr.ac.ulead.tda;

import Objetos.Person;

import java.io.PrintStream;
import java.util.Scanner;

public class UIPila1 {
    Pila1 pila1 = new Pila1();
    private Scanner input = new Scanner(System.in);
    private PrintStream output = new PrintStream(System.out);

    public void menuPila(){
        System.out.println("***Opciones para la pila 1***");
        System.out.println();
        System.out.println("1.Ingresar datos");
        System.out.println("2.Remover datos de la pila");
        System.out.println("3.Mostrar pila");
        System.out.println("4.Salir");
    }
    public void wrongOption(){
        System.out.println("Opcion incorrecta!");
    }
    public void executeMenu(int option){


        switch (option){
            case 1:
                pila1.push();
                break;
            case 2:
                pila1.pop();

              //  System.out.println(person.serializadorXML());
                break;
            case 3:
                pila1.showPila();
                break;
            default:
                wrongOption();
        }


    }



}
