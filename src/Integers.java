public class Integers {
    int[] integers = { 1, 2, 4, 6, 28, 29, 40 };
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
