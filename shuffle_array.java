
import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        Integer[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(originalArray);

        // Print the shuffled array
        for (Integer value : originalArray) {
            System.out.print(value + " ");
        }
    }

    public static void shuffleArray(Integer[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap array[i] and array[j]
            Integer temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
