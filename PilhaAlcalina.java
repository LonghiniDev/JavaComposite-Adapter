package composite.base;

public class PilhaAlcalina implements FornecedorDeEnergia {
	private double energiaPilhaAlcalina = 1.0;

	@Override
	public double fornecer() {
		if (energiaPilhaAlcalina >=  0.1) {
			System.out.println("Pilha Alcalina Transmitindo Energia");
			return energiaPilhaAlcalina;
		}else {
			System.out.println("Pilha Alcalina  sem energia");
			return 0;
		}
	}
	
	public double getEnergiaPilhaAlcalina() {
		return energiaPilhaAlcalina;
	}

}