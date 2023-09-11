import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class PerfilServico {
	
	//Atributos
	private int id;
	private List<Servico> listaDeServicos;
	private Perfil perfil;
	
	
	//Construtores
	public PerfilServico() {
		
	}
	
	public PerfilServico(int id, List<Servico> listaDeServicos, Perfil perfil) {
		this.id = id;
		this.listaDeServicos = listaDeServicos;
		this.perfil = perfil;
	}
	
	public PerfilServico(int id, Perfil perfil) {
		this.id = id;
		this.listaDeServicos = new ArrayList<>();
		this.perfil = perfil;
	}
	
	
	
	//Metodos
	protected List<Servico> Extrato(){
		return this.listaDeServicos;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//Getters e Setters
	public List<Servico> getListaDeServicos() {
		return listaDeServicos;
	}

	public void setListaDeServicos(List<Servico> listaDeServicos) {
		this.listaDeServicos = listaDeServicos;
	}
	
	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public void setServicoInListaDeServicos(Servico servico) {
		this.listaDeServicos.add(servico);
	}
	
	@Override
    public String toString() {
        return "PerfilServiço [\n"+ "id= " + id + "\nid_perfil= " + perfil.getId() + "\nlistaDeServicos= " + listaDeServicos + "\n]";
    }



	
}
