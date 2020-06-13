import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses s = new ValidParentheses();
        List<String> res = new ArrayList<>();
        res = s.validParentheses(6);
        System.out.println(res);
    }

    public List<String> validParentheses(int n) {
        // Write your solution here
        List<String> res = new ArrayList<>();
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        helper(res, n, flag, 0, sb);
        return res;
    }
    private void helper(List<String> res, int n, int flag, int index, StringBuilder sb){
        if(flag < 0) return;
        if(flag == 0 && index != 0){
            res.add(sb.toString());
            return;
        }else if(index == 2*n) {
            return;
        }
        sb.append('(');
        helper(res, n, flag+1, index+1, sb);
        sb.deleteCharAt(sb.length() - 1);
//        flag = flag - 1;

        sb.append(')');
        helper(res, n, flag - 1, index + 1, sb);
        sb.deleteCharAt(sb.length() - 1);
//        flag = flag + 1;
    }
}
