package composite.energiaNuclear;

public class AppCompositeBase {
	
	public static void main(String[] args) {
		PilhaNormal pilhaNormal = new PilhaNormal();
		PilhaAlcalina pilhaAlcalina = new PilhaAlcalina();
		
		ControleRemoto controleDaSala = new ControleRemoto();
		FornecedorComposite composite = new FornecedorComposite();
		
		AdaptadorDeEnergia energiaNuclear = new AdaptadorDeEnergia(pilhaAlcalina);
		System.out.println(energiaNuclear.FornecerEnergia());
		
		composite.adicionarFornecedor(pilhaNormal);
		composite.adicionarFornecedor(pilhaAlcalina);
		controleDaSala.setFornecedorDeEnergia(composite);
		
		controleDaSala.ligar();
		controleDaSala.trocarDeCanal(70);
		controleDaSala.trocarDeCanal(25);
		controleDaSala.desligar();

	}

}
