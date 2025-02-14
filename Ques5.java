//Write a program to sort HashMap by value.

import java.util.*;

public class Ques5 {
    public static List<Map.Entry<String,Integer>> sortByValue(List<Map.Entry<String,Integer>> lst){
        Collections.sort(lst,new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() > o2.getValue()) return 1;
                else if(o1.getValue() < o2.getValue()) return -1;
                else{
                    //if similar length Strings then return the string which comes first in the array
                    if(lst.indexOf(o1) > lst.indexOf(o2)) return 1;
                    else return -1;
                }
            }
        });
        return lst;
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Dog");
        strList.add("Lion");
        strList.add("Cat");
        strList.add("Tiger");
        strList.add("Cheetah");
        strList.add("Monkey");
        strList.add("sqirrel");

        //converting above list into a map<String,Integer> key: String and value is the Length
        Map<String,Integer> lengthMap = new HashMap<>();
        System.out.println("Before Sorting");
        for (String str : strList){
            lengthMap.put(str,str.length());
        }
        //Printing Map
        System.out.println(lengthMap);
        //Convert the Map into Entry Set
        Set<Map.Entry<String,Integer>> etrSet = lengthMap.entrySet();
//        System.out.println(etrSet);
        List<Map.Entry<String,Integer>> lst = new ArrayList<>(etrSet);

        //Sorting the List by Length and if Length is same printing string which comes first in array
        lst = sortByValue(lst);

        System.out.println("After Sorting ");
        for(Map.Entry<String,Integer> entry: lst){
            System.out.println(entry);
        }

    }
}
