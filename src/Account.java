public class Account {
    // o private indica que o atributo apenas pode ser modificado pela própria class
    private double saldo;
    private int agencia;
    private int numero;
    private Client titular;
    // Client titular = new Client();
    // static permite que to/do obj Account tenha acesso ao mesmo total
    private static int total;
    public Account(int agencia, int numero){
        System.out.println("Estou criando uma conta");
        if(agencia <= 0 || numero <= 0){
            System.out.println("Valor de agencia/numero incorreto");
            return;
        }
        Account.total++;
        this.setAgencia(agencia);
        this.setNumero(numero);
        System.out.println("Total de contas criadas = " + total);
    }

    public void deposit(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean withdraw(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfer(double valor, Account destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposit(valor);
            return true;
        }
        return false;

    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("Nao pode valor menor que zero");
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Nao pode valores menores ou igual a zero");
            return;
        }else{
            this.agencia = agencia;
        }

    }

    public void setTitular(Client titular) {
        this.titular = titular;
    }

    public Client getTitular() {
        return titular;
    }

    public static int getTotal(){
        return total;
    }
}
