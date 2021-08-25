package DSA;
public class Booyer__moore__algorithm {

    static int[] pa = new int[256];

    public static void main(String[] args) {
        char txt[] = "ABAAABCD".toCharArray();
         char pat[] = "ABC".toCharArray();
         search(pat, txt, pa);
    }

    static void precompute(char pat[], int[] pa){
        for(int i=0; i<256; i++){
            pa[i] = -1;
        }

        for(int i=0; i<pat.length; i++){
            pa[(int) pat[i]] =i;
        }
    }

    static void search(char pat[], char txt[], int[] pa){
        precompute(pat, pa);
        
        int n = txt.length;
        int m = pat.length;

        int s =0;
        while (s<=(n-m) ) {
            int j=m-1;
            while(j>=0 && pat[j] == txt[s+j]){
                j--;
            }

            if (j<0) {
                System.out.println("Pattern is found on s index"+ s);
                s+= (s+m <n)? m-pa[txt[s+m]]:1;
            }else{
                s+= Math.max(1, j-pa[txt[s+j]]);
            }

        }

    }


}
