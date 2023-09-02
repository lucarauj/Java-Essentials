public class VariaveisETiposDeDados {

    public static void main(String[] args) {

        //mínimo -128 e máximo 127 - 8 bits
        byte meuByte = 127;
        System.out.println("Meu byte: " + meuByte);

        //mínimo -32.768 e máximo 32.767 - 16 bits
        short meuShort = 32767;
        System.out.println("Meu short: " + meuShort);

        //mínimo -2.147.483.648 e máximo 2.147.483.647 - 32 bits
        int idade = 2_147_483_647;
        System.out.println("Meu int: " + idade);

        //64 bits
        long meuLong = 10L;
        System.out.println("Meu long: " + meuLong);

        //dupla precisão, 64 bits
        double salario = 102.51D;
        System.out.println("Meu double: " + salario);

        //precisão simples, 32 bits
        float salarioFloat = 102.52F;
        System.out.println("Meu float: " + salarioFloat);

        //16 bits, único unicode
        char letra = 'A';
        System.out.println("Meu char: " + letra);

        //1 bit
        boolean javaELegal = true;
        System.out.println("Meu boolean: " + javaELegal);
    }
}
