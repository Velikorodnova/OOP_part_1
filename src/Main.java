public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1987, "Максим", "Москва", "бренд-менеджера");
        System.out.println(maksim);
        Human ania = new Human(1993, "Аня", "Севастополь", "методиста образовательных программ");
        System.out.println(ania);
        Human katia = new Human(1994, "Катя", "Калининград", "продакт-менеджера");
        System.out.println(katia);
        Human artem = new Human(1995, "Артем", "Москва", "директора по развитию бизнеса");
        System.out.println(artem);
        Human vladimir = new Human(2001, "Владимир", "Казань", "- безработный");
        System.out.println(vladimir);

        System.out.println();

        Flower rose = new Flower("Роза", "", "Голландия", 35.59, 0);
        System.out.println(rose);
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15.00, 5);
        System.out.println(chrysanthemum);
        Flower peony = new Flower("Пион", "", "Англия", 69.90, 1);
        System.out.println(peony);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.50, 10);
        System.out.println(gypsophila);
        getCostOfTheBouquet(rose,rose, rose,
                chrysanthemum, chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila);
    }

    private static void getCostOfTheBouquet(Flower... flowers) {
        double allCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            allCost += flower.getCost();
        }
        allCost = allCost * 1.1;

        System.out.println("Стоимость букета - " + allCost);
        System.out.println("Максимальный срок стояния букета - " + minLifeSpan);

    }
}