package cr.ac.ulead.tda;

import java.io.PrintStream;
import java.util.Scanner;

public class mainPila1 {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        personas();
    }

      public static void personas(){
        Pila1 pila1 = new Pila1();
        UIPila1 UI = new UIPila1();

        int option= 0;
        do {
            UI.menuPila();
            option= input.nextInt();
            UI.executeMenu(option);
        }while(option!=4);

        }
    }

