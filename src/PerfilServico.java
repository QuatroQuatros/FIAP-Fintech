import java.util.ArrayList;
import java.util.List;

public class PerfilServico {
	
	//Atributos
	private int id_perfil;
	private int id_servico;
	private String data_contratacao;
	private String data_encerramento;
	private List<Servico> listaDeServicos = new ArrayList<>();
	
	
	//Construtores
	public PerfilServico() {
		
	}
	
	public PerfilServico(int id_perfil, int id_servico, String data_contratacao, String data_encerramento) {
		this.id_perfil = id_perfil;
		this.id_servico = id_servico;
		this.data_contratacao = data_contratacao;
		this.data_encerramento = data_encerramento;
	}
	
	
	
	//Metodos
	protected List<Servico> Extrato(){
		return this.listaDeServicos;
	}
	
	//Getters e Setters
	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}
	
	public int getId_servico() {
		return id_servico;
	}
	public void setId_servico(int id_servico) {
		this.id_servico = id_servico;
	}
	public String getData_contratacao() {
		return data_contratacao;
	}
	public void setData_contratacao(String data_contratacao) {
		this.data_contratacao = data_contratacao;
	}
	public String getData_encerramento() {
		return data_encerramento;
	}
	public void setData_encerramento(String data_encerramento) {
		this.data_encerramento = data_encerramento;
	}

	public List<Servico> getListaDeServicos() {
		return listaDeServicos;
	}

	public void setListaDeServicos(List<Servico> listaDeServicos) {
		this.listaDeServicos = listaDeServicos;
	}



	
}
