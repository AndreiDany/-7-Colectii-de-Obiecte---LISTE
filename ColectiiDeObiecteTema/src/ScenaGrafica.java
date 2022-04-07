import java.util.ArrayList;
import java.util.Iterator;

public class ScenaGrafica {
	
	private static int nrFiguri = 0;
	private static ArrayList<Figura> scenaGrafica = new ArrayList<Figura>();
	
	public static void AdaugaFigura(Figura f)
	{
		if((nrFiguri+1) > 10) {
			System.out.println("Adaugare esuata: scena grafica este plina!");
		}
		scenaGrafica.add(f);
		nrFiguri++;
	}
	
	public static String ToString(){
	
	String str = "Continut scena grafica:\n";
	Iterator<Figura> it = scenaGrafica.iterator();
	
	while(it.hasNext()) {
		
		str = str + "\n" + it.next().toString(); 
		
	}
	
	return str;
	
	}
	
	public static void main(String[] args){
		
		Figura cerc = new Cerc(Culoare.ALBASTRU, 10);
		Figura patrat = new Patrat(Culoare.GALBEN, 12);
		Figura triunghi = new Triunghi(Culoare.ROSU, 8, 10, 10);

		AdaugaFigura(cerc);	
		AdaugaFigura(patrat);
		AdaugaFigura(triunghi);
		
		System.out.println(ToString());
		System.out.println("\n");
		
		scenaGrafica.remove(2);
		
		System.out.println(ToString());
		
	}
	
}
