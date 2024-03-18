package okr;

import java.time.LocalDate;

public abstract class Creator {

    protected abstract Pets createNewPet(PetType type);

    public Pets createPet(PetType type, String name, LocalDate date) {

        Pets pet = createNewPet(type);
        pet.setName(name);
        pet.setBirthday(date);
        return pet;
    }
}
