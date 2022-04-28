import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();

        String[] strs = lines.trim().split(" ");
        List<Integer> a = new ArrayList<>();

        for (String str : strs) {
            a.add(Integer.parseInt(str));
        }
        int k = Integer.parseInt(br.readLine());
        boolean found = findSumInArray(a,k);
        System.out.println(found);
    }

    private static boolean findSumInArray(List<Integer> a, int k) {
        for (int j : a) {
            int d = k - j;
            if (a.contains(d))
                return true;
        }
        return false;
    }
}