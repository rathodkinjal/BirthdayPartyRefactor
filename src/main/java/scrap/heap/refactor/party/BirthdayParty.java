package scrap.heap.refactor.party;

public class BirthdayParty {

    private final Balloon balloon;
    private final Cake cake;

    public BirthdayParty(Balloon balloon, Cake cake) {
        this.balloon = balloon;
        this.cake = cake;
    }

    public static class Builder {

        private Cake cake;
        private Balloon balloon;

        public Builder cake(Cake cake) {
            this.cake = cake;
            return this;
        }

        public Builder ballon(Balloon balloon) {
            this.balloon = balloon;
            return this;
        }

        public BirthdayParty order() { return new BirthdayParty(balloon, cake); }
    }

    public String getDescription() {
        return balloon.getDescription() + "\n" +
                cake.getDescription();
    }

}
