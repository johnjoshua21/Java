import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

     public static int Bsearch(int[] nums,int target,int s,int e){
         if (e>=s){
             int mid=(s+e)/2;
             if (nums[mid]==target) {
                 return mid;
             }
              else if (nums[mid]>target) {
                 return Bsearch(nums,target,s,mid-1);
             }
             else {
                 return Bsearch(nums,target,mid+1,e);
             }
         }
         return -1;
    }

    static int Lsearch(int[] nums,int target){
         for (int i=0;i< nums.length;i++){
             if (nums[i]==target){
                 return i;
             }

         }
         return -1;
    }
    public static void main(String[] args) {
        int[] nums={5,9,2,7,4,8};//2,4,5,7,8,9
        Arrays.sort(nums);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to search");
        int t= sc.nextInt();
        //int ans= Bsearch(nums,t,0, nums.length-1);
        int ansl=Lsearch(nums,t);
        System.out.println("Found at "+ansl);

    }

}