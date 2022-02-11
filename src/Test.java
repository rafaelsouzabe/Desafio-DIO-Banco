public class Test {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("Joao Geraldo");
        Cliente maria = new Cliente();
        maria.setNome("Maria Jose");


        Conta conta1 = new ContaCorrente(joao);
        Conta conta2 = new ContaPoupanca(maria);

        conta1.deposito(2000);
        conta2.deposito(1000);

        System.out.println(conta1);
        System.out.println(conta2);

        conta1.sacar(100);
        conta2.transferencia(500,conta1);

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
