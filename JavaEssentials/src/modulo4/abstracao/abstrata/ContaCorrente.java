package modulo4.abstracao.abstrata;

public class ContaCorrente extends Conta {
    @Override
    public void consultarSaldo() {
        System.out.println("A implementação do método ocorrerá aqui ***");
    }

    @Override
    public void fazerPix() {
        System.out.println("A implementação do método ocorrerá aqui ***");
    }
}
