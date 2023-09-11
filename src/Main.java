import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario(1, "João", "joaozinhogameplays@gmail.com", "senha123", true);
		
		
		//System.out.println(usuario);
		
		Perfil perfil = new Perfil(1, usuario.getId(), "joãozinho", "João", "Ceslo");
        perfil.setCpf("12345678900");
        perfil.setData_nascimento("01/01/1990");
        perfil.setTipo_perfil(1);
        
        usuario.setPerfil(perfil);
        
//		System.out.println(usuario.getPerfil());
		
		ContaBancaria conta = new ContaBancaria(1, perfil.getId(), "4444", "4", "0004", true);
		conta.setSaldo_conta(44444.44);
        
		perfil.setConta(conta);
		
		System.out.println(conta.getSaldo_conta());
		
		conta.sacar_dinheiro(100);

		conta.bloquear_conta();

		conta.depositar(110);

		conta.desbloquear_conta();

		conta.transferir(100, "3000", "3");
		
		DebitoAutomatico db = new DebitoAutomatico(1, new Date(), 0.5, 100, TipoMoedas.BRL, conta);
		
		db.realizarDebitoAutomatico();
		
		conta.extrato_conta();
        
		System.out.println(perfil.getConta());
		
//		List<Servico> listaDeServicos = new ArrayList<>();
//		ServiçoCarteiraAtivos serviço1 = new ServiçoCarteiraAtivos(1, "Serviço batata", 4444, 2.0, "serviço do tipo batata", "Corretora1", "Ativo1");
//		ServicoBolsaValores serviço2 = new ServicoBolsaValores(2, "Serviço pepino", 555, 1.0, "serviço do tipo pepino", "Corretora2", "Ativo2", 0.4);
//		ServiçoCarteiraAtivos serviço3 = new ServiçoCarteiraAtivos(3, "Serviço tomate", 33, 1.0, "serviço do tipo tomate", "Corretora3", "Ativo3");
//				
//		listaDeServicos.add(serviço1);
//        listaDeServicos.add(serviço2);
//        listaDeServicos.add(serviço3);
//        
//		serviço1.contratar();
//		serviço2.contratar();
//		serviço3.contratar();
//        
//        serviço3.cancelar();
//        
//        Date dataAtual = new Date();
//        
//        PerfilServico perfilServico = new PerfilServico(1, listaDeServicos, perfil);
//        
//		System.out.println(perfilServico);


	}

}
