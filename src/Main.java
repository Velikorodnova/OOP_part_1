public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1987, "", "", "бренд-менеджера");
        System.out.println(maksim);
        Human ania = new Human(1993, "Аня", "Севастополь", "методиста образовательных программ");
        System.out.println(ania);
        Human katia = new Human(1994, "Катя", "Калининград", "продакт-менеджера");
        System.out.println(katia);
        Human artem = new Human(1995, "Артем", "Москва", "директора по развитию бизнеса");
        System.out.println(artem);
    }
}