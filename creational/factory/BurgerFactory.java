public class BurgerFactory {
    public static Burger creerBurger(BurgerType type) {
        if (type == null) {
            throw new IllegalArgumentException("Le type de burger ne peut pas être null");
        }

        switch (type) {
            case VEGGIE:
                return new BurgerVeggie();
            case CHEESE:
                return new CheeseBurger();
            case CHICKEN:
                return new ChickenBurger();
            default:
                throw new IllegalArgumentException("Type de burger inconnu: " + type);
        }
    }

    // Méthode alternative avec String
    public static Burger creerBurger(String typeName) {
        if (typeName == null || typeName.isEmpty()) {
            throw new IllegalArgumentException("Le type de burger ne peut pas être vide");
        }

        try {
            BurgerType type = BurgerType.valueOf(typeName.toUpperCase());
            return creerBurger(type);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Type de burger inconnu: " + typeName);
        }
    }
}
