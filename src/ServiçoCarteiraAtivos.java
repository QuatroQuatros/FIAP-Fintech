
public class ServiçoCarteiraAtivos {
	private String nomeCorretora;
	private String nomeAtivo;
	
	
	
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
		return "ServiçoCarteiraAtivos [nomeCorretora=" + nomeCorretora + ", nomeAtivo=" + nomeAtivo + "]";
	}
	

}
