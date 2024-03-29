package bytebankEncapsulado.src.br.com.bytebank.banco.ModeloTeste;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        /*
         * conta.numero = 1337
         * conta.setNumero(1337);
         */
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        // conta.titular = paulo;
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        // Agora em duas linhas:

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());

    }

}