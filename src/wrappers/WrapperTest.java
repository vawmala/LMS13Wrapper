package wrappers;

public class WrapperTest {
    public static void main(String[] args) {

        // 2 Для каждого типа данных создать по 4 переменные и проинициализировать разными
        // вариантами:

        Integer i1 = 15;
        Integer i2 = Integer.valueOf(5);
        Integer i3 = new Integer(23);
        Integer i4 = Integer.parseInt("56");

        Double d = 2.5;
        Double d1 = Double.valueOf(3.4);
        Double d2 = new Double(12.6);
        Double d3 = Double.parseDouble("789.22");

        Byte b1 = 2;
        Byte b2 = Byte.valueOf((byte) 3);
        Byte b3 = new Byte((byte) 1);
        Byte b4 = Byte.parseByte("3");

        Short s1 = 1;
        Short s2 = Short.valueOf((short) 2);
        Short s3 = new Short((short) 5);
        Short s4 = Short.parseShort("35");

        Character c1 = 'a';
        Character c2 = Character.valueOf('@');
        Character c3 = new Character('!');
        Character c4 = Character.toTitleCase(c1);

        Boolean bool = true;
        Boolean bool1 = Boolean.valueOf(false);
        Boolean bool2 = new Boolean("Hello");
        Boolean bool3 = Boolean.parseBoolean("true");

        // 3 Создать переменную типа Double присвоить ей значение с дробнойчастью.
        // Создать переменный примитивных типов (byte, short, int, float, long )
        // Преобразовать и присвоить значение Double каждому из примитивных типов
        //используя специальные методы или автораспаковку.

        Double g = 2.6;
        int i;
        short sh;
        byte bt;
        float fl;
        long l;
        i = g.intValue();
        sh = g.shortValue();
        bt = g.byteValue();
        fl = g.floatValue();
        l = g.longValue();

        // 4 Проверить значения NaN и Infinity.
        // Создать 2 переменные типа Double, одной из них присвоить значение 0.0.
        // Создать переменную типа Double nanValue и присвоить ей значение, деления
        //ненулевой переменной на нулевую.
        // Создать переменную infinityValue и присвоить ей значение, деления нулевой
        //переменной саму на себя.
        // Вывести nanValue и infinityValue на экран.
        // Добавить по 2 блока if для каждого числа в которых проверяется результат
        //выполнения методов isNaN и isInfinity.
        //Если число NaN вывести текст «Переменная {{имя переменной}} = NaN»
        //Если число Infinityвывести текст «Переменная {{имя переменной}} = Infinity»
        Double one = 5.0;
        Double two = 0.0;
        Double nanValue = two / two;
        if (Double.isNaN(nanValue)) {
            System.out.println("Переменная " + nanValue + " = NaN");
        }
        Double infinityValue = one / two;
        if (infinityValue == Double.POSITIVE_INFINITY) {
            System.out.println("Переменная " + infinityValue + " = Infinity");
        }

        // 5 Создать 2 переменной типа Long присвоить обеим значения 120
        // Вывести на экран результат сравнения этих переменных по оператору ==.
        // Заменить значения переменных на 1200, перепроверить сравнение
        Long lg = 120L;
        Long la = 120L;
        System.out.println(lg.equals(la));
        lg = 1200L;
        la = 1200L;
        System.out.println(lg.equals(la));


    }

}
