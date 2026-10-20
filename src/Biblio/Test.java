package Biblio;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Document>doc = new ArrayList<>();
		doc.add(new Livre(1,"Dans la valée des cents",2000,false,"Ouzo"));
		doc.add(new Revue(3,"Hier des vents",2028,true,7));
		doc.add(new Livre(6,"Le feu de punk",2026,true,"Ali"));
		doc.add(new Revue(2,"Journal d'hier",2008,false,98));
		for(Document d : doc) {
			System.out.println("Titre: "+d.titre);
			d.emprunter();
			d.retourner();
			d.emprunter();
			d.DureeEmprunt();
			System.out.println(" ");
		}
	}
}


