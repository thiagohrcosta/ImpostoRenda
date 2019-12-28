package entities;

public class PessoaFisica extends Dados  {
	
	private double gastoComSaude;
		

	public PessoaFisica(String nome, double rendaAnual, double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	
	public double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}


	@Override
	public double imposto() {
		if(getRendaAnual() < 20000) {
			return getRendaAnual() * 0.15 - gastoComSaude * 0.5;			
		}
		else{
			return getRendaAnual() * 0.25 - gastoComSaude * 0.5;			
		}
		

	}
	


}

	

