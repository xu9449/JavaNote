import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchex {
    // * X, zero or more times

    public static void main(String[] args) {
        RegexMatchex solution = new RegexMatchex();
        String pattern = "^ASCENDING-\\w{1,10}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher("a*b");
        String string = "burger.letters.com - - [01Jul1996:00:0012 -0400] 'GET/images/NASA-logosmall.GIF' HTTP/1.0";
        boolean b = solution.simpleDemo(string);

        System.out.println(b);
    }

    public boolean simpleDemo(String line){
//        String pattern = "(.*)(GET.*\\.gif|GET.*\\.GIF)(.*)";
        String pattern = "(.*)(/images.*\\.gif|/images.*\\.GIF)(.*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        if(m.find()){
            System.out.println("Found value:" + m.group(0));
            System.out.println("Found value:" + m.group(1));

            System.out.println("Found value:" + m.group(2));



            System.out.println("Found value:" + m.group(3));




        }
        return true;
    }
}
