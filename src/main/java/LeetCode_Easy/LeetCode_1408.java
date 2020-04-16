package LeetCode_Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode_1408 {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        stringMatching(words);
    }

    public static List<String> stringMatching(String[] words) {
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(i == j){
                    continue;
                }
                if(words[i].contains(words[j])){
                    hashSet.add(words[j]);
                }
            }
        }
        System.out.println(new ArrayList<>(hashSet));
        return new ArrayList<>(hashSet);
    }
}
