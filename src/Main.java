public class Main {

    public static void main(String[] args) {

        int account = 350;
        int payment = 1553;

        int bonus = payment >= 1100 ? payment / 100 : 0;

        int finalAccount = account + payment + bonus;
        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Количество бонусных рублей: " + bonus);
    }

}
