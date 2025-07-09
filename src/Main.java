public class Main {
    public static void main(String[] args) {
        int[] numeri = { 10, 20, 30, 40 };
        Integers ints = new Integers(numeri);
        ints.addElemento(25);
        ints.addElemento(393);
        ints.addElemento(248);
        System.out.println(ints);
    }
}
