import java.sql.Date;

public abstract class Servico {
    //private int id;
    private int id_servico;
    private String nome_servico;
    private double valor_servico;
    private double taxa_servico;
    private String tipo_servico;
    private Date data_contratacao;

    public void contratar() {
        if (data_contratacao == null) {
            data_contratacao = new Date(System.currentTimeMillis());
            System.out.println("Serviço contratado em " + data_contratacao);
        } else {
            System.out.println("O serviço já foi contratado em " + data_contratacao);
        }
    }

    public void cancelar() {
        if (data_contratacao != null) {
            data_contratacao = null;
            System.out.println("Serviço cancelado.");
        } else {
            System.out.println("O serviço não foi contratado ainda.");
        }
    }
}
