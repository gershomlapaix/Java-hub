import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Lambda expressions */
        FunctInterface fobj = (int x) -> System.out.println(4 *x);

        // call the above lambda expression
        System.out.println("The result of lambda expression:");
        fobj.abstractFunc(5);
        fobj.normalFun();


        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(2);
        arrL.add(53);
        arrL.add(6);
        arrL.add(4);
        arrL.add(5);

        arrL.forEach( n -> System.out.println(n));

        /* Get even numbers*/
        System.out.println("\n Get only the even numbers::");
        arrL.forEach( n -> {
            if(n % 2 == 0){
                System.out.println(n);
            }
        });

        /* more with lambda expressions */
        System.out.println("\n More::");
        Lambda_1.FuncInterface2 add = (int num1, int num2) -> num1+num2;
        Lambda_1 lambda1 = new Lambda_1();
        System.out.println( lambda1.operate(4,5, add));

        /* Method references
        * Provide a way to refer to the methods or constructors without executing them. They are
        * shorthand notation for lambda expressions to call methods
        * */

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // sort the names

        // 1. using lambda expressions
        names.sort((s1,s2)-> s1.compareTo(s2));
        System.out.println("\n Sorted names:: " + names);

        // 2. using method references
        names.sort(String::compareToIgnoreCase);
        System.out.println("\n Sorted names:: " + names);
    }
}