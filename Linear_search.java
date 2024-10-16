
import java.util.Scanner;

public class linear_search {
    public static int search(int[] arr, int target)
    {
        if(arr.length==0)
            return -1;
        for(int i =0;i< arr.length;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target;
        target = sc.nextInt();
        int ans=search(arr,target);
        System.out.println(ans);

sc.close();
    }
}
