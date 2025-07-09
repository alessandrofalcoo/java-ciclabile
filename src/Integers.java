public class Integers {
    int[] integers = { 1, 2, 4, 6, 28, 29, 40 };

    /*
     * public int getElementoSuccessivo(int value) {
     * for (int i = 0; i < integers.length - 1; i++) {
     * if (integers[i] == value) {
     * return integers[i + 1];
     * }
     * }
     * throw new IllegalArgumentException("Element not found");
     * }
     * 
     * public boolean hasAncoraElementi(){
     * if(){
     * 
     * }
     * }
     */
    private int indiceCorrente = 0;

    public int getElementoSuccessivo() {
        if (indiceCorrente < integers.length - 1) {
            indiceCorrente++;
            return integers[indiceCorrente];
        } else {
            throw new IllegalStateException("Sei già all'ultimo elemento");
        }
    }

    public boolean hasAncoraElementi() {
        return indiceCorrente < integers.length - 1;
    }

}
