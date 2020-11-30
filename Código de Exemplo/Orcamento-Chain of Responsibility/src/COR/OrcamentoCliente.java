package COR;

public class OrcamentoCliente {
	
	private int total;
	private boolean aprovado = false;
	
	
	public OrcamentoCliente(int total) {
		this.total = total;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public boolean isAprovado() {
		return aprovado;
	}


	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}


	@Override
	public String toString() {
		return "OrcamentoCliente [total=" + total + ", aprovado=" + aprovado + "]";
	}
	

}
