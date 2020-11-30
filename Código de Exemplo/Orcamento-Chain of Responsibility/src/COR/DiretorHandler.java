package COR;

public class DiretorHandler extends OrcamentoHandler{
	
	public OrcamentoCliente handle(OrcamentoCliente orcamento) {

		if (orcamento.getTotal() <= 50000) {
			System.out.println("O diretor tratou o orçamento!");
			orcamento.setAprovado(true);
			return orcamento;
		}

		return super.handle(orcamento);
	}

}
