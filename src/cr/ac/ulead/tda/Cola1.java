package cr.ac.ulead.tda;
import Objetos.Pet;

import java.io.PrintStream;
import java.util.Scanner;

public class Cola1 {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    Pet[] pet = new Pet[10];

    String name;
    String typeOfAnimal;
    String age;
    int first=0;
    int last;
    int position=0;

    public Cola1(){
        first=0;
        last= first;
    }

    public void enterData(){
     if (pet[first]==null){
         System.out.println("Ingrese los datos de mascota");
         System.out.println();
         System.out.println("Nombre: ");
         name = input.nextLine();
         System.out.println("Tipo de animal: ");
         typeOfAnimal = input.nextLine();
         System.out.println("Años: ");
         age = input.nextLine();
         Pet p = new Pet(name, typeOfAnimal, age);
         last++;
     }
    }


}

