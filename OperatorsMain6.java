package operators;


public class OperatorsMain6 {

    public static void main(String[] arddsdsddsaaaaaadddsssssss) {
        int a = 2;
        int b = 8;
        System.out.println(5+2/8);// реузультат 0,сначала выполняем деление,затем прибавляем
        System.out.println((5+2)/8);// результат 0, сначала выполняем действие в скобках,затем деление
        System.out.println((5+a++)/8);
        /* результат 0,выполняем действие в скобках,присваиваем значение переменной a 2,так как инкремент
        не работает с литералами,выполняем инкремент,затем прибавляем и после этого выполняем деление
        */
        System.out.println((5+a++)/--b);
        /* результат 1, выполняем действие в скобках,инкремент,затем прибавляем,затем присваиваем перемнной b
        значение 8, так как декремент с литералами не работает,выолняем декремнт,затем деление
         */
        System.out.println((5*2>>a++)/--b);
        /* результат 0,выполняем действие в скобках,инкремент,умножение,сдвиг вправо с дополнением знака,
        декремент,затем деление
         */
        System.out.println((5+7>20?68:22*2>>a++)/--b);
        /*результат 0, выполняем действие в скобках,инкремент,затем прибавление,затем умножение,затем сдвиг вправо с
        дополением знака,затем больше чем,после этого тернарный оператор,затем декремент и после этого деление
         */
        System.out.println(6-2>3&&12*12<=119);
        /*результат false, сначала выполняем деление,затем умножение,затем вычитание,затем больше чем,после этого меньше
        либо равно,затем условное умножение
         */
        System.out.println(true&&false);
        /*результат false так как у нас одно булевое выражение true, а другое false
        поэтому false
        */
        System.out.println((5+7>20?68>=68:22*2>>a++)/--b);//ошибка выражения,так как сравниваются различные типы данных

    }
}