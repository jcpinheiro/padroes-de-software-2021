package padroes.p08.decorator.cenario03;

public class TesteImposto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(600);
		Imposto icms = new ICMS();

		Imposto icmsComISS = new ICMS( new ISS( new CPMF() ) );

		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

		calculadora.realizaCalculo(orcamento, icms );
		calculadora.realizaCalculo(orcamento, icmsComISS );
		
	}
}
