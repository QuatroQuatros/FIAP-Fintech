//import java.util.Scanner;

public class SeguroMonantCard extends Servico{
    //atributos
    public int idSeguroMonantCard;
    public String tipoCartao;
    public String apelidoCartao;
    public double taxaAnuidade;

    //construtores
    public SeguroMonantCard(int idSeguroMonantCard, String tipoCartao, String apelidoCartao, double taxaAnuidade){
        this.idSeguroMonantCard = idSeguroMonantCard;
        this.tipoCartao = tipoCartao;
        this.apelidoCartao = apelidoCartao;
        this.taxaAnuidade = taxaAnuidade;
    }

    //Getters e Setters
    public int getidSeguroMonantCard() {
        return idSeguroMonantCard;
    }

    public void setidSeguroMonantCard(int idSeguroMonantCard) {
        this.idSeguroMonantCard = idSeguroMonantCard;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getApelidoCartao() {
        return apelidoCartao;
    }

    public void setApelidoCartao(String apelidoCartao) {
        this.apelidoCartao = apelidoCartao;
    }

    public double getTaxaAnuidade() { 
        return taxaAnuidade;
    }

    public void setTaxaAnuidade(double taxaAnuidade){
        this.taxaAnuidade = taxaAnuidade;
    }

    //métodos herdados
    @Override
    protected void contratar(int idSeguroMonantCard) {
        if (idSeguroMonantCard != 0) {
            super.contratar(idSeguroMonantCard);
            System.out.println("Contratando seguro do Cartão Monant...");
        }else{
            System.out.println("Seguro já contratado");
        }
    }

    @Override
    protected void cancelar(int idSeguroMonantCard) {
        //String res;

        if(idSeguroMonantCard != 0) {
            super.cancelar(idSeguroMonantCard);
            System.out.println("Cancelando Seguro do Cartão Monant...");
        }else{
            System.out.println("Seguro ainda não contratado...");
            System.out.println("Deseja contratar [SIM - S] \n\n [NÃO - N]");
            
            //res = scanner.nextLine();
        }
        // if (res.equalsIgnoreCase("S")) {
        //     System.out.println("Você escolheu SIM\n Contratando Serviço...");
        //     contratar(idSeguroMonantCard);

        // } else if (res.equalsIgnoreCase("N")) {
        //     System.out.println("Você escolheu NÃO");
        // } else {
        //     System.out.println("Resposta inválida.");
        // }

        // scanner.close();

    }
}