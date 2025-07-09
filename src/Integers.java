public class Integers {
    int[] integers;
    private int indiceCorrente = 0;

    public Integers(int[] elenco) {
        this.integers = elenco;
    }

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
