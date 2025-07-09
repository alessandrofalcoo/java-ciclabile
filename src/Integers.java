public class Integers {
    int[] integers;
    private int indiceCorrente = 0;

    public Integers() {
        this.integers = new int[0];
    }

    public Integers(int[] elenco) {
        this.integers = elenco;
    }

    public void addElemento(int nuovo) {
        int[] nuovoArray = new int[integers.length + 1];
        for (int i = 0; i < integers.length; i++) {
            nuovoArray[i] = integers[i];
        }
        nuovoArray[integers.length] = nuovo;
        this.integers = nuovoArray;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        for (int i = 0; i < integers.length; i++) {
            sb.append(integers[i]);
            if (i < integers.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("");
        return sb.toString();
    }
}
