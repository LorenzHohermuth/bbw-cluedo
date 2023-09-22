package ch.bbw.cge.cluedo.model;

import java.awt.*;

/**
 * A Person
 * @author Christian Gebert
 * @version 14.09.2023
 */
public class Person {
    private String name;
    private String formOfAddress;
    private String color;
    private String imagePath;

    public Person(String name, String formOfAddress, String color) {
        this.name = name;
        this.formOfAddress = formOfAddress;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormOfAddress() {
        return formOfAddress;
    }

    public void setFormOfAddress(String formOfAddress) {
        this.formOfAddress = formOfAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", formOfAddress='" + formOfAddress + '\'' +
                '}';
    }
}
