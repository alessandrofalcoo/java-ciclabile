public class Integers {
    int[] integers = { 1, 2, 4, 6, 28, 29, 40 };

    public int getElementoSuccessivo(int value) {
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == value) {
                return integers[i + 1];
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

}
