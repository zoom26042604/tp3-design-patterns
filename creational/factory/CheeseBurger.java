public class CheeseBurger implements Burger {
    @Override
    public String getNom() {
        return "Cheeseburger";
    }

    @Override
    public String getDescription() {
        return "Pain sésame, steak haché, cheddar fondu";
    }

    @Override
    public double getPrix() {
        return 10.0;
    }

    @Override
    public void afficher() {
        System.out.println(getNom());
        System.out.println("Composition: " + getDescription());
        System.out.println("Prix: " + getPrix() + "€");
    }
}
