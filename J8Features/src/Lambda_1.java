
/*
* @author Gershom Nsengiyumva
*
* Lambda functions allow to treat functionality as an argument or to create anonymous function
* without a need of defining a class.
*
* Functional interface: an interface with a single abstract method
* */

// functional interface
interface  FunctInterface
{
    void abstractFunc(int x);

    // non-abstract(default function)
    default void normalFun(){
        System.out.println("Hello from functional interface");
    }
}
public class Lambda_1 {

   /* User defined functional interface */
    interface  FuncInterface2{
        int operation(int a, int b);
   }

   // use the interface as an argument
    public int operate(int a, int b, FuncInterface2 fobj){
        return fobj.operation(a,b);
    }
}
