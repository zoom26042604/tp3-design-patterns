public class Cuisinier implements Observer {
    private String nom;

    public Cuisinier(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("[Cuisinier " + nom + "] Info recue: " + message);
    }
}
