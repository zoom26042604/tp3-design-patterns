import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {
    private LecteurCSV lecteur;

    public CSVAdapter(LecteurCSV lecteur) {
        this.lecteur = lecteur;
    }

    @Override
    public double getTotalVentes() {
        double total = 0.0;
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);
            if (colonnes.length >= 3) {
                String prixQuantite = colonnes[2].trim();
                total += parsePrixQuantite(prixQuantite);
            }
        }
        return total;
    }

    @Override
    public int getNbCommandes() {
        return lecteur.getNbLignes() - 1;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> caParProduit = new HashMap<>();
        
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);
            if (colonnes.length >= 3) {
                String produit = colonnes[1].trim();
                String prixQuantite = colonnes[2].trim();
                double montant = parsePrixQuantite(prixQuantite);
                
                caParProduit.merge(produit, montant, Double::sum);
            }
        }
        
        return caParProduit;
    }

    private double parsePrixQuantite(String prixQuantite) {
        try {
            String[] parts = prixQuantite.split("x");
            if (parts.length == 2) {
                double prix = Double.parseDouble(parts[0].trim());
                int quantite = Integer.parseInt(parts[1].trim());
                return prix * quantite;
            }
        } catch (NumberFormatException e) {
            System.err.println("Erreur de parsing: " + prixQuantite);
        }
        return 0.0;
    }
}
