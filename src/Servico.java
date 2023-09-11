import java.sql.Date;

public abstract class Servico {

    private int id_servico;
    private String nome_servico;
    private double valor_servico;
    private double taxa_servico;
    private String tipo_servico;
    private Date data_contratacao;

    public void contratar(int id_servico) {
        if (data_contratacao == null) {
            data_contratacao = new Date(System.currentTimeMillis());
            System.out.println("Serviço contratado em " + data_contratacao);
        } else {
            System.out.println("O serviço já foi contratado em " + data_contratacao);
        }
    }

    public void cancelar(int id_servico) {
        if (data_contratacao != null) {
            data_contratacao = null;
            System.out.println("Serviço cancelado.");
        } else {
            System.out.println("O serviço não foi contratado ainda.");
        }
    }
    
	public int getId_servico() {
		return id_servico;
	}

	public void setId_servico(int id_servico) {
		this.id_servico = id_servico;
	}
	
	public String getNome_servico() {
		return nome_servico;
	}

	public void setNome_servico(String nome_servico) {
		this.nome_servico = nome_servico;
	}


	public double getValor_servico() {
		return valor_servico;
	}

	public void setValor_servico(double valor_servico) {
		this.valor_servico = valor_servico;
	}

	public double getTaxa_servico() {
		return taxa_servico;
	}

	public void setTaxa_servico(double taxa_servico) {
		this.taxa_servico = taxa_servico;
	}

	public String getTipo_servico() {
		return tipo_servico;
	}

	public void setTipo_servico(String tipo_servico) {
		this.tipo_servico = tipo_servico;
	}



}
