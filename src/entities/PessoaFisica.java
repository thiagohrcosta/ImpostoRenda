package entities;

public class PessoaFisica extends Dados {
	
	private double gastoComSaude;
		
	public PessoaFisica(String nome, double rendaAnual, double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public double calcImposto() {
		if (rendaAnual < 20000.00 ) {
			return rendaAnual * 0.15;
		}
		else{
			return rendaAnual * 0.25;
		}
		
		
	}
	
	public double gastoSaude() {
		if (gastoComSaude > 0) {
			return gastoComSaude * 0.5;
		}
		else {
			return 0;
		}
	}



}

	

