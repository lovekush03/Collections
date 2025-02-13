//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.


import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(5,5,4,7,9,4,3,6,7,9,3,5,9,4,9));
        Map<Integer,Integer> freqMap = new HashMap<>();
        //Creating frequency hashmap
        for(Integer num : intList) {
            if(freqMap.containsKey(num)){
                freqMap.put(num, freqMap.get(num) + 1);
            }
            else{
                freqMap.put(num,1);
            }
        }
        System.out.println("Before Sorting");
        System.out.println(freqMap);

        //create a Entry set of freqMap
        Set<Map.Entry<Integer,Integer>> etrSet = freqMap.entrySet();
        //Convert Entry set to List for implementing comparator
        List<Map.Entry<Integer,Integer>> lst = new ArrayList<>(etrSet);
        //Apply custom Comparator
        Collections.sort(lst, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() > o2.getValue()) return -1;
                else if(o1.getValue() < o2.getValue()) return 1;
                else{
                    //Compare on the basis on index
                    if(lst.indexOf(o1) > lst.indexOf(o2)) return 1;
                    else return -1;
                }
            }
        });

        System.out.println("After Sorting");
        for (Map.Entry<Integer,Integer> num : lst){
            System.out.println(num);
        }
    }
}
