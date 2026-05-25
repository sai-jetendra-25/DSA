
public class FindFirstAndLastPosition{
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,6,7,7,7,8,9};
        int target =3;
         int first = FirstIndex(arr, target);
        int last  = LastIndex(arr, target);

        System.out.println("First Position: " + first);
        System.out.println("Last Position:  " + last);  

        
    }
     static int FirstIndex(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                ans=mid;
                e=mid-1;
            }


        }
        return ans;
    }
     static int LastIndex(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }


        }
        return ans;
    }

}