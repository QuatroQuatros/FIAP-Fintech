import java.util.Date;

public class Cartao {
	//atributos
	private int idCartao;
	private int idContaBancaria;
	private String nomeTitular;
	private String numeroCartao;
	private int cvc;
	private double anuidade;
	private Date dataValidade;
	private TipoCartao tipoCartao;
	private boolean status;
	
	
	//Construtores
	public Cartao() {
		super();
	}


	public Cartao(int idCartao, int idContaBancaria, String nomeTitular, String numeroCartao, int cvc, double anuidade,
			Date dataValidade, TipoCartao tipoCartao, boolean status) {
		super();
		this.idCartao = idCartao;
		this.idContaBancaria = idContaBancaria;
		this.nomeTitular = nomeTitular;
		this.numeroCartao = numeroCartao;
		this.cvc = cvc;
		this.anuidade = anuidade;
		this.dataValidade = dataValidade;
		this.tipoCartao = tipoCartao;
		this.status = status;
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
	
	//Metodos das classes
	
	protected String bloquearCartao() {
        return "Cartão bloqueado com sucesso";
    }

	protected String validarDados(String dados) {
        return "Dados validados com sucesso";
    }

	protected boolean ativarAproximacao() {
        return true;
    }

	protected boolean alterarSenha() {
        return true;
    }

	protected void solicitarCartaoFisico() {
    }


	@Override
	public String toString() {
		return "Cartao [nomeTitular=" + nomeTitular + ", numeroCartao=" + numeroCartao + "]";
	}
	

	
}


