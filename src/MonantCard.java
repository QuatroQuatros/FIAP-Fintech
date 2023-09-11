import java.util.Date;
import java.util.List;

public class MonantCard extends Cartao {
    private int id_monantcard;
    private String apelido_cartao;

    
    public MonantCard() {
    	super();
    }
    
    public MonantCard(int id_monantcard, String apelido_cartao, int idCartao, int idContaBancaria,
            String nomeTitular, String senhaCartao, String numeroCartao, int cvc, double anuidade, Date dataValidade,
            TipoCartao tipoCartao, boolean status, boolean isApproximation, ContaBancaria conta) {
        super(idCartao, idContaBancaria, nomeTitular, senhaCartao, numeroCartao, cvc, anuidade, dataValidade,
                tipoCartao, status, isApproximation, conta);
        this.id_monantcard = id_monantcard;
        this.apelido_cartao = apelido_cartao;
    }
    
    public boolean excluirCartao(ContaBancaria conta, MonantCard monantCard) {
    	List<Cartao> cartoes = conta.getCartoes();
    	if (cartoes.contains(monantCard)) {
    		cartoes.remove(monantCard);
    		monantCard.setConta(null);
    		return true;
    	}
        return false;
    }

	public int getId_monantcard() {
		return id_monantcard;
	}

	public void setId_monantcard(int id_monantcard) {
		this.id_monantcard = id_monantcard;
	}

	public String getApelido_cartao() {
		return apelido_cartao;
	}

	public void setApelido_cartao(String apelido_cartao) {
		this.apelido_cartao = apelido_cartao;
	}
	
    @Override
    public String toString() {
        return "MonantCard [\nid_monantcard=" + id_monantcard + "\napelido_cartao=" + apelido_cartao + "\n"
                + super.toString() + "\n]";
    }

}