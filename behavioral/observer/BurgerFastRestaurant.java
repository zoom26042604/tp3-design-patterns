public class BurgerFastRestaurant {
    private Promotion promotion;

    public BurgerFastRestaurant() {
        this.promotion = new Promotion();
    }

    public void ajouterClientVIP(ClientVIP client) {
        promotion.ajouterClient(client);
        System.out.println("Client VIP " + client.getNom() + " ajoute au programme de promotions");
    }

    public void lancerPromotionFlash(String nomPromotion, int reduction) {
        System.out.println("\nLancement de la promotion flash : " + nomPromotion);
        promotion.lancerPromotion(nomPromotion, reduction);
    }
}
