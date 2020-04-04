package composite.base;

public class PilhaNormal implements FornecedorDeEnergia {
	private double energiaPilhaNormal = 0.5;
	
	@Override
	public double fornecer() {
		if (energiaPilhaNormal>= 0.1) {
			System.out.println("Pilha Normal Transmitindo Energia");
			return energiaPilhaNormal;
		}else {
			System.out.println("Pilha Normal sem Energia");
			return 0;
		}
	}
	
	public double getEnergiaPilhaNormal() {
		return energiaPilhaNormal;
	}

}