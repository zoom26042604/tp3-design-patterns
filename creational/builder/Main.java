public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sandwicherie BurgerFast ===\n");

        Sandwich sandwichVeggie = new Sandwich.SandwichBuilder("complet")
                .avecLegumes("laitue, tomate, oignon")
                .avecFromage("emmental")
                .avecSauce("moutarde")
                .build();

        System.out.println("Commande 1 :");
        System.out.println(sandwichVeggie);
        System.out.println();

        Sandwich sandwichPoulet = new Sandwich.SandwichBuilder("ciabatta")
                .avecViande("poulet")
                .avecLegumes("laitue, tomate")
                .avecSauce("mayo")
                .grille(true)
                .build();

        System.out.println("Commande 2 :");
        System.out.println(sandwichPoulet);
        System.out.println();

        Sandwich sandwichRosbif = new Sandwich.SandwichBuilder("baguette")
                .avecViande("rosbif")
                .avecFromage("cheddar")
                .avecLegumes("laitue, cornichon, oignon")
                .avecSauce("ketchup")
                .grille(false)
                .build();

        System.out.println("Commande 3 :");
        System.out.println(sandwichRosbif);
    }
}
