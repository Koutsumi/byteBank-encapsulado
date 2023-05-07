public class Account {
    // o private indica que o atributo apenas pode ser modificado pela própria class
    private double saldo;
    int agencia = 42;
    int numero;
    Client titular;
    // Client titular = new Client();

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
}
