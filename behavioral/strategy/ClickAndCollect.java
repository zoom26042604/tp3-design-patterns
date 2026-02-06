public class ClickAndCollect implements StrategieLivraison {
    @Override
    public double calculerFraisLivraison(double prixPlats, double distance) {
        return 0.0;
    }

    @Override
    public String getDescription() {
        return "Click & Collect (À retirer sur place) - Gratuit";
    }
}
