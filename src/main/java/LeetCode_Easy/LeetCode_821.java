package LeetCode_Easy;

import java.util.Arrays;

public class LeetCode_821 {
    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';

        shortestToChar(S, C);
    }

    public static int[] shortestToChar(String S, char C) {
        int[] tmpArr = new int[S.length()];
        //int index = 0;
        int counter = 1;
        int i = 0;
        char[] kar = S.toCharArray();
       /*for (; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                index = S.indexOf("" + C);
                for (int j = 0; j < index; j++) {
                    tmpArr[j] = index - j;
                }
                i++;
                break;
            }
        }*/

       boolean flagTarget = false;
        for (; i < S.length(); i++) {
            if (flagTarget && kar[i] != C) {
                tmpArr[i] = counter;
                counter++;
            }
            else if(!flagTarget && kar[i] != C){
                tmpArr[i] = (Integer.MAX_VALUE);
            }
            if (kar[i] == C) {
                flagTarget = true;
                counter = 1;
                int countBack = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (kar[j] != C) {
                        tmpArr[j] = Math.min(tmpArr[j], countBack);
                        countBack++;
                    } else if (kar[j] == C) {
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(tmpArr));

        return tmpArr;
    }

}
