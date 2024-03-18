package okr;

public class PetCreator extends Creator {

    @Override
    protected Pets createNewPet (PetType type) {

        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Hamster:
                return new Hamster();
        }
        return null;
    }
}
