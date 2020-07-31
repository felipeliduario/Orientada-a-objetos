
public class Conversor {

	public double converterPesParaMetros(double valor){
		return valor*0.3048;
	}
	public double converterPesParaPolegadas(double valor){
		return valor*12;
	}
	public double converterPesParaCentimetros(double valor){
		return valor*30.48;
	}
	public double converterPolegadasParaMetros(double valor){
		return valor*0.0254;
	}
	public double converterPolegadasParaPes(double valor){
		return valor*0.0833;
	}
	public double converterPolegadasParaCentimetros(double valor){
		return valor*2.54;
	}
	public double converterMetrosParaPolegadas(double valor){
		return valor*39.37;
	}
	public double converterMetrosParaCentimetros(double valor){
		return valor*100;
	}
	public double converterCentimetrosParaPes(double valor){
		return valor*0.394;
	}
	public double converterCentimetrosParaMetros(double valor){
		return valor*0.01;
	}
}
