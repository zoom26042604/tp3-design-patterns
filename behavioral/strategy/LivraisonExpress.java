public class LivraisonExpress implements StrategieLivraison {
    @Override
    public double calculerFraisLivraison(double prixPlats, double distance) {
        double frais = 5.0 + (distance * 1.0);
        return frais;
    }

    @Override
    public String getDescription() {
        return "Livraison Express (15-20 min) - 5€ + 1€/km";
    }
}
