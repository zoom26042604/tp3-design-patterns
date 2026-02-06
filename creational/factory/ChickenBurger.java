public class ChickenBurger implements Burger {
    @Override
    public String getNom() {
        return "Chicken Burger";
    }

    @Override
    public String getDescription() {
        return "Pain burger, poulet pané croustillant, sauce BBQ";
    }

    @Override
    public double getPrix() {
        return 9.0;
    }

    @Override
    public void afficher() {
        System.out.println(getNom());
        System.out.println("Composition: " + getDescription());
        System.out.println("Prix: " + getPrix() + "€");
    }
}
