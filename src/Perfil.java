
public class Perfil {
	private int id;
	private int id_usuario;
	private String apelido;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String data_nascimento;
	private int tipo_perfil;
	
	
	//Construtores
	public Perfil() {
		
	}
	
	public Perfil(int id, int id_usuario, String apelido, String nome, String sobrenome, String cpf, String data_nascimento, int tipo_perfil) {
	    this.id = id;
	    this.id_usuario = id_usuario;
	    this.apelido = apelido;
	    this.nome = nome;
	    this.sobrenome = sobrenome;
	    this.cpf = cpf;
	    this.data_nascimento = data_nascimento;
	    this.tipo_perfil = tipo_perfil;
	}
	
	public Perfil(int id, String apelido, String nome, String sobrenome) {
	    this.id = id;
	    this.apelido = apelido;
	    this.nome = nome;
	    this.sobrenome = sobrenome;
	}
	
	//Metodos
	protected Perfil atualizar(String novoApelido, String novoNome, String novoSobrenome, String novoCpf, String novaDataNascimento, int novoTipoPerfil) {
        Perfil perfilAtualizado = new Perfil();
        perfilAtualizado.setId(this.id);
        perfilAtualizado.setId_usuario(this.id_usuario);
        perfilAtualizado.setApelido(novoApelido);
        perfilAtualizado.setNome(novoNome);
        perfilAtualizado.setSobrenome(novoSobrenome);
        perfilAtualizado.setCpf(novoCpf);
        perfilAtualizado.setData_nascimento(novaDataNascimento);
        perfilAtualizado.setTipo_perfil(novoTipoPerfil);

        return perfilAtualizado;
    }

	
	
	//Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public int getTipo_perfil() {
		return tipo_perfil;
	}
	public void setTipo_perfil(int tipo_perfil) {
		this.tipo_perfil = tipo_perfil;
	}

}
