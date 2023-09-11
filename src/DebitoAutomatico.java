import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DebitoAutomatico {
	private int id;
	private int idTransacao;
	private LocalDateTime dataPagamento;
	private double valorTaxa;
	private double valorPago;
	private char tipoMoeda;
	
	public DebitoAutomatico() {
		super();
	}



	public DebitoAutomatico(int id, int idTransacao, LocalDateTime dataPagamento, double valorTaxa, double valorPago,
			char tipoMoeda) {
		super();
		this.id = id;
		this.idTransacao = idTransacao;
		this.dataPagamento = dataPagamento;
		this.valorTaxa = valorTaxa;
		this.valorPago = valorPago;
		this.tipoMoeda = tipoMoeda;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getIdTransacao() {
		return idTransacao;
	}



	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}



	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}



	public void setDataPagamento(LocalDateTime dataPagamento) {
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



	public char getTipoMoeda() {
		return tipoMoeda;
	}


	public void setTipoMoeda(char tipoMoeda) {
		this.tipoMoeda = tipoMoeda;
	}

	//métodos
	protected static List<DebitoAutomatico> consultarDebitoData(Date data) {
		List<DebitoAutomatico> debitosFiltrados = new ArrayList<>();

		for (DebitoAutomatico debito : listaDebitos) {
			if (debito.getDataPagamento().equals(data)) {
				debitosFiltrados.add(debito);
			}
		}
        return debitosFiltrados;
    }

    protected static void consultarMoeda() {
		
    }

    public static boolean atribuirMoeda() {
        return false;
    }

    public static boolean cancelarDebitoAutomatico() {
        return false;
    }
}
