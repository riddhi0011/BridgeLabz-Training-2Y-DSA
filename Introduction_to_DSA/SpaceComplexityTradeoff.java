import java.util.*;

public class SpaceComplexityTradeoff {

    public static boolean nestedLoop(int[] completed, int[] pre) {
        for (int i = 0; i < pre.length; i++) {
            boolean found = false;

            for (int j = 0; j < completed.length; j++) {
                if (pre[i] == completed[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) return false;
        }

        return true;
    }

    public static boolean hashSetMethod(int[] completed, int[] pre) {
        HashSet<Integer> set = new HashSet<>();

        for (int c : completed) set.add(c);

        for (int p : pre) {
            if (!set.contains(p)) return false;
        }

        return true;
    }
}
