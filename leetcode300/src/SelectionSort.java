//import java.util.*;
//
//public class SelectionSort {
//    public static void main(String[] args) {
//        SelectionSort solution = new SelectionSort();
//        int[] array = { 2, 4, 1, 5, 6, 3};
//        List<String> list = new ArrayList<String>();
//        list.add("sdaf");
//        list.add("dsaf");
//        list.add("sdfasdf");
//
//        String input = "ccdeee";
//        String target = "ce";
//        String result = solution.remove(input, target);
//        System.out.println(result);
//    }
//
//    public String removeLead(String input, String target){
//        if(input == null || input.length() == 0|| target == null ||    target.length() == 0){
//            return input;
//        }
//        char[] array = input.toCharArray();
//        char[] target2 = target.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        List<Integer> list = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        list = helper(input, target2, sb, 0, array.length - 1);
//        for(Integer i: list){
//            for(int j = 0; j < array.length(); j++){
//                if(j == i);
//                sb.append(array[j]);
//            }
//            return sb.toString();
//        }
//
//        public list helper(char[] input, Char[] target, StringBuilder sb, int left, int right){
//            List<Integer> list = new ArrayList<>();
//            while(left <= right) {
//                int mid = left + (right - left)/2;
//                for(char c1: target){
//                    boolean notFound = notFound(input.substring(0, mid), c1);
//                    if(input[mid] == c1 && notfound){
//                        list.add(mid);
//                        break;
//                    }
//                    if(!notFound){
//                        right = mid;
//                    } else {
//                        left = mid;
//                    }
//                }
//            }
//        }
//
//        public boolean notFound(Char[] input, Char ch) {
//            for(char c: input) {
//                if(c==ch){
//                    return false;
//                }
//            }
//            return true;
//        }
//
//
//
//        // 问题： 没有check array是null 或者length < 1
//    // Time: O (n^2)
//    // Space: O(1)
//}
