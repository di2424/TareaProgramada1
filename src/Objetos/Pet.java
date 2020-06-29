package Objetos;

import Interfaz.SerializadorUlead;

import java.io.PrintStream;
import java.util.Scanner;

public class Pet implements SerializadorUlead {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);


    private String name;
    private String typeOfAnimal;
    private String age;

    public Pet(String name, String typeOfAnimal, String age) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
