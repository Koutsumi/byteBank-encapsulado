public class TestaValores {

    public static void main(String[] args) {
        Account conta = new Account(42, 330);

        //System.out.println(conta.getAgencia());

        Account segundaConta = new Account(43, 440);

        System.out.println(Account.getTotal());
    }

}
