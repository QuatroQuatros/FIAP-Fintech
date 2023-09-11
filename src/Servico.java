import java.util.Date;

public abstract class Servico {

    private int id_servico;
    private String nome_servico;
    private double valor_servico;
    private double taxa_servico;
    private String tipo_servico;
	private Date data_contratacao;
	private Date data_encerramento;
	
	public Servico(int id_servico, String nome_servico, double valor_servico, double taxa_servico,
            String tipo_servico, Date data_contratacao, Date data_encerramento) {
        this.id_servico = id_servico;
        this.nome_servico = nome_servico;
        this.valor_servico = valor_servico;
        this.taxa_servico = taxa_servico;
        this.tipo_servico = tipo_servico;
        this.data_contratacao = data_contratacao;
        this.data_encerramento = data_encerramento;
    }
	
	public Servico(int id_servico, String nome_servico, double valor_servico, double taxa_servico, String tipo_servico, Date data_contratacao) {
        this.id_servico = id_servico;
        this.nome_servico = nome_servico;
        this.valor_servico = valor_servico;
        this.taxa_servico = taxa_servico;
        this.tipo_servico = tipo_servico;
        this.data_contratacao = data_contratacao;
        this.data_encerramento = null;
    }
	
	
	public Servico(int id_servico, String nome_servico, double valor_servico, double taxa_servico, String tipo_servico) {
        this.id_servico = id_servico;
        this.nome_servico = nome_servico;
        this.valor_servico = valor_servico;
        this.taxa_servico = taxa_servico;
        this.tipo_servico = tipo_servico;
        this.data_contratacao = null;
        this.data_encerramento = null;
    }
	

	public Servico() {
		
	}

    public void contratar() {
        if (data_contratacao == null) {
            data_contratacao = new Date(System.currentTimeMillis());
            System.out.println("Serviço contratado.");
        } else {
            System.out.println("O serviço já foi contratado em " + data_contratacao);
        }
    }

    public void cancelar() {
        if (data_contratacao != null) {
        	data_encerramento = new Date(System.currentTimeMillis());
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
	
	public Date getData_contratacao() {
		return data_contratacao;
	}

	public void setData_contratacao(Date data_contratacao) {
		this.data_contratacao = data_contratacao;
	}

	public Date getData_encerramento() {
		return data_encerramento;
	}

	public void setData_encerramento(Date data_encerramento) {
		this.data_encerramento = data_encerramento;
	}
	
	@Override
    public String toString() {
        return "Servico [\nid_servico=" + id_servico + "\nnome_servico=" + nome_servico +
               "\nvalor_servico=" + valor_servico + "\ntaxa_servico=" + taxa_servico +
               "\ntipo_servico=" + tipo_servico + "\ndata_contratacao=" + data_contratacao +
               "\ndata_encerramento=" + data_encerramento + "\n]";
    }



}
