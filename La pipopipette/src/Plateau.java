public class Plateau {
	
	private int nbLigne;
	private int nbColonne;
	private String[][] plateau;
	
	public Plateau(int nbLigne,int nbColonne, int configuration){
		plateau = new String[nbLigne*2+1][nbColonne+1];
		if(configuration == 1){
			//Configuration avec bords
			for(int i=0; i<nbLigne*2+1; i+=2){
				System.out.println("\n");
				for(int j=0; j<nbColonne; j++){
					//Si c'est un ligne paire -> peit trait
					if(i==0 || i==nbLigne*2){
						//on fait la bordure
						plateau[i][j]="1";
					}
					else{
						plateau[i][j]="0";
					}
				}
			}for(int i=1; i<nbLigne*2+1; i+=2){
				System.out.println("\n");
				for(int j=0; j<nbColonne+1; j++){
					//Si c'est un ligne paire -> peit trait
					if(j==0 || j==nbColonne){
						//on fait la bordure
						plateau[i][j]="1";
					}
					else{
						plateau[i][j]="0";
					}
				}
			}

		}else{
			for(int i=0; i<nbLigne*2+1; i++){
				for(int j=0; j<nbColonne; j++){
					plateau[i][j]="0";
				}
			}
		}

		
	}
	public String toString(){
		String chaine=null;
		for(int i=0; i<nbLigne*2+1; i++){
			chaine+="\n";System.out.print("\n");
			for(int j=0; j<nbColonne+1; j++){
				if( i%2==0){
					System.out.print("+");
					chaine+="+";
					if(plateau[i][j] =="1"){
						System.out.print("—");
						chaine+="—";
					}else{
						System.out.print("\u00A0");
						chaine+="\u00A0";
					}	
				}else{
					if(plateau[i][j] =="1"){
						System.out.print("|\u00A0");
						chaine+="|\u00A0";
					}else{
						System.out.print("\u00A0\u00A0");
						chaine+="\u00A0\u00A0";
					}
				}
			}

		}
		return chaine;
	}

}
