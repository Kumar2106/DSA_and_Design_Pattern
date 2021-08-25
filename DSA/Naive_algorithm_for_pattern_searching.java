package DSA;
/**
 * Naive_algorithm_for_pattern_searching
 */
public class Naive_algorithm_for_pattern_searching {

    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        rabin_karp_search(txt, pat);
    }

    static void search(String txt, String pat){
        int n = txt.length();
        int m = pat.length();

        for(int i=0; i<n-m; i++){
            int j;

            for(j=0; j<m; j++){
                if (txt.charAt(i+j) != pat.charAt(j)) {
                    break;
                }
               
            }

            if (j==m) {
                System.out.println("Pattern found at index:" + i);
            }
        }
    }

    static void rabin_karp_search(String txt, String pat){

        int h=1;
        int p=0;
        int t=0;
        int i,j;
        int q=3;
        int d=256;
        int n = txt.length();
        int m = pat.length();

       for(i=0; i<m; i++){
           h = (h*d) %q;
       }

       for(i=0; i<m; i++){
           p= (p*d + pat.charAt(i)) % q;
           t = (t*d + txt.charAt(i)) % q;
       }

       for( i=0; i<n-m; i++){
           if (p==t) {
               
                for(j=0; j<m; j++){
                    if (txt.charAt(i+j) != pat.charAt(j)) {
                        break;
                    }
                }

                if (j==m) {
                    System.out.println("The pattern has been found at index: "+ i);
                }
           }

           if (i<n-m) {
               t = ( d*(t-txt.charAt(i) *h) + txt.charAt(i+m))%q;
               if(t<0){
                   t=t+q;
               }
           }
       }

    }


}