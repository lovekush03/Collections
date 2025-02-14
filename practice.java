import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface Calculator{
    int operation(int num1, int num2);
}

class Add{
    int add(int num1,int num2) {
        return num1 + num2;
    }
    int subtract(int num1,int num2){
        return num1 - num2;
    }
    static int multiply(int num1, int num2){
        return num1 * num2;
    }
}

public class practice {
    public static void main(String[] args) {

        /*Lambda Function Implementation
        Calculator calc1 = (num1,num2) -> {
            return num1 + num2;
        };
        Calculator calc2 = (num1,num2) -> {
            return num1 - num2;
        };
        Calculator calc3 = (num1,num2) -> {
            return num1 * num2;
        };
        System.out.println(calc1.operation(12,15));
        System.out.println(calc2.operation(12,15));
        System.out.println(calc3.operation(12,15));




        Method Referencing by static and instance method Implementation

        Calculator calc1 = new Add()::add;
        Calculator calc2 = new Add()::subtract;
        Calculator calc3 = Add::multiply;
        System.out.println(calc1.operation(12,15));
        System.out.println(calc2.operation(12,15));
        System.out.println(calc3.operation(12,15)); */

        List<Integer> numList = Arrays.asList(1,5,8,6,4,9,7);
        for (Integer num : numList){
            num = num + 10;
        }


    }
}
