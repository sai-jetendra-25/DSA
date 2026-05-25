public class LowerBound{

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 7};
        int target = 3;

        System.out.println("Lower Bound: " + lowerBound(arr, target)); // 1
    }

    static int lowerBound(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        int ans = arr.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > target) {
                  e=mid-1;
            } else if(arr[mid]<target) {
                s = mid + 1;
            }
            else{
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }
}

