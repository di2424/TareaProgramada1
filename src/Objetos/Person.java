package Objetos;

import Interfaz.SerializadorUlead;

import java.io.PrintStream;
import java.util.Scanner;

public class Person implements SerializadorUlead {


    private String name;
    private String lastName;
    private String dateOfBirth;
    private String weight;
    private String height;

    public Person(String name, String lastName, String dateOfBirth, String weight, String height) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


    @Override
    public String serializadorXML() {
        return "<Person> " +
                " <name> " + getName() + "</name>" + " <lastName> " + getLastName() + "</lastName>" + " <dateOfBirth>" +
                getDateOfBirth() + "</dateOfBirth" + " <Weight> " + getWeight() + "</weight>" + "<height>" +
                getHeight() + "</height>";

    }

    @Override
    public String serializadorJSON() {
        return "{ name: \"" + getName() + "\", lastName: \"" + getLastName() +  "\", dateOfBirth: \"" + getDateOfBirth()
                +  "\", weight: " + getWeight() + ", height: " + getHeight() + "}";
    }

}
