public class BurgerVeggie implements Burger {
    @Override
    public String getNom() {
        return "Burger Veggie";
    }

    @Override
    public String getDescription() {
        return "Pain complet, salade, tomate, carotte";
    }

    @Override
    public double getPrix() {
        return 8.0;
    }

    @Override
    public void afficher() {
        System.out.println(getNom());
        System.out.println("Composition: " + getDescription());
        System.out.println("Prix: " + getPrix() + "€");
    }
}
