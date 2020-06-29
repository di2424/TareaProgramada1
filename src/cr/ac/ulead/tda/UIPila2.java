package cr.ac.ulead.tda;

import java.io.PrintStream;
import java.util.Scanner;

public class UIPila2 {
    Pila2 pila2 = new Pila2();
    private Scanner input = new Scanner(System.in);
    private PrintStream output = new PrintStream(System.out);

    public void menuPila(){
        System.out.println("***Opciones para la pila 2***");
        System.out.println();
        System.out.println("1.Ingresar datos");
        System.out.println("2.Remover menor estatura");
        System.out.println("3.Salir");
    }
    public void wrongOption(){
        System.out.println("Opcion incorrecta!");
    }
    public void executeMenu(int option){


        switch (option){
            case 1:
                pila2.push();
                break;
            case 2:
                pila2.lowerHeight(pila2.position);
                System.out.println(pila2.aux.serializadorJSON());
                break;
            default:
                wrongOption();
        }


    }
}
