public class ReverseWorldSenten {
    public String reverseWords(String input) {
        // Write your solution here
        if(input.length() <= 1 || input == null) return input;
        char[] arr = input.toCharArray();
        int rp = arr.length - 1;
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >=0 ; i--){
            if(arr[i]==' '){
                sb.append(input.substring(i, rp+1));
                sb.append(arr[i]);
                i --;
                rp = i;
            }else if(i == 0){
                sb.append(input.substring(i, rp + 1));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        char[] res = {'c','v','s'};
        char[] arr = res;
        arr[2] = 'x';
        System.out.println(res);
    }
}
