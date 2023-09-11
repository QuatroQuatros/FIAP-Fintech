import java.util.Date;

public class ServicoBolsaValores extends Servico{
	
	private String nomeCorretora;
	private String nomeAtivo;
	private double rendimento;
	
	
	public ServicoBolsaValores(int id_servico, String nome_servico, double valor_servico,
            double taxa_servico, String tipo_servico, Date data_contratacao, Date data_encerramento,
            String nomeCorretora, String nomeAtivo, double rendimento) {
        super(id_servico, nome_servico, valor_servico, taxa_servico, tipo_servico, data_contratacao,
                data_encerramento);
        this.nomeCorretora = nomeCorretora;
        this.nomeAtivo = nomeAtivo;
        this.rendimento = rendimento;
    }
	
	public ServicoBolsaValores(int id_servico, String nome_servico, double valor_servico, double taxa_servico, String tipo_servico, String nomeCorretora, String nomeAtivo, double rendimento) {
        super(id_servico, nome_servico, valor_servico, taxa_servico, tipo_servico);
        this.nomeCorretora = nomeCorretora;
        this.nomeAtivo = nomeAtivo;
        this.rendimento = rendimento;
    }
	
	public ServicoBolsaValores(String nomeCorretora, String nomeAtivo, double rendimento) {
		super();
		this.nomeCorretora = nomeCorretora;
		this.nomeAtivo = nomeAtivo;
        this.rendimento = rendimento;
	}

	public ServicoBolsaValores() {
		super();
	}	
	
	public String getNomeCorretora() {
		return nomeCorretora;
	}
	public void setNomeCorretora(String nomeCorretora) {
		this.nomeCorretora = nomeCorretora;
	}
	public String getNomeAtivo() {
		return nomeAtivo;
	}
	public void setNomeAtivo(String nomeAtivo) {
		this.nomeAtivo = nomeAtivo;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\nnomeCorretora=" + nomeCorretora + "\nnomeAtivo=" + nomeAtivo + "\nrendimento=" + rendimento + "\n";
	}

}
