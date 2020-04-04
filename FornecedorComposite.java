package composite.base;

import java.util.ArrayList;
import java.util.List;

public class FornecedorComposite implements FornecedorDeEnergia{
	
	private List<FornecedorDeEnergia> fornecedoresDeEnergia = new ArrayList<>();
	private double energiaTotal = 0.1; 
	
	@Override
	public double fornecer() {
		for (FornecedorDeEnergia fe : fornecedoresDeEnergia) {
			if (fe.fornecer() > 0.1 || fe.fornecer() < 0.1) {
				energiaTotal += fe.fornecer();
			}else {
				System.out.println("Sem Energia");
				return 0;
			}
		}
		
		if (energiaTotal > 0.1) {
			return energiaTotal;
		}
		
		System.out.println("Sem Energia");
		return 0;
		
	}
	
	public void adicionarEnergia(FornecedorDeEnergia energia) {
		fornecedoresDeEnergia.add(energia);
	}
}
