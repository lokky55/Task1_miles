public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2012;  // Объявляю переменную для стоимости билета
        int rubBonus = 20;      // Объявляю переменную для количества рублей за одну бонусную милю

        int amountBonus = ticketPrice / rubBonus; // Рассчитываю количество бонусных милль
        System.out.println("За покупку билета Вам начислено: " + amountBonus + " бонусов");

    }
}
