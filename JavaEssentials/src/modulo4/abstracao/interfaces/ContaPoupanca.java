package modulo4.abstracao.interfaces;

public class ContaPoupanca implements Conta {
    @Override
    public void consultarSaldo() {
        System.out.println("A implementação do método ocorrerá aqui (interfaces) ###");
    }

    @Override
    public void fazerPix() {
        System.out.println("A implementação do método ocorrerá aqui (interfaces) ###");
    }
}
