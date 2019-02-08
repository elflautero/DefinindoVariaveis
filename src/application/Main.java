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

		EstudoHeranca1 es = new EstudoHeranca1();
		
		es.setEndreco(sub);
		es.setEndreco(sup);
		es.imprimirEnderecos();

		
		}
	
}
