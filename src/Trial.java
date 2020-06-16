import java.util.Arrays;

public class Trial {
    public static void main(String[] args) {
        int[] massive = {6, 1, 3, 2, 8, 10, 1, 0};
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 0; j <= massive.length-2; j++) {
                if (massive[j] > massive[j + 1]) {
                    int tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}

