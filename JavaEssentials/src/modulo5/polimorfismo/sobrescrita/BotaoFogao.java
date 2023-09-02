package modulo5.polimorfismo.sobrescrita;

public class BotaoFogao extends Botao {

    @Override
    public void ligar() {
        System.out.println("Acendendo o fogão...");
    }
}
