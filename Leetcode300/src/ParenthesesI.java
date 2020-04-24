import java.util.ArrayList;
import java.util.List;

public class ParenthesesI {

    public static void main(String[] args) {
        ParenthesesI solution = new ParenthesesI();
        int a = 3;
        List<String> r1 = solution.validParentheses(a);
        System.out.println(r1);
    }
    List<String> result = new ArrayList<>();

    public List<String> validParentheses(int n) {
        StringBuilder sb = new StringBuilder();
        DFS(n, 0, 0, sb);
        return result;
    }

    public void DFS(int n, int l, int r, StringBuilder soluPrefix){

        if(l == n && r == n) {
            result.add(soluPrefix.toString());
        }

        if(l < n) {
            soluPrefix.append('(');
            DFS(n, l+1, r, soluPrefix);
            soluPrefix.deleteCharAt(soluPrefix.length() - 1);
        }

        if(l > r){
            soluPrefix.append(')');
            DFS(n, l, r+1, soluPrefix);
            soluPrefix.deleteCharAt(soluPrefix.length() - 1);
        }
    }
}
