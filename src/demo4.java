import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo4 {
    public static int[]judege(int[] w){
        int i=1;
        int j;
        int[] re=new int[w.length];
        int[] count=new int[w.length];

        for (int k=0;k<re.length;k++){
            count[k]=k;
        }

        while (i<w.length){
            int x=w[i];
            j=i-1;
            while(j>-1){
                if (x<w[j]){
                    w[j+1]=w[j];
                    re[i]++;
                    j-=1;

                }
                else {
                    w[j+1]=x;
                    j=-2;
                    count[i]=count[i]-re[i];
                }

                }
            if (j==-1){
                w[0]=x;


            }
            i=i+1;

        }

        return count;
    }

    public static void main(String[] args) {
        int []w=new int[]{1,7,6,3,5,1};
        System.out.println(Arrays.toString(w));
        System.out.println(Arrays.toString(judege(w)));
    }
}
