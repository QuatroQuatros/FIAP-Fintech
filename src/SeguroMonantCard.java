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
  
}

