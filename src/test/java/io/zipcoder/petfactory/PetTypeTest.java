package io.zipcoder.petfactory;

import io.zipcoder.pets.Pet;
import org.junit.Test;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class PetTypeTest {
    @Test
    public void testFactory() {
        Pet p = PetType.getPetInstance("CAT");
        System.out.println(p.getClass().getSimpleName());
    }
}