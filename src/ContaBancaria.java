public class ContaBancaria {
    private int id;
    private int id_perfil;
    private String numero_conta;
    private String digito_conta;
    private String numero_agencia_conta;
    private double saldo_conta;
    
    public ContaBancaria(){
    	
    }
    
    public ContaBancaria (int id, int id_perfil, String numero_conta, String digito_conta, String numero_agencia_conta) {
    	this.id = id;
        this.id_perfil = id_perfil;
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.numero_agencia_conta = numero_agencia_conta;
    }

    public ContaBancaria (int id, int id_perfil, String numero_conta, String digito_conta, String numero_agencia_conta, double saldo_conta) {
    	this.id = id;
        this.id_perfil = id_perfil;
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
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
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public int getId_perfil() {
        return this.id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getNumero_agencia_conta() {
        return numero_agencia_conta;
    }

    public void setNumero_agencia_conta(String numero_agencia_conta){
        this.numero_agencia_conta = numero_agencia_conta;
    }
    
    public String getDigito_conta() {
		return digito_conta;
	}

	public void setDigito_conta(String digito_conta) {
		this.digito_conta = digito_conta;
	}

    public double getSaldo_conta() {
        return saldo_conta;
    }

    public void setSaldo_conta(double saldo_conta) {
        this.saldo_conta = saldo_conta;
    }
    


	@Override
    public String toString() {
        return "Conta [\n"+ "id= " + id + "\nid_perfil= " + id_perfil + "\nnumero_conta= " + numero_conta + "\ndigito_conta= " + digito_conta + "\nnumero_agencia_conta= " + numero_agencia_conta + "\nsaldo_conta= " + saldo_conta + "\n]";
    }



}