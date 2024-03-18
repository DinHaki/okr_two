package okr;

public class okr {
    public static void main(String[] args) throws Exceptions {

        Rep <Pets> myFarm = new PetRep();
        pet controller = new pet(myFarm);
        new ConsoleMenu (controller).start();
    }
}    