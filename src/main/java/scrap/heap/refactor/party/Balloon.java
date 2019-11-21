package scrap.heap.refactor.party;

public class Balloon {

    private final Color color;
    private final Material material;
    private final int count;

    private Balloon(Color color, Material material, int count) {
        this.color = color;
        this.material = material;
        this.count = count;
    }

    public static class Builder {

        private Color color;
        private Material material;
        private int count;

        public Builder color(Color color) {
            this.color = color;
            return this;
        }
        public Builder material(Material material) {
            this.material = material;
            return this;
        }
        public Builder count(int count) {
            this.count = count;
            return this;
        }

        public Balloon build() {

            return new Balloon(color, material, count);
        }
    }

    public enum Color {
        RED, BLUE, YELLOW;

        @Override
        public String toString() {

            return name().toLowerCase();
        }
    }

    public enum Material {
        MYLAR, LATEX;

        @Override
        public String toString() {

            return name().toLowerCase();
        }
    }

    public String getDescription() {
        return  "Balloons ordered: " + color + ", " + material  + ", " + count;
    }

}
