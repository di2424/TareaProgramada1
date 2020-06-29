package cr.ac.ulead.tda;

import java.io.PrintStream;
import java.util.Scanner;

public class MainPila2 {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        personas();
    }

    public static void personas(){
        Pila2 pila2 = new Pila2();
        UIPila2 UI = new UIPila2();

        int option= 0;
        do {
            UI.menuPila();
            option= input.nextInt();
            UI.executeMenu(option);
        }while(option!=3);

    }
}
