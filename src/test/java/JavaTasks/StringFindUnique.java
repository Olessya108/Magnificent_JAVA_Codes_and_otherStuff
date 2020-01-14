package JavaTasks;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringFindUnique {


    public static void main(String[] args) {

        //with StringBuffer

        String orig = "Radar";
        StringBuffer sp = new StringBuffer(orig);
        sp.reverse();
        boolean a = orig.equalsIgnoreCase(sp.toString());
        System.out.println(a);

        //with loop
        String b = "Level";
        String newB = "";

        for (int i = b.length()-1; i >=0 ; i--) {
            newB+=b.toLowerCase().charAt(i);

        }

        System.out.println(newB);
        System.out.println(newB.equals(b));


        //find uniq from array

        String str="aaaabbbbdddccc";
        String unique="";//abdc

        String[] str2=str.split("");
        System.out.println(Arrays.toString(str2));

        Set<String> str3 = new TreeSet<String>(Arrays.asList(str2));


        System.out.println("@@@@"+str3.toString());
        String str4=str3.toString();
        System.out.println("hola ---  "+str4.substring(1,str4.length()-1));
        String str5=str4.substring(1,str4.length()-1);
        str5.replace(",","");
        System.out.println("hi ---"+str5.replace(", ",""));


        for(int i=0;i<=str.length()-1;i++) {
            if(!unique.contains(""+str.charAt(i))) {
                unique+=""+str.charAt(i);
            }
        }
        System.out.println(unique);

        int count=0;
        for(int i=0;i<unique.length();i++) {
            count=0;
            for(int j=i; j<str.length();j++) {
                if((""+unique.charAt(i)).equals(""+str.charAt(j))) {
                    count++;
                }
            }
            System.out.print(""+unique.charAt(i)+count);
        }
    }
}
