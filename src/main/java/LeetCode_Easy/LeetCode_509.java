package LeetCode_Easy;

public class LeetCode_509 {
    public static void main(String[] args) {
        int n = 2;
        fib(67);  //F(N) = F(N - 1) + F(N - 2)
    }

    public static int fib(int N) {
        int F0 = 0;
        int F1 = 1;
        int F2 = 1;

        if(N == 0){
            return 0;
        }
        for (int i = 1; i < N; i++) {
            F2 = (F1 + F0);
            F0 = F1;
            F1 = F2;
            System.out.println(F2);
        }
        return F2;
    }
}
