package scrap.heap.refactor;

import scrap.heap.refactor.party.Balloon;
import scrap.heap.refactor.party.Cake;
import scrap.heap.refactor.party.BirthdayParty;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println(app.birthdayPartyOrder(1));

        System.out.println(app.birthdayPartyOrder(2));

        System.out.println(app.birthdayPartyOrder(3));
    }

    public String birthdayPartyOrder(int number) {
        Balloon balloon = null;
        Cake cake = null;

        switch(number) {
            case 1:
                balloon = new Balloon.Builder()
                        .color(Balloon.Color.RED).material(Balloon.Material.MYLAR)
                        .count(4).build();

                cake = new Cake.Builder()
                        .flavor(Cake.Flavor.CHOCOLATE)
                        .frostingFlavor(Cake.FrostingFlavor.CHOCOLATE)
                        .shape(Cake.Shape.CIRCLE)
                        .size(Cake.Size.LARGE)
                        .color(Cake.Color.BROWN)
                        .build();
                break;
            case 2:
                balloon = new Balloon.Builder()
                        .color(Balloon.Color.BLUE)
                        .material(Balloon.Material.LATEX)
                        .count(7)
                        .build();

                cake = new Cake.Builder()
                        .flavor(Cake.Flavor.VANILLA)
                        .frostingFlavor(Cake.FrostingFlavor.CHOCOLATE)
                        .shape(Cake.Shape.SQUARE)
                        .size(Cake.Size.MED)
                        .color(Cake.Color.BROWN)
                        .build();
                break;
            case 3:
                balloon = new Balloon.Builder()
                        .color(Balloon.Color.YELLOW)
                        .material(Balloon.Material.MYLAR)
                        .count(4)
                        .build();

                cake = new Cake.Builder()
                        .flavor(Cake.Flavor.VANILLA)
                        .frostingFlavor(Cake.FrostingFlavor.CHOCOLATE)
                        .shape(Cake.Shape.SQUARE)
                        .size(Cake.Size.SMALL)
                        .color(Cake.Color.YELLOW)
                        .build();
                break;
        }
        BirthdayParty birthdayParty = new BirthdayParty.Builder().ballon(balloon).cake(cake).order();

        return birthdayParty.getDescription();
    }
}
