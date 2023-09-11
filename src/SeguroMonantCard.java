import java.util.Date;

public class SeguroMonantCard extends Servico{
    //atributos
    private int idSeguroMonantCard;
    private String apelidoCartao;
    private double taxaAnuidade;
    private MonantCard card;

    //construtores
 
    public SeguroMonantCard(int id_servico, String nome_servico, double valor_servico, double taxa_servico, String tipo_servico, 
    		Date data_contratacao, Date data_encerramento, int idSeguroMonantCard, String apelidoCartao, double taxaAnuidade, MonantCard card){
    	super(id_servico, nome_servico, valor_servico, taxa_servico, tipo_servico, data_contratacao, data_encerramento);
        this.idSeguroMonantCard = idSeguroMonantCard;
        this.card = card;
        this.apelidoCartao = apelidoCartao;
        this.taxaAnuidade = taxaAnuidade;
    }
    
    public SeguroMonantCard(int id_servico, String nome_servico, double valor_servico, double taxa_servico, String tipo_servico, 
    		Date data_contratacao, int idSeguroMonantCard, String apelidoCartao, double taxaAnuidade, MonantCard card){
    	super(id_servico, nome_servico, valor_servico, taxa_servico, tipo_servico, data_contratacao);
        this.idSeguroMonantCard = idSeguroMonantCard;
        this.card = card;
        this.apelidoCartao = apelidoCartao;
        this.taxaAnuidade = taxaAnuidade;
    }
    
    public SeguroMonantCard(int id_servico, String nome_servico, double valor_servico, double taxa_servico, String tipo_servico, 
    		int idSeguroMonantCard, String apelidoCartao, double taxaAnuidade, MonantCard card){
    	super(id_servico, nome_servico, valor_servico, taxa_servico, tipo_servico);
        this.idSeguroMonantCard = idSeguroMonantCard;
        this.card = card;
        this.apelidoCartao = apelidoCartao;
        this.taxaAnuidade = taxaAnuidade;
        
        
    }

    //Getters e Setters
    public int getidSeguroMonantCard() {
        return idSeguroMonantCard;
    }

    public void setidSeguroMonantCard(int idSeguroMonantCard) {
        this.idSeguroMonantCard = idSeguroMonantCard;
    }

    public String getApelidoCartao() {
        return apelidoCartao;
    }

    public void setApelidoCartao(String apelidoCartao) {
        this.apelidoCartao = apelidoCartao;
    }

    public double getTaxaAnuidade() { 
        return taxaAnuidade;
    }

    public void setTaxaAnuidade(double taxaAnuidade){
        this.taxaAnuidade = taxaAnuidade;
    }

	public MonantCard getCard() {
		return card;
	}

	public void setCard(MonantCard card) {
		this.card = card;
	}
	
	   @Override
	    public String toString() {
	        return "SeguroMonantCard [\n" +
	                "idSeguroMonantCard=" + idSeguroMonantCard + "\n" +
	                "apelidoCartao=" + apelidoCartao + "\n" +
	                "taxaAnuidade=" + taxaAnuidade + "\n" +
	                "card=" + card.toString() + "\n" +
	                "id_servico=" + getId_servico() + "\n" +
	                "nome_servico=" + getNome_servico() + "\n" +
	                "valor_servico=" + getValor_servico() + "\n" +
	                "taxa_servico=" + getTaxa_servico() + "\n" +
	                "tipo_servico=" + getTipo_servico() + "\n" +
	                "data_contratacao=" + getData_contratacao() + "\n" +
	                "data_encerramento=" + getData_encerramento() + "\n" +
	                "]";
	    }
  
}

