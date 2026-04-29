public class AlgorithmPropertiesAndCorrectness {
    public static double algorithmA(int[] temp) {
        int total = 0;

        for (int i = 0; i < temp.length; i++) {
            total += temp[i];
        }

        return (double) total / temp.length;
    }

    public static void main(String[] args) {
        int[] arr = {20, 25, 22, 24, 21};
        System.out.println("Average: " + algorithmA(arr));
    }
}
