package DSA.Recursion_Advance;
public class Digital_root {
    public static void main(String[] args) {
        System.out.println(root(444));
    }

    public static int root(int num){
        int ans =0;
        int count =0;
        while (num !=0) {
            ans+=num%10;
            num/=10;
            count++;
        }

        if (count ==1) {
            return ans;
        }

        return root(ans);
    }
    }
