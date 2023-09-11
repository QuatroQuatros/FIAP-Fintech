import java.util.Date;

public class Cartao {
	//atributos
	private int idCartao;
	private int idContaBancaria;
	private String nomeTitular;
	private String numeroCartao;	
	private String senhaCartao;
	private double limiteTotal;
	private double limiteUsado;
	private int cvc;
	private double anuidade;
	private Date dataValidade;
	private TipoCartao tipoCartao;
	private boolean status;
	private boolean isApproximation;
	private ContaBancaria conta;

	
	
	//Construtores
	public Cartao() {
		super();
	}


	public Cartao(int idCartao, int idContaBancaria, String nomeTitular, String senhaCartao, double limiteTotal, double limiteUsado, String numeroCartao, int cvc, double anuidade,
			Date dataValidade, TipoCartao tipoCartao, boolean status, boolean isApproximation, ContaBancaria conta) {
		super();
		this.idCartao = idCartao;
		this.idContaBancaria = idContaBancaria;
		this.nomeTitular = nomeTitular;
		this.senhaCartao = senhaCartao;
		this.limiteTotal = limiteTotal;
		this.limiteUsado = limiteUsado;
		this.limiteTotal = limiteTotal;
		this.cvc = cvc;
		this.anuidade = anuidade;
		this.dataValidade = dataValidade;
		this.tipoCartao = tipoCartao;
		this.status = status;
		this.isApproximation = isApproximation;
		this.setConta(conta);
	}
	
	public Cartao(int idCartao, int idContaBancaria, String nomeTitular, String senhaCartao, String numeroCartao, int cvc, double anuidade,
			Date dataValidade, TipoCartao tipoCartao, boolean status, boolean isApproximation, ContaBancaria conta) {
		super();
		this.idCartao = idCartao;
		this.idContaBancaria = idContaBancaria;
		this.nomeTitular = nomeTitular;
		this.senhaCartao = senhaCartao;
		this.limiteTotal = 0.0;
		this.limiteUsado = 0.0;
		this.numeroCartao = numeroCartao;
		this.cvc = cvc;
		this.anuidade = anuidade;
		this.dataValidade = dataValidade;
		this.tipoCartao = tipoCartao;
		this.status = status;
		this.isApproximation = isApproximation;
		this.setConta(conta);
	}


    //Acessores
	public int getIdCartao() {
		return idCartao;
	}


	public void setIdCartao(int idCartao) {
		this.idCartao = idCartao;
	}


	public int getIdContaBancaria() {
		return idContaBancaria;
	}


	public void setIdContaBancaria(int idContaBancaria) {
		this.idContaBancaria = idContaBancaria;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public String getNumeroCartao() {
		return numeroCartao;
	}


	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}


	public String getSenhaCartao() {
		return senhaCartao;
	}


	public void setSenhaCartao(String senhaCartao) {
		this.senhaCartao = senhaCartao;
	}


	public double getLimiteTotal() {
		return limiteTotal;
	}


	public void setLimiteTotal(double limite) {
		this.limiteTotal = limite;
	}


	public double getLimiteUsado() {
		return limiteUsado;
	}


	public void setLimiteUsado(double limiteUsado) {
		this.limiteUsado = limiteUsado;
	}


	public int getCvc() {
		return cvc;
	}


	public void setCvc(int cvc) {
		this.cvc = cvc;
	}


	public double getAnuidade() {
		return anuidade;
	}


	public void setAnuidade(double anuidade) {
		this.anuidade = anuidade;
	}


	public Date getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}


	public TipoCartao getTipoCartao() {
		return tipoCartao;
	}


	public void setTipoCartao(TipoCartao tipoCartao) {
		this.tipoCartao = tipoCartao;
	}


	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public boolean isApproximation() {
		return isApproximation;
	}


	public void setApproximation(boolean isApproximation) {
		this.isApproximation = isApproximation;
	}


	public ContaBancaria getConta() {
		return conta;
	}


	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	//Metodos das classes
	

	protected void bloquearCartao() {
        this.status = false;
    }
	
	protected void desbloquearCartao() {
        this.status = true;
    }

	protected boolean validarDados(String dados) {
		if(this.status) {
			return true;
		}
		return false;
        
    }

	protected void ativarAproximacao() {
        this.isApproximation = true;
    }
	
	protected void desativarAproximacao() {
        this.isApproximation = false;
    }
	
	
	
	protected String solicitarAumento(double valor) {
		return "Solicitação de aumento de limite enviado";
	}

	protected void solicitarCartaoFisico() {
    }


	@Override
	public String toString() {
	    return "Cartao [\n" +
	           "idCartao=" + idCartao + "\n" +
	           "idContaBancaria=" + idContaBancaria + "\n" +
	           "nomeTitular=" + nomeTitular + "\n" +
	           "numeroCartao=" + numeroCartao + "\n" +
	           "senhaCartao=" + senhaCartao + "\n" +
	           "cvc=" + cvc + "\n" +
	           "anuidade=" + anuidade + "\n" +
	           "dataValidade=" + dataValidade + "\n" +
	           "tipoCartao=" + tipoCartao + "\n" +
	           "status=" + status + "\n" +
	           "isApproximation=" + isApproximation + "\n" +
	           "]";
	}

	
}


