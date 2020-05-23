public class RemoveUnderlineOfSente {
    public static void main(String[] args) {
        RemoveUnderlineOfSente s = new RemoveUnderlineOfSente();
        String input = "__I_am__a___student___";
        String result = s.trailing(input);
        System.out.println(result);
    }
    private String trailing(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        char[] arr = input.toCharArray();
        int left = 0;
        int right = 0;
        // remove the leading space
        while (left == 0 && arr[right] == '_') {
            right++;
            if (right == arr.length - 1) {
                return "";
            }
        }
        left = right;

        // mid part
        StringBuilder sb = new StringBuilder();
        while (left < arr.length) {
            sb.append(arr[left]);
            right = left + 1;
            // right != '_'
            if (right < arr.length && arr[right] != '_') {
                left = right;
                right++;
            } else {
                // right == arr.length - 1 || right == '_'
                while (right + 1 < arr.length && arr[right] == '_' && arr[right + 1] == '_') {
                    right++;
                }
                // c1: to the end
                if (right == arr.length - 1) {
                    return sb.toString();
                }
                if (right == arr.length - 2) {
                    if (arr[right + 1] != '_') {
                        sb.append(arr[right + 1]);
                    }
                    return sb.toString();
                }
                // c2: to the next char
                sb.append(arr[right]);
                left = right + 1;
            }
        }
        return sb.toString();

    }
}
