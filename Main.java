public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1); // 1-1=0
        int c = calc.devide.apply(a, b); //  Ошибка возникает по причине деления на ноль,
        // данную проблему можно решить при помощи изменении математической операции devide,
        // а именно добавление в нее условия, что на ноль делить нельзя


        calc.println.accept(c);

    }
}
