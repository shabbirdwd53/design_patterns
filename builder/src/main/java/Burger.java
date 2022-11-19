/**
 * Most Common Way to implement builder pattern is to have Builder class as innner class because : - You might have seen at most of the places. -Joshua Bloch's Builder pattern
 * 1. We don't want to expose our constructor which eventually creates confusion at later stage.
 * 2. We don't want to have in-consistent object by having setters exposed.
 * 3. Now since constructor is private we will need inner class to access that. - Which will have same inputs what we have in class. But without getters.
 */
public class Burger {

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder) {
        // Initialize all fields and you can also add validations.
    }

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    //Return same object everytime that is builder instance
    //Once build method invoke return actual object.
    public static class BurgerBuilder {
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;
        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }
        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }
        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }
        public BurgerBuilder mayonese(boolean mayonese) {
            this.mayonese = mayonese;
            return this;
        }
        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }
        public Burger build() {

            return new Burger(this);
        }
    }
}
