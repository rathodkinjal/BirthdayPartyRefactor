package scrap.heap.refactor.party;

public class Cake {

    private final Flavor flavor;
    private final FrostingFlavor frostingFlavor;
    private final Shape shape;
    private final Size size;
    private final Color color;

    private Cake(Flavor flavor, FrostingFlavor frostingFlavor, Shape shape, Size size, Color color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    public static class Builder {
        private Flavor flavor;
        private FrostingFlavor frostingFlavor;
        private Shape shape;
        private Size size;
        private Color color;

        public Builder flavor(Flavor flavor) {
            this.flavor = flavor;
            return this;
        }

        public Builder frostingFlavor(FrostingFlavor frostingFlavor) {
            this.frostingFlavor = frostingFlavor;
            return this;
        }

        public Builder shape(Shape shape) {
            this.shape = shape;
            return this;
        }

        public Builder size(Size size) {
            this.size = size;
            return this;
        }
        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Cake build() {

            return new Cake(flavor, frostingFlavor, shape, size, color);
        }
    }

    public enum Color {
        BROWN, YELLOW;

        @Override
        public String toString() {

            return name().toLowerCase();
        }
    }

    public enum Shape {
        CIRCLE, SQUARE;

        @Override
        public String toString() {

            return name().toLowerCase();
        }
    }

    public enum Flavor {
        CHOCOLATE, VANILLA;

        @Override
        public String toString() {

            return name().toLowerCase();
        }
    }

    public enum FrostingFlavor {
        CHOCOLATE;

        @Override
        public String toString() {

            return name().toLowerCase();
        }
    }

    public enum Size {
        SMALL, MED, LARGE;
        @Override
        public String toString() {

            return name().toLowerCase();
        }
    }

    public String getDescription() {
        return "cake ordered: " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + color;
    }
}
