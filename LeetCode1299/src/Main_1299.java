import java.util.Arrays;

public class Main_1299 {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};    // output [18,6,6,6,1,-1]
        replaceElements(arr);
    }

    public static int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = res[arr.length-1] = -1;
        System.out.println(Arrays.toString(res));

        for(int i = arr.length - 1; i > 0; i--){
            //System.out.println(arr[i]);
            if(max > arr[i]){
                res[i-1] = max;
            }else {
                max = arr[i];
                res[i-1] = max;
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
