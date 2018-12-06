public class Burgerid {
    public static void main(String[] args) {
        Burger hamburger = new Burger("HAMBURGER", "veiseliha", "Valge sai", 2.5);
        hamburger.valiLisand1("tomat",0.5);
        hamburger.valiLisand2("salat",0.5);
        hamburger.valiLisand3("muna",0.5);
        Double hamburgerihind = hamburger.koostaBurger();
        System.out.println("Lõpphind = " + hamburgerihind);

    }
}
