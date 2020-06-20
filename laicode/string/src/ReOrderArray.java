import java.util.Arrays;

public class ReOrderArray {
    public int[] reorder(int[] array) {
        if(array.length <= 1) {
            return array;
        }

        int mid;
        if(array.length % 2 == 0){
            mid = array.length /2 - 1;
        } else {
            mid = (array.length - 1) / 2 -1;
        }

        for(int i = 0; i <= mid; i++){
            swap(array, i, mid, array[i]);
        }
        for(int i = 1; i < array.length; i++){
            if(array[i] <= 0) {
                array[i] = -array[i];
            }
        }
        return array;
    }
    private void swap(int[] array, int index, int mid, int tmp){
        if(index == 0) return;
        int newIndex;
        if(index <= mid) {
            newIndex= index * 2;
        }else {
            newIndex = (index - mid - 1) * 2 + 1;
        };
        if(array[newIndex] < 0) return;
        int tmp1 = array[newIndex];
        array[newIndex] = -tmp;
        swap(array, newIndex, mid, tmp1);
    }

    public static void main(String[] args) {
        ReOrderArray s = new ReOrderArray();
        int[] arr = {1, 2, 3, 4};
        int[] res = s.reorder(arr);
        System.out.println(Arrays.toString(res));
    }
}
