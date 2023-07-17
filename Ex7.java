
package ex7;
import java.util.*;

public class Ex7 {
    public int productSmallestPair (int arr[], int n, int sum){
        Arrays.sort(arr);
        int check=0;
        check = arr[0] + arr[1];
if (check <= sum)
return arr[0] * arr[1];
else
return 0;
    }

  
    public static void main(String[] args) {
       Ex7 e=new Ex7();
        Scanner sc = new Scanner (System.in);
        System.out.println("enter sum");
int sum = sc.nextInt ();
        System.out.println("enter no of element");
int n = sc.nextInt ();
int arr[] = new int[n];
System.out.println("enter array element");
for (int i = 0; i < n; i++)
arr[i] = sc.nextInt ();
int k=e.productSmallestPair (arr, n, sum);
System.out.println(k) ;
    }
    
}
