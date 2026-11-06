import java.util.Arrays;
import java.util.Scanner;

public class qqsort{
    static int partition(int[]b, int s, int e){
        int i=s+1;
        int j=e;
        while(i<=j){
            while((i<=e)&&(b[i]<=b[s])) i++;
            while((j>=s+1)&&(b[j]>=b[s])) j--;
            if(i>=j) break;
            int tmp=b[j]; b[j]=b[i]; b[i]=tmp;
        }
        int tmp=b[j]; b[s]=b[j]; b[j]=tmp;
        return j;
    }
    static void Qsort(int[]b, int s, int e){
        if(s>=e) return;
        int p= partition(b,s,e);
        Qsort(b, s, p-1);
        Qsort(b, p+1,e);
    }
    static void quick(int[] b){
        Qsort(b,0,b.length-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] b = new int[n];
        
        for(int i=0; i<n;i++){
            b[i]=sc.nextInt();
        }
        quick(b);
        System.out.println(Arrays.toString(b));
    }
}