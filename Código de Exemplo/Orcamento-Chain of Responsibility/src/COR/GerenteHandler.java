package COR;

public class GerenteHandler extends OrcamentoHandler{

	public OrcamentoCliente handle(OrcamentoCliente orcamento) {

		if (orcamento.getTotal() <= 5000) {
			System.out.println("O gerente tratou o orçamento!");
			orcamento.setAprovado(true);
			return orcamento;
		}

		return super.handle(orcamento);
	}

}
