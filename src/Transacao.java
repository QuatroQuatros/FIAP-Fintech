import java.util.Date;
public class Transacao{
    private int id_conta_bancaria;
    private Date data_transacao;
    private int numero_conta;
    private int numero_conta_envio;
    private double valor_transacao;
    private boolean tipo_transacao;
    private double saldo;

    public Transacao(int id_conta_bancaria, int numero_conta) {
        this.id_conta_bancaria = id_conta_bancaria;
        this.numero_conta = numero_conta;
    }

    private void saldo_valido() {
        if (saldo < valor_transacao) {
            System.out.println("Saldo inválido");
        }else {
            System.out.println("Transação feita");
        }
    }

    private void fazer_transacao() {
        if (valor_transacao > saldo) {
            System.out.println("Saldo inválido");
        }else {
            System.out.println("Transação feita");
        }
    }

    public int getId_conta_bancaria() {
        return this.id_conta_bancaria;
    }

    public int setId_conta_bancaria() {
        return this.id_conta_bancaria;
    }

    public Date getData_transacao() {
        return this.data_transacao;
    }

    public Date setData_transacao() {
        return this.data_transacao;
    }
    
    public int getNumero_conta() {
        return this.numero_conta;
    }

    public int setNumero_conta() {
        return this.numero_conta;
    }

    public int getNumero_conta_envio() {
        return this.numero_conta_envio;
    }

    public int setNumero_conta_envio() {
        return this.numero_conta_envio;
    }

    public double getValor_transacao() {
        return this.valor_transacao;
    }

    public double setValor_transacao() {
        return this.valor_transacao;
    }

    public boolean getTipo_transacao() {
        return this.tipo_transacao;
    }

    public boolean setTipo_transacao() {
        return this.tipo_transacao;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double setSaldo() {
        return this.saldo;
    }

}
