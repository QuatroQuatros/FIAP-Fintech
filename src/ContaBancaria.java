import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int id;
    private int id_perfil;
    private String numero_conta;
    private String digito_conta;
    private String numero_agencia_conta;
    private double saldo_conta;
    private List<Transacao> transacoes;
    private boolean status;
    private List<Cartao> cartoes;
    
    public ContaBancaria(){
    	
    }
    
    public ContaBancaria (int id, int id_perfil, String numero_conta, String digito_conta, String numero_agencia_conta, List<Transacao> transacoes, boolean status, List<Cartao> cartoes) {
    	this.id = id;
        this.id_perfil = id_perfil;
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.numero_agencia_conta = numero_agencia_conta;
        this.transacoes = transacoes;
        this.status = status;
        this.cartoes = cartoes;
    }
    
    public ContaBancaria (int id, int id_perfil, String numero_conta, String digito_conta, String numero_agencia_conta, boolean status) {
    	this.id = id;
        this.id_perfil = id_perfil;
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.numero_agencia_conta = numero_agencia_conta;
        this.transacoes = new ArrayList<>();
        this.status = status;
        this.cartoes = new ArrayList<>();
    }

    public ContaBancaria (int id, int id_perfil, String numero_conta, String digito_conta, String numero_agencia_conta, double saldo_conta, boolean status) {
    	this.id = id;
        this.id_perfil = id_perfil;
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.numero_agencia_conta = numero_agencia_conta;
        this.saldo_conta = saldo_conta;
        this.transacoes = new ArrayList<>();
        this.status = status;
        this.cartoes = new ArrayList<>();
    }

    protected ContaBancaria visualiza_conta() {
        return this;
    }

    protected void sacar_dinheiro(double valor) {
        if (saldo_conta >= valor && this.status == true) {
        	Transacao saque = new Transacao(id, numero_conta, digito_conta, numero_conta, digito_conta, valor, TipoTransacao.Débito, saldo_conta, saldo_conta-valor);
        	saldo_conta -= valor;
        	transacoes.add(saque);
        } else {
            System.out.println("Não é possivel realizar o saque ");
        }
    }

    protected void depositar(double valor) {
    	if(this.status == true) {
    		Transacao deposito = new Transacao(id, numero_conta, digito_conta, numero_conta, digito_conta, valor, TipoTransacao.Crédito, saldo_conta, saldo_conta+valor);
        	saldo_conta += valor;
        	transacoes.add(deposito);
    	}else {
    		 System.out.println("Conta desativada ");
    	}
    	
    }
    
    public void transferir(double valor, String numero_conta_envio, String digito_conta_envio) {
    	 if (saldo_conta >= valor && this.status == true) {
    		 if(numero_conta_envio != this.numero_conta && digito_conta_envio != this.digito_conta) {
    			 Transacao transferencia = new Transacao(id, numero_conta, digito_conta, numero_conta_envio, digito_conta_envio, valor, TipoTransacao.Transferencia, saldo_conta, saldo_conta-valor);
    		    	saldo_conta -= valor;
    		    	transacoes.add(transferencia);
    		 }else {
    			 System.out.println("Não é possivel realizar uma transferencia para você mesmo");
    		 }
	    	
    	 }else {
    		 System.out.println("Não é possivel realizar a transferencia ");
    	 }
    }

    protected List<Transacao> extrato_conta() {
        return this.transacoes;

    }

    protected void bloquear_conta() {
        this.status = false;
    }
   
    protected void desbloquear_conta() {
       this.status = true;
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
    


	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
	
	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	public void addTransacao(Transacao transacao) {
		this.transacoes.add(transacao);
	}

	public void addCartao(Cartao cartao) {
		this.cartoes.add(cartao);
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

//	@Override
//    public String toString() {
//        return "Conta [\n"+ "id= " + id + "\nid_perfil= " + id_perfil + "\nnumero_conta= " + numero_conta + "\ndigito_conta= " + digito_conta + "\nnumero_agencia_conta= " + numero_agencia_conta + "\nsaldo_conta= " + saldo_conta + "\ntransacoes= " + transacoes + "\nstatus= " + status + "\ncartoes= " + cartoes + "\n]";
//    }
	
	@Override
    public String toString() {
        return "ContaBancaria [\n" +
                "id=" + id + "\n" +
                "id_perfil=" + id_perfil + "\n" +
                "numero_conta=" + numero_conta + "\n" +
                "digito_conta=" + digito_conta + "\n" +
                "numero_agencia_conta=" + numero_agencia_conta + "\n" +
                "saldo_conta=" + saldo_conta + "\n" +
                "transacoes=" + transacoes + "\n" +
                "status=" + status + "\n" +
                "cartoes=" + cartoes + "\n" +
                "]";
    }



}