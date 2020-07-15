import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        /* '*' means zero or more times */
        String pattern = "^ASCENDING-";                            
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher("ASCENDING-wwww");
        boolean b = m.matches();
        System.out.println(b);
        RegularExpression s = new RegularExpression();
        s.splitAPIUrl("\"forecast\": \"https://api.weather.gov/gridpoints/TOP/31,80/forecast\",");
        // [] 里面都是或，[中的^为取反]
        // 不仅可以用 match，还可以用split
        // 注意 greedy 模式
    }

    public boolean splitAPIUrl(String url){
        String pattern = "(^\\\"forecast\\\").*(https:.*forecast)(\\\",)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(url);
        if(m.find()){
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("No Match");
        }
        return m.find();
    }
}
