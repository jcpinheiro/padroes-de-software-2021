package padroes.p01.strategy.cenario02;

public class TesteCalculoImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(100);

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
        calculadorDeImpostos.calcula(orcamento, "ISS");
        calculadorDeImpostos.calcula(orcamento, "ICMS");



    }


}
