public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerFast - Systeme de Promotion ===\n");

        BurgerFastRestaurant restaurant = new BurgerFastRestaurant();

        ClientVIP client1 = new ClientVIP("Jean Dupont");
        ClientVIP client2 = new ClientVIP("Marie Martin");
        ClientVIP client3 = new ClientVIP("Pierre Dubois");

        restaurant.ajouterClientVIP(client1);
        restaurant.ajouterClientVIP(client2);
        restaurant.ajouterClientVIP(client3);

        restaurant.lancerPromotionFlash("Menu Midi", 20);

        System.out.println();

        restaurant.lancerPromotionFlash("Happy Hour", 30);

        System.out.println();

        restaurant.lancerPromotionFlash("Week-end Special", 15);
    }
}
