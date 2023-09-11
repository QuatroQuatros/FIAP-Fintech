import java.util.Date;

class DebitoAutomatico {
    private int id;
    private Date dataPagamento;
    private double valorTaxa;
    private double valorPago;
    private TipoMoedas tipoMoeda;
    private ContaBancaria conta;
    

    public DebitoAutomatico(int id, Date dataPagamento, double valorTaxa, double valorPago, TipoMoedas tipoMoeda, ContaBancaria conta) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.valorTaxa = valorTaxa;
        this.valorPago = valorPago;
        this.tipoMoeda = tipoMoeda;
        this.conta = conta;

    }
    
    
    public boolean realizarDebitoAutomatico() {
        if (conta.getSaldo_conta() >= valorPago) {
            double novoSaldo = conta.getSaldo_conta() - valorPago;
            registrarTransacao(conta.getId(), conta.getNumero_conta(), conta.getDigito_conta(), null, null, valorPago, TipoTransacao.DebitoAuto, conta.getSaldo_conta(), novoSaldo);
            conta.setSaldo_conta(novoSaldo);
            return true; 
        } else {
            return false;
        }
    }

    private void registrarTransacao(int id, String numero_conta, String digito_conta, String numero_conta_envio, String digito_conta_envio, double valor,  TipoTransacao tipo_transacao, double saldo_old, double saldo_new) {
		 Transacao transacao = new Transacao(id, numero_conta, digito_conta, numero_conta_envio, digito_conta_envio, valor, tipo_transacao, saldo_old, saldo_new);
		 conta.addTransacao(transacao);
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }
    
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorTaxa() {
        return valorTaxa;
    }
    
    public void setValorTaxa(double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

    public double getValorPago() {
        return valorPago;
    }
    
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public TipoMoedas getTipoMoeda() {
        return tipoMoeda;
    }
    
    public void setTipoMoeda(TipoMoedas tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

	public static boolean cancelarDebitoAutomatico() {
        return false;
    }
}
