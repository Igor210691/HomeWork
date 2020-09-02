package operators;

public class OperatorsMain2 {

    public static void main(String[] arsss) {
        int a = - 42;
        int b = - 15;
        int y = 1;
        System.out.println( ~a); //  ~ 11010110 результат 00101001
        System.out.println( ~b);  // ~ 11110001 результат 00001110
        System.out.println(a | b); // 11010110 | 11110001 результат 11110111
        System.out.println(a & b); // 11010110 & 11110001 результат 11010000
        System.out.println(a ^ b); // 11010110 ^ 11110001 результат 00100111
        System.out.println(a>>1); //  11010110 >> 1 результат 11101011
        System.out.println(b>>2); //  11110001 >> 2 результат 11111100
        System.out.println(a<<1); //  11010110 << 1 результат 10101100
        System.out.println(b<<2); //  11110001 << 2 результат 11000100
        System.out.println(a>>>1); // 11010110 >>>1 результат 11101011
        System.out.println(b>>>2); // 11110001 >>>2 результат 11111100
        System.out.println(a<<=y); // 11010110 <<=1 результат 10101100
        System.out.println(b<<=y);//  11110001 <<=1 результат 11100010
        System.out.println(a>>=y);//  10101100 >>=1 результат 11010110
        System.out.println(b>>=y);//  11100010 >>=1 результат 11110001
        System.out.println(a>>>=y);// 11010110 >>>=1 результат 11101011
        System.out.println(b>>>=y);// 11110001 >>>=1 результат 11111000
        System.out.println(a&=y); //  11101011 &=00000001 результат 00000001
        System.out.println(b&=y); //  11111000 &=00000001 результат 00000000
        System.out.println(a|=y); //  11101011 |=00000001 результат 00000001
        System.out.println(b|=y); //  11111000 |=00000001 результат 00000001
        System.out.println(a^=y);//   11101011 ^=00000001 результат 00000000
        System.out.println(b^=y);//   11111000 ^=00000001 результат 00000000
    }
}