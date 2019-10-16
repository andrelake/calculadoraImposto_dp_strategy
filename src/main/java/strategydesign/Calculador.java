package strategydesign;

public class Calculador {
	
	public void fazCalculo(Orcamento orcamento, Imposto imposto) 
	{
		double calculo = imposto.calcula(orcamento);
		System.out.println(calculo);
		
	}
	
}
