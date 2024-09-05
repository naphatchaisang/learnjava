public class IfStatement {

@SuppressWarnings("unused")
public static void main(String[] args) {
    int a =1, b=2;

    // If statement
    if(a < b){
        System.err.println("a is less than b");
    }else if(a == b){
        System.out.println("a is equal to b");
    }else{
        System.out.println("a is more than b");
    }

    // Switch case
    switch (a) {
        case 1 -> System.out.println("a is 1");
        default -> throw new AssertionError();
    }

    //Ternary Operator
    System.out.println((1 > 0)? 1:0);

}
}
