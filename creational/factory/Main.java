public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerFast - Système de Commande ===\n");

        System.out.println("Commande 1 - Client demande un Burger Veggie:");
        Burger burger1 = BurgerFactory.creerBurger(BurgerType.VEGGIE);
        burger1.afficher();
        System.out.println();

        System.out.println("Commande 2 - Client demande un Cheeseburger:");
        Burger burger2 = BurgerFactory.creerBurger(BurgerType.CHEESE);
        burger2.afficher();
        System.out.println();

        System.out.println("Commande 3 - Client demande un Chicken Burger:");
        Burger burger3 = BurgerFactory.creerBurger(BurgerType.CHICKEN);
        burger3.afficher();
        System.out.println();

        System.out.println("Commande 4 - Utilisation avec String:");
        Burger burger4 = BurgerFactory.creerBurger("chicken");
        burger4.afficher();
        
        double total = burger1.getPrix() + burger2.getPrix() + burger3.getPrix() + burger4.getPrix();
        System.out.println("\nTotal des commandes: " + total + "€");
    }
}
