// УСЛОВИЯ ЗАДАЧИ
// Объявляете переменные для входных данных и
// параметров программы: одну для хранения
// стоимости билета, другую для хранения количества
// рублей для одной бонусной мили
// Рассчитываете количество бонусных миль, используя
// значения заведённых переменных. Ответ сохраняете в
// новую переменную и выводите на экран

public class Main {
    public static void main(String[] args) {
        int ticketCost = 100_000; // Значение стоимости одного авиабилета
        int bonus = 20; // Значение количества рублей для одной бонусной мили
        int miles = ticketCost / bonus; // Количество бонусных миль


        System.out.println("+--------------------------+");
        System.out.println("| Количество бонусных миль |"); //+ miles = ticketCost/bonus); // Расчет кличества бонусных миль исходя из стоимости одного авиабилета
        System.out.println("|          " + miles + "            |");
        System.out.println("+--------------------------+");

    }
}