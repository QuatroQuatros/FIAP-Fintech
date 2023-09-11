import java.util.Date;


public class ServiçoCarteiraAtivos extends Servico {
	private String nomeCorretora;
	private String nomeAtivo;
	
	
	
	public ServiçoCarteiraAtivos(int id_servico, String nome_servico, double valor_servico,
            double taxa_servico, String tipo_servico, Date data_contratacao, Date data_encerramento,
            String nomeCorretora, String nomeAtivo) {
        super(id_servico, nome_servico, valor_servico, taxa_servico, tipo_servico, data_contratacao,
                data_encerramento);
        this.nomeCorretora = nomeCorretora;
        this.nomeAtivo = nomeAtivo;
    }
	
	public ServiçoCarteiraAtivos(int id_servico, String nome_servico, double valor_servico, double taxa_servico, String tipo_servico, String nomeCorretora, String nomeAtivo) {
        super(id_servico, nome_servico, valor_servico, taxa_servico, tipo_servico);
        this.nomeCorretora = nomeCorretora;
        this.nomeAtivo = nomeAtivo;
    }
	
	public ServiçoCarteiraAtivos(String nomeCorretora, String nomeAtivo) {
		super();
		this.nomeCorretora = nomeCorretora;
		this.nomeAtivo = nomeAtivo;
	}

	public ServiçoCarteiraAtivos() {
		super();
	}
	



	@Override
	public String toString() {
		return super.toString() + "\nnomeCorretora=" + nomeCorretora + "\nnomeAtivo=" + nomeAtivo + "\n";
	}
	

}
