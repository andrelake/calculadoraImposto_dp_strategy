package strategydesign;

public class ICCC implements Imposto{

	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() >= 1000 && orcamento.getValor() < 3000) {
			return orcamento.getValor() * 0.07;
		}
		return orcamento.getValor() * 0.08;
	}

}
