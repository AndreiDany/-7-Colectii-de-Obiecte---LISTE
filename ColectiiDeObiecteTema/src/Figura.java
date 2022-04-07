
public class Figura {
	
	Culoare culoare;
	
	public Figura(Culoare culoare) {

		this.culoare = culoare;
	}

	public double CalculPerimetru(){
		
		return -1;
	}
	
	public String toString(){
		
		return this.getClass() + " de culoare " + getCuloare() + " si primetru " + CalculPerimetru();
	}

	public Culoare getCuloare() {
		return culoare;
	}

	public void setCuloare(Culoare culoare) {
		this.culoare = culoare;
	}
	
	public boolean equals(Figura f) {
		if(this.getClass().equals(f.getClass()) && (this.CalculPerimetru() == f.CalculPerimetru()))
			return true;
		return false;
	}
}
