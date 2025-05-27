public class Main {
    public static void main(String[] args) {
        Integer i = new Integer(4);
        //Det nye Integer-objekt er tilgængelig via referencen i 'i'
        i = null;
        //Integer objektet er ikke længere tilgængelig
        System.out.println(i);
    }
}


