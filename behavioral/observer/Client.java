public class Client implements Observer {
    private String nom;

    public Client(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("[Client " + nom + "] Notification recue: " + message);
    }
}
