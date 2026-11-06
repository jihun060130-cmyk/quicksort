import java.util.Arrays;

public class quicksort {
    static int partition(int[] b, int s, int e){
        int i=s+1;
        int j=e;
        while(i<=j){
            while((i<=e)&&(b[i]<=b[s]))i++;
            while((j>=s+1)&&(b[j]>=b[s]))j--;
            if(i >= j) break;
            int tmp = b[j]; b[j] = b[i]; b[i] = tmp;
        }
        int tmp = b[j]; b[j] = b[s]; b[s] = tmp;
        return j;
    }
    static void quick(int[] b, int s, int e){
        if(s>=e) return;
        int p= partition(b, s, e);
        quick(b, s, p-1);
        quick(b,p+1,e);
    }
    static void Qsort(int[] b){
        quick(b,0,b.length-1);
    }
    public static void main(String[] args) {
        int[] b={40,54,23,56,78,52,55};
        System.out.println(Arrays.toString(b));
        Qsort(b);
        System.out.println(Arrays.toString(b));
    }
    
}