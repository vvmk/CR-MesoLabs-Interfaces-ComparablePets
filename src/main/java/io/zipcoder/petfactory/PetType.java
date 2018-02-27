package io.zipcoder.petfactory;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.KomodoDragon;
import io.zipcoder.pets.Pet;

import java.util.List;
import java.util.function.Supplier;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public enum PetType {
    CAT(Cat::new),
    DOG(Dog::new),
    KOMODODRAGON(KomodoDragon::new);

    List<Supplier<Pet>> values;

    PetType(Supplier<Pet> petSupplier) {
        values
    }

    public Pet getPetInstance(String petTypeName) {
        for (Supplier<Pet> s : this.)
    }

    private Pet<Supplier> getValue(PetType p) {

    }
}
