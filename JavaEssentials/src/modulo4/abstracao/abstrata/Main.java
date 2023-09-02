package modulo4.abstracao.abstrata;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.consultarSaldo();
        contaCorrente.fazerPix();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.consultarSaldo();
        contaPoupanca.fazerPix();

    }
}
