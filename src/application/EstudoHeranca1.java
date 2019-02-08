package application;
import java.util.*;

public class EstudoHeranca1 {
	
    List <Endereco> listSub = new ArrayList<>();
	
	public void setEndreco (Endereco end) {
	
		this.listSub.add(end);
	}
	
	public void imprimirEnderecos(){
		
		for ( Endereco e : listSub ) {
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

			}
		}
	}
}
