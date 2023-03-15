package mock;

import java.util.ArrayList;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {

    }
    //Write a Program to remove duplicates in an ArrayListTest

    public static ArrayList<String>removeDuplicates(ArrayList<String>arrList){
        ArrayList<String>resultArr=new ArrayList<>();
        for(String str : arrList){
            if(!resultArr.contains(str)){
                resultArr.add(str);
            }
        }
        return resultArr;

    }
}
