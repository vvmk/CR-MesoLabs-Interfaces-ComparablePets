package io.zipcoder.pets;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class Dog extends Pet<Dog> {
    private static final String fDEFAULT_NAME = "Clarence";
    private static final String fSOUND = "woof";

    public Dog() {
        this(fDEFAULT_NAME);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return fSOUND;
    }
}
