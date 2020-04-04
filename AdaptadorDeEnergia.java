package composite.energiaNuclear;

public class AdaptadorDeEnergia implements GeradorDeEnergiaNuclear{
	private FornecedorDeEnergia fornecedorDeEnergia;
	
	public AdaptadorDeEnergia(FornecedorDeEnergia fornecedorDeEnergia) {
		this.fornecedorDeEnergia = fornecedorDeEnergia;
	}
	
	public double FornecerEnergia() {
		System.out.println("Energia Nuclear");
		return fornecedorDeEnergia.FornecerEnergia();
	}
	
	public FornecedorDeEnergia getFornecedorDeEnergia() {
		return fornecedorDeEnergia;
	}
	
}
