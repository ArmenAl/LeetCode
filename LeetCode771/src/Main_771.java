public class Main_771 {
    public static void main(String[] args) {
        //String jewels = "aA";
        //String stones = "aAAbbb";
        String jewels = "z";
        String stones = "ZZ";
        numJewelsInStones(jewels, stones);
    }

    public static int numJewelsInStones(String J, String S) {
        int quantity = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int k = 0; k < J.length(); k++){
                char j = J.charAt(k);
                char s = S.charAt(i);
                if (j == s) {
                    quantity++;
                }
            }
        }
        System.out.println(quantity);
        return quantity;
    }
}
