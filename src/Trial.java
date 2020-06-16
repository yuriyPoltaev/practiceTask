import java.util.Arrays;
/**
 * This is a test sorting class
 */
public class Trial {
    public static void main(String[] args) {
        int[] massive = {6, 1, 3, 2, 8, 10, 1, 0, 5, 13, 16, 18};
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 0; j <= massive.length - 2; j++) {
                // метод которым можно заменить основное тело
                //switchPlaces(massive[j], massive[j+1]);
                if (massive[j] > massive[j + 1]) {
                    int tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }


//проверка тегов
//проверка опции pull с добавлением конфликта
/* метод которым можно заменить основное тело
//    public static void switchPlaces(int fst, int snd){
//        if (fst > snd) {
//        int tmp = fst;
//        fst = snd;
//        snd = tmp;
//        }
    }*/
}
