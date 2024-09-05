public class Operator {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int a =1;
        int b =2;

        // Math Operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println("a: "+a);

        // Prefix (+,-) increase or decrease first then use value
        System.out.println("Prefix");
        System.out.println(++a);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);
        // Postfix (+,-) Use current value first before increase or decrease
        System.out.println("Postfix");
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);

        // Comparing Operator
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);

        // Logic Operator
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(!false);

        // Compound Assignment
        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;
        System.out.println(a);

        // Priority of operator *operate left to right if same priority
        // ()
        // ++, --
        // *, /, %
        // +, -
        // <, <=, >, >=
        // ==, !=
        // &&
        // ||
        // =, +=, -=, *=, /=, %=  *priority from right to left



    }
}
