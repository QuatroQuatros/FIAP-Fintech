import java.util.Date;

public class Transacao{
    private int id_conta_bancaria;
    private Date data_transacao;
    private String numero_conta;
    private String digito_conta;
    private String numero_conta_envio;
    private String digito_conta_envio;
    private double valor_transacao;
    private double saldo_old;
    private double saldo_new;
    private TipoTransacao tipo_transacao;

    public Transacao(int id_conta_bancaria, Date data_transacao, String numero_conta, String digito_conta, String digito_conta_envio, String numero_conta_envio, double valor_transacao, TipoTransacao tipo_transacao, double saldo_old, double saldo_new) {
        this.id_conta_bancaria = id_conta_bancaria;
        this.data_transacao = data_transacao;
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.numero_conta_envio = numero_conta_envio;
        this.digito_conta_envio = digito_conta_envio;
        this.valor_transacao = valor_transacao;
        this.tipo_transacao = tipo_transacao;
        this.saldo_old = saldo_old;
        this.saldo_new = saldo_new;
        
    }
    
    public Transacao(int id_conta_bancaria, String numero_conta, String digito_conta, String digito_conta_envio, String numero_conta_envio, double valor_transacao, TipoTransacao tipo_transacao, double saldo_old, double saldo_new) {
        this.id_conta_bancaria = id_conta_bancaria;
        this.data_transacao = new Date();
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.numero_conta_envio = numero_conta_envio;
        this.digito_conta_envio = digito_conta_envio;
        this.valor_transacao = valor_transacao;
        this.tipo_transacao = tipo_transacao;
        this.saldo_old = saldo_old;
        this.saldo_new = saldo_new;
    }
    
    public Transacao(int id_conta_bancaria, String numero_conta, String digito_conta, double valor_transacao, TipoTransacao tipo_transacao, double saldo_old, double saldo_new) {
        this.id_conta_bancaria = id_conta_bancaria;
        this.data_transacao = new Date();
        this.numero_conta = numero_conta;
        this.digito_conta = digito_conta;
        this.valor_transacao = valor_transacao;
        this.tipo_transacao = tipo_transacao;
        this.saldo_old = saldo_old;
        this.saldo_new = saldo_new;
    }
    
    public int getId_conta_bancaria() {
        return this.id_conta_bancaria;
    }

    public void setId_conta_bancaria(int id_conta_bancaria) {
        this.id_conta_bancaria = id_conta_bancaria;
    }

    public Date getData_transacao() {
        return this.data_transacao;
    }

    public void setData_transacao(Date data_transacao) {
        this.data_transacao = data_transacao;
    }
    
    public String getNumero_conta() {
        return this.numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getDigito_conta() {
		return digito_conta;
	}

	public void setDigito_conta(String digito_conta) {
		this.digito_conta = digito_conta;
	}

	public String getNumero_conta_envio() {
        return this.numero_conta_envio;
    }

    public void setNumero_conta_envio(String numero_conta_envio) {
        this.numero_conta_envio = numero_conta_envio;
    }

    public String getDigito_conta_envio() {
		return digito_conta_envio;
	}

	public void setDigito_conta_envio(String digito_conta_envio) {
		this.digito_conta_envio = digito_conta_envio;
	}

	public double getValor_transacao() {
        return this.valor_transacao;
    }

    public void setValor_transacao(double valor_transacao) {
        this.valor_transacao = valor_transacao;
    }

    public TipoTransacao getTipo_transacao() {
        return this.tipo_transacao;
    }

    public void setTipo_transacao(TipoTransacao tipo_transacao) {
        this.tipo_transacao = tipo_transacao;
    }
    
    public double getSaldo_old() {
		return saldo_old;
	}

	public void setSaldo_old(double saldo_old) {
		this.saldo_old = saldo_old;
	}

	public double getSaldo_new() {
		return saldo_new;
	}

	public void setSaldo_new(double saldo_new) {
		this.saldo_new = saldo_new;
	}

	@Override
    public String toString() {
        return "Transacao [\n" +
                "id_conta_bancaria=" + id_conta_bancaria + "\n" +
                "data_transacao=" + data_transacao + "\n" +
                "numero_conta=" + numero_conta + "\n" +
                "digito_conta=" + digito_conta + "\n" +
                "numero_conta_envio=" + numero_conta_envio + "\n" +
                "digito_conta_envio=" + digito_conta_envio + "\n" +
                "valor_transacao=" + valor_transacao + "\n" +
                "tipo_transacao=" + tipo_transacao + "\n" +
                "saldo_old=" + saldo_old + "\n" +
                "saldo_new=" + saldo_new + "\n" +
                "]";
    }



}
