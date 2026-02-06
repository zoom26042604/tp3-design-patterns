import java.util.ArrayList;
import java.util.List;

public class Promotion {
    private List<ClientVIP> clients = new ArrayList<>();
    private String nomPromotion;
    private int reduction;

    public void ajouterClient(ClientVIP client) {
        clients.add(client);
    }

    public void retirerClient(ClientVIP client) {
        clients.remove(client);
    }

    public void lancerPromotion(String nomPromotion, int reduction) {
        this.nomPromotion = nomPromotion;
        this.reduction = reduction;
        notifierClients();
    }

    private void notifierClients() {
        String message = nomPromotion + " : -" + reduction + "%";
        for (ClientVIP client : clients) {
            client.recevoirNotification(message);
        }
    }
}
