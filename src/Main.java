import java.util.Date;
import java.util.ArrayList;
import java.util.List;


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
		
        Cartao cartao1 = new Cartao(1, 1001, "João Silva", "1234", "1234567890123456", 123, 50.0,
                new Date(), TipoCartao.CREDITO, true, true, conta);
        
        Cartao cartao2 = new Cartao(2, 1002, "João Silva", "1234", "1234567890123456", 123, 50.0,
                new Date(), TipoCartao.DEBITO, true, true, conta);
               
        // Criando um objeto da classe MonantCard
        MonantCard monantCard = new MonantCard(101, "Meu Cartão", 2, 1002, "Maria Souza", "5678", "2345678901234567",
                456, 30.0, new Date(), TipoCartao.DEBITO, true, false, conta);
        
        conta.addCartao(cartao1);
        conta.addCartao(cartao2);
        conta.addCartao(monantCard);
        
        List<Cartao> cartoes = conta.getCartoes();
        for(Cartao cartao: cartoes) {
            System.out.println("Nome Titular: " + cartao.getNomeTitular());
            System.out.println("Número do Cartão: " + cartao.getNumeroCartao());
            System.out.println("Tipo de Cartão: " + cartao.getTipoCartao());
            System.out.println("Status: " + (cartao.getStatus() ? "Ativo" : "Inativo"));
            System.out.println("-----------------------------");
        }
        
        cartao1.desativarAproximacao();
        cartao2.bloquearCartao();
//        monantCard.excluirCartao(conta, monantCard);
        
//        List<Cartao> cartoes2 = conta.getCartoes();
//        for(Cartao cartao: cartoes2) {
//            System.out.println("Nome Titular: " + cartao.getNomeTitular());
//            System.out.println("Número do Cartão: " + cartao.getNumeroCartao());
//            System.out.println("Tipo de Cartão: " + cartao.getTipoCartao());
//            System.out.println("Status: " + (cartao.getStatus() ? "Ativo" : "Inativo"));
//            System.out.println("-----------------------------");
//        }
        

         // Exibindo informações dos objetos
//
//        System.out.println("\nInformações do MonantCard:");
//        System.out.println(monantCard.toString());
//        System.out.println(perfil.getConta());
        
        MonantCard card = new MonantCard(101, "Meu Cartão", 2, 1002, "Maria Souza", "5678", "2345678901234567",
                456, 30.0, new Date(), TipoCartao.DEBITO, true, false, conta);
   
        
		
		List<Servico> listaDeServicos = new ArrayList<>();
		ServiçoCarteiraAtivos serviço1 = new ServiçoCarteiraAtivos(1, "Serviço batata", 4444, 2.0, "serviço do tipo batata", "Corretora1", "Ativo1");
		ServicoBolsaValores serviço2 = new ServicoBolsaValores(2, "Serviço pepino", 555, 1.0, "serviço do tipo pepino", "Corretora2", "Ativo2", 0.4);
		SeguroMonantCard serviço3 = new SeguroMonantCard(3, "Serviço tomate", 33.0, 1.0, "serviço do tipo tomate", 1, "cartao teste", 0.4, card);
				
		listaDeServicos.add(serviço1);
        listaDeServicos.add(serviço2);
        listaDeServicos.add(serviço3);
        
		serviço1.contratar();
		serviço2.contratar();
		serviço3.contratar();
        
        serviço3.cancelar();
        
        PerfilServico perfilServico = new PerfilServico(1, listaDeServicos, perfil);
      
		System.out.println(perfilServico);


	}

}
