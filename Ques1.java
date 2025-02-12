//Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {

        List<Float> floatList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter 5 floating point numbers: ");
        while(i <= 5){
            Float num = sc.nextFloat();
            floatList.add(num);
            i++;
        }
        Float sum = new Float(0);
        Iterator<Float> it = floatList.iterator();
        while(it.hasNext()){
            sum =  sum + it.next();
        }
        System.out.println("Sum of float point list is: "+sum);
    }
}
