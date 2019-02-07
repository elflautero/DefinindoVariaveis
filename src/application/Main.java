package application;
import java.util.*;
public class Main  {
	
	public static void main(String[] args) {
		
	Subterranea sub = new Subterranea();
		
	sub.setLogadouro (" casa do sol");
 	sub.setSubsistema("R3");
	
	Superficial sup = new Superficial ();
	
	sup.setLogadouro("Maresias");
	sup.setRio("Rio das Ostras");
	
		List <Endereco> list = new ArrayList <>();
		
		list.add(sub);
		list.add(sup);
	
		Superficial sup2 = new Superficial();
		
		for ( Endereco e : list ) {
			if ( e instanceof Subterranea ) {
				System.out.println
				("___ Subterrânea: "
			    + "\n     Subsistema: "
				+ ( ( Subterranea ) e ).
				getSubsistema()
				+ "\n     Endereço: "
				+ (( Subterranea ) e )
					.getLogadouro()
			
				);
			}
			if (e instanceof Superficial){
				System.out.println(
				"___ Superficial: "
				+ "\n     rio: " +
				( (Superficial) e ).
				getRio()
				+ "\n     Endereço: "
				+ (( Superficial ) e )
					.getLogadouro()
				);
			
				sup2 = (Superficial) e;
			}
		}
		
		System.out.println(
		    "\n Superficial 2: "
			+ sup2.getLogadouro());
	}
}
