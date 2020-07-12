public class l557 {
    public static void main(String[] args) {
        l557 s = new l557();
        String res = s.reverseWords("a b d ee$#% aef$ea eaef eaj ae##ea'fe");
        System.out.println(s);
    }
    public String reverseWords(String s) {
        if(s.isEmpty()){
            return s;
        }
        char[] arr = s.toCharArray();
        int left = 0;
        for(int i = 0; i < arr.length; i++){
            if(i < arr.length - 1 && arr[i + 1] == ' '){
                reverse(arr, left, i);
                left = i + 2;
                i = i + 1;
            } else if(i == arr.length - 1){
                reverse(arr, left, i);
            }
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right){
        if(left == right) return;
        for(int i = left; i <= right; i++){
            char tmp = arr[i];
            arr[i] = arr[right];
            arr[right] = tmp;
            right--;
        }
    }
}
