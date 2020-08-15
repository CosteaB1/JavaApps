package Interfata_stiva;

public class TestStiva {
    public static void afiseaza (Stack s) {
        System.out.println("Continutul sivei este: " + s);
    }

    public static void main(String[] args) {
        try {
            Stack s1= new StackImpl1();

            s1.push("b");
            s1.push("a");
            afiseaza(s1);

            Stack s2 = new StackImpl2();
            s2.push(1);
            s1.push(3.14);
            afiseaza(s2);

        } catch (StackException e) {
            System.err.println("Eroare la lucru cu stiva");
            e.printStackTrace();
        }
    }
}
