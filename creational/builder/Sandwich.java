public class Sandwich {
    private final String pain;
    
    private final String viande;
    private final String fromage;
    private final String legumes;
    private final String sauce;
    private final boolean grille;

    private Sandwich(SandwichBuilder builder) {
        this.pain = builder.pain;
        this.viande = builder.viande;
        this.fromage = builder.fromage;
        this.legumes = builder.legumes;
        this.sauce = builder.sauce;
        this.grille = builder.grille;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sandwich :\n");
        sb.append("  Pain: ").append(pain).append("\n");
        if (viande != null) sb.append("  Viande: ").append(viande).append("\n");
        if (fromage != null) sb.append("  Fromage: ").append(fromage).append("\n");
        if (legumes != null) sb.append("  Légumes: ").append(legumes).append("\n");
        if (sauce != null) sb.append("  Sauce: ").append(sauce).append("\n");
        sb.append("  Grillé: ").append(grille ? "Oui" : "Non");
        return sb.toString();
    }

    public static class SandwichBuilder {
        private final String pain;
        
        private String viande;
        private String fromage;
        private String legumes;
        private String sauce;
        private boolean grille;

        public SandwichBuilder(String pain) {
            if (pain == null || pain.isEmpty()) {
                throw new IllegalArgumentException("Le pain est obligatoire");
            }
            this.pain = pain;
        }

        public SandwichBuilder avecViande(String viande) {
            this.viande = viande;
            return this;
        }

        public SandwichBuilder avecFromage(String fromage) {
            this.fromage = fromage;
            return this;
        }

        public SandwichBuilder avecLegumes(String legumes) {
            this.legumes = legumes;
            return this;
        }

        public SandwichBuilder avecSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public SandwichBuilder grille(boolean grille) {
            this.grille = grille;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}
