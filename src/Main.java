import models.Facade;

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();
        System.out.println("Coke: "+ facade.dispenseCoke());
        System.out.println("Pepsi: "+ facade.dispensePepsi());
        System.out.println("Fanta: " + facade.dispenseFanta());
        System.out.println("Limonada: " + facade.dispenseLimonada());


    }
}
