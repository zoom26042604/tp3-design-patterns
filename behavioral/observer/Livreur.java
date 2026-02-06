public class Livreur implements Observer {
    private String nom;

    public Livreur(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("[Livreur " + nom + "] Alerte recue: " + message);
    }
}
