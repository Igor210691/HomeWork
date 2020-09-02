package operators;

public class OperatorsMain1 {

    public static void main(String[] ar) {
        int a = 42;
        int b = 15;
        int y = 1;
        System.out.println( ~a); //  ~00101010 результат 11010101
        System.out.println( ~b);  // ~00001111 результат 11110000
        System.out.println(a | b); // 00101010 | 00001111 результат 00101111
        System.out.println(a & b); // 00101010 & 00001111 результат 00001010
        System.out.println(a ^ b); // 00101010 ^ 00001111 результат 00100101
        System.out.println(a>>1); //  00101010 >> 1 результат 00010101
        System.out.println(b>>2); //  00001111 >> 2 результат 00000011
        System.out.println(a<<1); //  00101010 << 1 результат 01010100
        System.out.println(b<<2); //  00001111 << 2 результат 00111100
        System.out.println(a>>>1); // 00101010 >>>1 результат 00010101
        System.out.println(b>>>2); // 00001111 >>>2 результат 00000011
        System.out.println(a<<=y); // 00101010 <<=1 результат 01010100
        System.out.println(b<<=y); // 00001111 <<=1 результат 00011110
        System.out.println(a>>=y); // 01010100 >>=1 результат 00101010
        System.out.println(b>>=y); // 00011110 <<=1 результат 00001111
        System.out.println(a>>>=y); // 00101010 >>>=1 результат 00010101
        System.out.println(b>>>=y); // 00001111 >>>=1 результат 00000111
        System.out.println(a&=y);   // 00010101 &=00000001 результат 00000001
        System.out.println(b&=y);  //  00000111 &=00000001 результат 00000001
        System.out.println(a|=y);  // 00000001  |=00000001 результат 00000001
        System.out.println(b|=y);  // 00000001  |=00000001 результат 00000001
        System.out.println(a^=y);  // 00000001  ^=00000001 результат 00000000
        System.out.println(b^=y);  // 00000001  ^=00000001 результат 00000000
    }
}