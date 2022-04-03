public class App {

    public static void main(String[] args) {

        Pet pet = new Pet("ghost", "husky", 3, 1000.0);
        PetShop petS = new PetShop("Dogo", 50000.0);

        System.out.println(pet);
        System.out.println(petS);
        petS.darBanho(pet, 400.0, 100);

    }
}