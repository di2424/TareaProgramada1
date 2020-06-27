import LogicaDeUI.LogicaDeMenu;
import Objetos.Funciones;
import Objetos.Person;
import Objetos.Pet;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        EjemploPersonaYMascota();
    }

    private static void EjemploPersonaYMascota() {
        Funciones funciones = new Funciones();
        LogicaDeMenu UI = new LogicaDeMenu();


        int option = 0;
        do {
            UI.showMenu();
            option = input.nextInt();
            UI.executeMenu(option);
        } while (option != 5);
    }

}

