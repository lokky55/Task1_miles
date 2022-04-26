public class Main {
    public static void main(String[] args) {
        int ticketPrice = 200;  // Объявляю переменную для стоимости билета
        int rubBonus = 20;      // Объявялю переменную для количества рублей для одной бонусной милли

        int amountBonus = ticketPrice / rubBonus; // Рассчитываю количество бонусных милль
        System.out.println("За покупку билета Вам начислено: " + amountBonus + " бонусов");

    }
}
