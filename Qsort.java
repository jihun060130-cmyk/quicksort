import java.util.Arrays;

public class Qsort {
    static int partition(int[] b, int s, int e){ //partition
        int i=s+1;
        int j=e;
        while(i<=j){
            while((i<=e)&&(b[i]<b[s])) i++;
            while((j>=s+1)&&(b[j]>b[s])) j--;
            if(i>=j) break;
            int tmp=b[j]; b[j]=b[i]; b[i]=tmp;
        }
        int tmp=b[j]; b[s]=b[j]; b[j]=tmp;
        return j;
    }
    static void qsort(int[] b, int s, int e){
        if(s>=e) return;
        int p= partition(b, s, e);
        qsort(b,s,p-1);
        qsort(b,p+1,e);
    }

    static void quick(int[] b){
        qsort(b,0,b.length-1);
    }
    public static void main(String[] args) {
        int[] b={45,56,98,256,45,1,3,5,7,9,8,5,4,6,2,9,456,2135,897,351};
        quick(b);
        System.out.println(Arrays.toString(b));
    }
}