package JavaTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapReverseRemoveAhmed {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a+b;//30
        b= a-b;  //10
        a = a-b;

        System.out.println(a+" =a "+b+" =b");

  //---------------------------------------------------------------------
//Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
//Write a java operation to remove all the names named Ahmed

        List<Integer> arrlist = new ArrayList<Integer>();

//for(Integer i = 0 ; i<9;i++) {
//	arrlist.add(i);

        arrlist.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7,7,7,7,7,7));
        System.out.println(" 1 "+arrlist);

        arrlist.removeAll(Arrays.asList(1));

        arrlist.removeAll(Arrays.asList(2));

        System.out.println("!!! "+arrlist);


        String str4 = arrlist.toString().replace("[", "").replace("]", "").replace(",", "");
        System.out.println(str4);
//----------------------------------------------------------------------------


//to reverse elements in the array
        String [] arr = {"hi","how","are","yofdsu"};
        String [] word= new String[ arr.length];

        int x =  arr.length-1; //this is the last index of the array

        for(int i=0;i< arr.length;i++) {
            word[i]= arr[x];
            x--;  //decrease
        }

        System.out.println(Arrays.toString(word));

//----------------------------------------------------------
// find the common elements

        String [] whatever = {"hi","how","are","YO"};

        String [] whatever2 = {"are","who","hi","you","YO"};
        List<String> common = new ArrayList<String>();

        for (int i = 0; i < whatever.length; i++) {

            for ( int j = 0; j< whatever2.length;	j++ ) {

                if (whatever[i] == whatever2[j]) {
                    if(!common.contains(whatever[i] )) {
                        common.add(whatever[i]);
                    }
                }
            }
        }
        System.out.println("=======================");
        System.out.println(common);
        System.out.println("=======================");
//--------------------------------------------------------------------------------------
//find the uncommon elements
        List<String> notCommon = new ArrayList<String>();
        for (int i = 0; i < whatever.length; i++) {
            for (int j=0; j< whatever2.length; j++) {
                if(whatever[i]==whatever2[j]) {
                    break;
                }
                if(whatever[i]!=whatever2[j] && j== whatever2.length-1) {
                    if(!notCommon.contains(whatever[i] ) ) {
                        notCommon.add(whatever[i]);
                    }
                }
            }
        }

        System.out.println("+++++++++++++++++++++++++");
        System.out.println(notCommon);
        System.out.println("=======================");

//System.out.println(Arrays.toString(whatever));
    }
}
/*
CONSOLE OUTPUT
20 =a 10 =b
 1 [1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7]
!!! [3, 4, 5, 6, 7, 7, 7, 7, 7, 7]
3 4 5 6 7 7 7 7 7 7
[yofdsu, are, how, hi]
=======================
[hi, are, YO]
=======================
+++++++++++++++++++++++++
[how]
=======================

 */