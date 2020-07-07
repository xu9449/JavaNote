
import java.util.regex.Pattern;

public class SplitString {


    public static void main(String[] args) {
        String Regex = " |\\W";
        String INPUT = "I am. ??? Kex ,,,,,in Xu";
//        Pattern pattern = Pattern.compile(Regex);
        int num  = 0;
        String[] result = INPUT.split(Regex);
        for(String st : result){
            num = num + st.length();
        }
        Double a = 1.0;
        int b = 2;

        double c = a+ b;
        int d = (int)c;

        System.out.println(num);
    }

}
