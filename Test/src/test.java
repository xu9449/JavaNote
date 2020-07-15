import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        test s = new test();
        String result = s.replace("appledogapple","apple","cat" );
    }
        public String replace(String input, String source, String target) {
            // scan the string and find the match indexs
            char[] in = input.toCharArray();
            char[] s = source.toCharArray();
            char[] t = target.toCharArray();
            List<Integer> list = new ArrayList<>();
            int threshold = input.length() - source.length();
            for(int i = 0; i <= threshold; i++){
                if(input.substring(i, i+source.length()).equals(source)){
                    list.add(i);
                }
            }
            int dif = target.length() - source.length();
            int newlength = input.length() + dif * list.size();
            char[] newArray = new char[newlength];
            // two pointer to copy the array to new array

            int targetP = 0;
            for(int sourceP = 0; sourceP < in.length; sourceP++){
                if((sourceP + source.length()) <= in.length && input.substring(sourceP, sourceP + source.length()).equals(source)){
                    for(Character c : t){
                        newArray[targetP++] = c;
                    }
                    sourceP = sourceP + source.length() - 1;
                } else{
                    newArray[targetP++] = in[sourceP];
                }
            }

            return new String(newArray);
        }


    }

    // map(string, List<String>), all the maps value as a arraylist

