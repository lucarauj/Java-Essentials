package modulo5.polimorfismo.sobrescrita;

public class Main {

    public static void main(String[] args) {

        BotaoFogao fogao = new BotaoFogao();
        fogao.ligar();

        BotaoTV tv = new BotaoTV();
        tv.ligar();
    }
}
