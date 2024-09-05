import java.util.Scanner;

public class Field {
    // first function the program read
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        //primitive variables declaration
        int number =1;
        boolean isTrue = true;
        char alphabet = 'a';
        float number2 = 1;
        double number3 = 1.1;
        long number4 = 1;

        // non-primitive variables declaration
        String text;
        int[]numbers = new int[4];
        numbers[0] = 1;
        System.out.println(numbers.length);
        text = "123";
        // multiple variables declaration
        int x =0, y =1;


        // constant variables declaration (use all cap letters)
        final int NUMBER5 = 1;

        System.out.println("hello JAVA " + number4+alphabet+number3+isTrue+number);

        // Type Casting
        // Widen Casting >> convert smaller to larger type (automatically)
        // byte -> short -> char -> int -> long -> float -> double
        number3 = number4;
        // Narrowing Casting >> convert larger to smaller type (DIY)
        // double -> float -> long -> int -> char -> short -> byte
        number = (int)number2;
        
        // Convert String to Int or to XX
        number = Integer.parseInt(text);
        number3 = Double.parseDouble(text);

        // Convert Integer to String
        text = String.valueOf(number2);
        System.out.println("hello JAVA2 " + number3 + text +NUMBER5+x+y+number4+number2+text);


        // Get input from keyboard
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("what's your name: ");
        String myname = sc.nextLine();
        System.out.println("Your name is "+myname);



        
        
    }
    

}
