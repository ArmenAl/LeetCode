package LeetCode_Easy;

public class LeetCode_1025 {
    public static void main(String[] args) {
        int n = 2;
        int n1 = 3;

        divisorGame(n);
        divisorGame(n1);
    }
    public static boolean divisorGame(int N) {
        if(N%2 == 1){
            return false;
        }
        return true;
    }
}
