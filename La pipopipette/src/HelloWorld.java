
import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nombre de lignes : ");
		int nbLigne= sc.nextInt();
		System.out.println("Saisir le nombre de colonnes : ");
		int nbColonne= sc.nextInt();
		System.out.println("Saisir le numéro de configuration : \n\t-1 : Avec bordures\n\t-2 : Sans bordure");
		int configuration= sc.nextInt();
		System.out.println("\n nbLigne ="+nbLigne+"\n nbColonne = "+nbColonne+"\nnbConf "+configuration);
		Plateau plateau = new Plateau(nbLigne, nbColonne, configuration);
		System.out.println(plateau.toString());
		
	}
}
