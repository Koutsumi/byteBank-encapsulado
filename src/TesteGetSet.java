public class TesteGetSet {
    public static void main(String[] args) {
        Account conta = new Account(33, 1335);

        System.out.println(conta.getNumero());

        Client fernanda = new Client();
        conta.setTitular(fernanda);

        fernanda.setNome("Fernanda M Baccarini");
        conta.getTitular().setCpf("222.222.222-22");
        conta.getTitular().setProfissao("QA");

        System.out.println(conta.getTitular().getNome());
    }
}
