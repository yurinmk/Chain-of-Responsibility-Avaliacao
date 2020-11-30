package COR;

public abstract class OrcamentoHandler {

	protected OrcamentoHandler next = null;
	
	public OrcamentoHandler setNext(OrcamentoHandler handler) {
		this.next = handler;
		return handler;
	}
	
	public OrcamentoCliente handle(OrcamentoCliente orcamento) {
		if(this.next != null) {
			return this.next.handle(orcamento);
		}
		return orcamento;
	}
	
}
