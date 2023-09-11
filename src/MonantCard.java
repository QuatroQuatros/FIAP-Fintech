public class MonantCard {
    private int id_monantcard;
    private String apelido_cartao;

    
    public MonantCard() {
    	
    }
    
    public MonantCard(int id_monantcard, String apelido_cartao) {
    	this.id_monantcard = id_monantcard;
    	this.apelido_cartao = apelido_cartao;
    }
    
    protected static boolean excluirCartao() {
        return true;
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
}