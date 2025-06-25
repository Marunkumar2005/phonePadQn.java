import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class phonePad {

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;

        }
        //first digit
        int digit = (int) up.charAt(0) - '0';//this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            pad(p + ch, up.substring(1));

        }
    }
//returning as an arraylist

    static ArrayList<String> padreturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);


            return list;

        }
        //first digit
        int digit = (int) up.charAt(0) - '0';//this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            list.addAll(padreturn(p + ch, up.substring(1)));

        }
        return list;

    }
//returning the count

    static int padreturncount(String p, String up) {
        if (up.isEmpty()) {

            return 1;

        }
        //first digit
        int digit = (int) up.charAt(0) - '0';//this will convert '2' into 2
        int count=0;



        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);

        count=count+padreturncount(p+ch,up.substring(1));

        }
        return count;


    }

    public static void main(String[] args) {
        System.out.println(padreturncount("" ,"23"));
    }


}
