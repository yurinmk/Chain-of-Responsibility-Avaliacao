package COR;

public class CEOHandler extends OrcamentoHandler{
	
	public OrcamentoCliente handle(OrcamentoCliente orcamento) {
		
		System.out.println("O CEO trata qualquer or�amento!");
		orcamento.setAprovado(true);
		return orcamento;
		

	}
	

}
