package models;

public class Facade {

    private Product coke, pepsi, fanta, limonada;

    public Facade() {
        this.coke = new Coke();
        this.pepsi = new Pepsi();
        this.fanta = new Fanta();
        this.limonada = new Limonada();
    }

    public String dispenseCoke(){
        return coke.dispense();
    }

    public String dispensePepsi(){
        return pepsi.dispense();
    }
    public String dispenseFanta(){
        return fanta.dispense();
    }
    public String dispenseLimonada(){
        return limonada.dispense();
    }

}
