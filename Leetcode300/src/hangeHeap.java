public class hangeHeap {
    public static void heapify(int[] nums){
        for (int i=(nums.length/2)-1;i>0;i--){
            heapify(nums,i);
        }
    }

    private static void heapify(int[] nums,int index){
        int largerIndex=index;
        int leftIndex=(2*index)+1;
        int rightIndex=(2*index)+2;
        if (leftIndex<nums.length && nums[largerIndex]<nums[leftIndex]){
            largerIndex=leftIndex;
        }else if (rightIndex<nums.length && nums[largerIndex]<nums[rightIndex]){
            largerIndex=rightIndex;
        }

        if (index!=largerIndex) {
            swap(nums, index, largerIndex);
            heapify(nums, largerIndex);
        }
    }
    public static void swap(int[] nums,int a,int b){
        int temp =nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
