package modulo4;

public class Objetos {

    public static void main(String[] args) {

        Estudante lucas = new Estudante();
        lucas.setNome("Lucas");
        lucas.setStack("Java");

        System.out.println(lucas.getNome() + " - estudante de " + lucas.getStack());
        System.out.println(lucas.estudar());

        lucas.dormir();
    }
}
