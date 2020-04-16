package LeetCode_Easy;

public class LeetCode_896 {
    public static void main(String[] args) {
        int[] v = {1, 2, 2, 3};
        isMonotonic(v);
    }

    public static boolean isMonotonic(int[] A) {
        return increase(A) || decrease(A);
    }

    public static boolean increase(int[] A) {
        int last = A[0];
        for (int i = 1; i < A.length; i++) {
            if (!(last <= A[i])) {
                return false;
            }
            last = A[i];
        }
        return true;
    }

    public static boolean decrease(int[] A) {
        int last = A[0];
        for (int i = 1; i < A.length; i++) {
            if (!(last >= A[i])) {
                return false;
            }
            last = A[i];
        }
        return true;
    }
}
