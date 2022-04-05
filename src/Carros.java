public class Carros {

    public static final String VERMELHO = "vermelho";
    public static final String PRETA = "preta";

    private Integer quantidadePneus;
    private Integer quantidadePortas;
    private Integer quantidadeParafusosPneu;
    private Integer quantidadeRodas;

    public Carros(Integer quantidadePneus) {
        setQuantidadePneus(quantidadePneus);
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        quantidadePortas = quantidadePneus;
        quantidadeParafusosPneu = quantidadePneus * 4;
        quantidadeRodas = quantidadePneus;
        this.quantidadePneus = quantidadePneus;
    }

    public Integer getQuantidadePortas() {
                return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
                this.quantidadePortas = quantidadePortas;
    }

    public Integer getQuantidadeParafusosPneu() {
               return quantidadeParafusosPneu;
    }

    public void setQuantidadeParafusosPneu(Integer quantidadeParafusosPneu) {
        this.quantidadeParafusosPneu = quantidadeParafusosPneu;
    }

    public Integer getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(Integer quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public void setCor(String cor) {
        System.out.println(cor);
    }

    public void imprimeValores() {
        System.out.println("Quantidade Pneus" + getQuantidadePneus() );
        System.out.println("Quantidade Parafusos" + getQuantidadeParafusosPneu() );
        System.out.println("Quantidade Portas" + getQuantidadePortas() );
        System.out.println("Quantidade Rodas" + getQuantidadeRodas() );

    }
}