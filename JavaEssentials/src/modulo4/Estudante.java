package modulo4;

public class Estudante {

    private String nome;
    private String stack;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String estudar(){
        return "Estudando Java e Spring";
    }

    public void dormir(){

    }
}
