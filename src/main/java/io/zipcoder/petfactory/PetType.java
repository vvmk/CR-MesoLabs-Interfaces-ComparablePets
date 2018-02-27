package io.zipcoder.petfactory;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.KomodoDragon;
import io.zipcoder.pets.Pet;

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

    Supplier<Pet> value;

    PetType(Supplier<Pet> petSupplier) {
        this.value = petSupplier;
    }

    public static Pet getPetInstance(String petTypeName) {
        for (PetType p : PetType.values()) {
            if (petTypeName.equalsIgnoreCase(p.toString()))
                return getValue(p).get();
        }
        return null;
    }

    public static Supplier<Pet> getValue(PetType p) {
        return p.value;
    }
}
