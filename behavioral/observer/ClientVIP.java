public class ClientVIP {
    private String nom;

    public ClientVIP(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void recevoirNotification(String message) {
        System.out.println("[Client VIP " + nom + "] Notification : " + message);
    }
}
