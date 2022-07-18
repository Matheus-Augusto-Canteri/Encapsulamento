package bytebankEncapsulado.src.br.com.bytebank.banco.ModeloTeste;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        /*
         * Conta está inconsistente, não precisamos mais desses get e set, devido a
         * estar passando o parametro no construtor
         * conta.setAgencia(-50);
         * conta.setNumero(-330);
         */

        System.out.println(conta.getAgencia());

        conta.setAgencia(1232123);

        Conta conta2 = new Conta(1337, 16549);

        Conta conta3 = new Conta(2112, 14660);

        System.out.println(Conta.getTotal());

        System.out.println(conta2.getAgencia());

        System.out.println(conta3.getAgencia());

    }

}
