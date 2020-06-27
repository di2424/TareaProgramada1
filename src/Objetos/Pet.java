package Objetos;

import Interfaz.SerializadorUlead;

import java.io.PrintStream;
import java.util.Scanner;

public class Pet implements SerializadorUlead {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);


    private String name;
    private String typeOfAnimal;
    private int age;

    public Pet(String name, String typeOfAnimal, int age) {
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String serializadorXML() {
        return "<name>" + getName() + "</name>" + "<typeOfAnimal>" + getTypeOfAnimal() + "</typeOfAnimal>" + "<age>"
                + getAge() + "</age>";
    }

    @Override
    public String serializadorJSON() {
        return "{name: " + getName() + ", typeOfAnimal: " + getTypeOfAnimal() + ", age: " + getAge() + "}";
    }
}
