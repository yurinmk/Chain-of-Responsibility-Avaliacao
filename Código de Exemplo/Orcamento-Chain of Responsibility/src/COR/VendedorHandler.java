package COR;

public class VendedorHandler extends OrcamentoHandler{
	
	public OrcamentoCliente handle(OrcamentoCliente orcamento) {
		
		if(orcamento.getTotal() <= 1000) {
			System.out.println("O vendedor tratou o orçamento!");
			orcamento.setAprovado(true);
			return orcamento;
		}
		
		return super.handle(orcamento);
	}
}
