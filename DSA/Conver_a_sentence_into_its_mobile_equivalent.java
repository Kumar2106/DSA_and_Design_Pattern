package DSA;
public class Conver_a_sentence_into_its_mobile_equivalent {
    
    public static void main(String[] args) {
        String input = "GEEKSFORGEEKS";
        String str[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"
                    };
        System.out.println(converting(input, str)); 
    }

    static String converting(String input, String str[]){
        String result = "";
        for(int i=0; i<input.length(); i++){
            if (input.charAt(i) == ' ') {
                result+="0";
            }else{
                result+= str[input.charAt(i) - 65];
            }
        }

        return result;
    }
}
