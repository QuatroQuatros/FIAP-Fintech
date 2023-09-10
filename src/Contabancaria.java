public class ContaBancaria {
    private int id_perfil;
    private String numero_conta;
    private String numero_agencia_conta;
    private double saldo_conta;

    public ContaBancaria (int id_perfil, String numero_conta, String numero_agencia_conta, double saldo_conta) {
        this.id_perfil = id_perfil;
        this.numero_conta = numero_conta;
        this.numero_agencia_conta = numero_agencia_conta;
        this.saldo_conta = saldo_conta;
    }

    private String visualiza_conta(String Contabancaria) {
        return numero_conta;
    }

    private void sacar_dinheiro(int Cartao) {
        if (Cartao == Cartao) {
            System.out.println("Saque completo");
        } else {
            System.out.println("Erro de credenciais ");
        }
    }

    private void depositar(int Cartao) {
        if (Cartao == Cartao) {
            System.out.println("Deposito completo");
        } else {
            System.out.println("Erro de credenciais ");
        }
    }

    private double extrato_conta() {
        return this.saldo_conta;

    }

    private String bloquear_conta() {
        return "Conta bloqueada";
    }
    private String abrir_conta() {
        return "Abertura de conta efetuada com sucesso";
    }

    public int getId_perfil() {
        return this.id_perfil;
    }

    public int setId_perfil(int id_perfil) {
        return this.id_perfil = id_perfil;
    }

    public String getNumero_conta() {
        return numero_conta;
    }

    public String setNumero_conta(String numero_conta) {
        return this.numero_conta = numero_conta;
    }

    public String getNumero_agencia_conta() {
        return numero_agencia_conta;
    }

    public String setNumero_agencia_conta(String numero_agencia_conta){
        return this.numero_agencia_conta = numero_agencia_conta;
    }

    public double getSaldo_conta() {
        return saldo_conta;
    }

    public double setSaldo_conta(double saldo_conta) {
        return saldo_conta;
    }

}
