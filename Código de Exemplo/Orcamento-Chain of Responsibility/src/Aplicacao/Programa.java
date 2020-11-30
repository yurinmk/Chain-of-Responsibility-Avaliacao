package Aplicacao;

import COR.CEOHandler;
import COR.DiretorHandler;
import COR.GerenteHandler;
import COR.OrcamentoCliente;
import COR.VendedorHandler;

public class Programa {

	public static void main(String[] args) {
		
		OrcamentoCliente orcamento = new OrcamentoCliente(2000000);
		
		VendedorHandler vendedor = new VendedorHandler();
		
		vendedor.setNext(new GerenteHandler())
				.setNext(new DiretorHandler())
				.setNext(new CEOHandler());
		
		vendedor.handle(orcamento);
		
		System.out.println(orcamento);

	}

}
