
public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String senha;
	private Boolean status;
	
	
	//Construtores
	public Usuario(int id, String nome, String email, String senha, Boolean status) 
	{
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.status = status;
	}
	
	public Usuario() {
		
	}
	
	//Metodos
	
	public static Usuario cadastrar(int id, String nome, String email, String senha, Boolean status) {
        return new Usuario(id, nome, email, senha, status);
    }
	
	public boolean login(String email, String password) {
		if(this.email == email && this.senha == password) {
			return true;
		}
		return false;
	}
	
    protected Usuario atualizar(String novoNome, String novoEmail, String novaSenha, Boolean novoStatus) {
        // Crie um novo objeto Usuario com os dados atualizados
        Usuario usuarioAtualizado = new Usuario(this.id, novoNome, novoEmail, novaSenha, novoStatus);
        return usuarioAtualizado;
    }
	
	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}


	
}
