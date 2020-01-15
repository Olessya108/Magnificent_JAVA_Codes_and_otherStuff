package JavaTasks;

public class avgValueInArray {
    public static void main(String[] args) {

    //write java program to calculate average value of array elements
    int[] array= {15,20,6,239,2,45};
    int sum=0;
for(int each:array) {
        sum+=each;
    }
    int avrg=sum/array.length;
System.out.println(avrg);
}}
