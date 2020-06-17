public class StringReplace {
    public String replace(String input, String source, String target) {
        if(input.length() == 0){
            return input;
        }
        // Write your solution here
        char[] inp = input.toCharArray();
        char[] sor = source.toCharArray();
        char[] tar = target.toCharArray();
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i<inp.length; i++){
            int p = i;
            if(inp[p]==sor[0]){
                for(char c : sor){
                    if( p > inp.length - 1|| inp[p] != c){
                        break;
                    }
                    p++;
                }
                if(p == i + sor.length) {
                    for(char t : tar){
                        sb.append(t);
                    }
                    i = p - 1;
                }else{
                    sb.append(inp[i]);
                }
            } else {
                sb.append(inp[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringReplace s = new StringReplace();
        String res = s.replace("ecuadorbermudacuraindiaaojerseyindiabenin", "india", "fiji");
        System.out.println(res);
    }
}
