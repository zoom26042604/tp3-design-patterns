import java.util.List;

public class ServiceIngredients {
    public boolean verifierDisponibilite(List<String> ingredients) {
        System.out.println("  ✓ Vérification de la disponibilité des ingrédients: " + ingredients);
        for (String ingredient : ingredients) {
            if (ingredient.equalsIgnoreCase("truffe")) {
                System.out.println("    ⚠ Ingrédient manquant: " + ingredient);
                return false;
            }
        }
        return true;
    }
}
