package Biblio;

public abstract class Document {
	protected int id;
	protected String titre;
	protected int annee;
	protected boolean disponible;
	private static int nbDoc;
	
 Document(int id, String titre, int annee, boolean disponible) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.disponible = disponible;
        nbDoc++;
}

public boolean getDisponible() {
	return disponible;
}

public void setDisponible(boolean disponible) {
	this.disponible = disponible;
}

public void setNbDoc(int nbDoc) {
	Document.nbDoc = nbDoc;
}
public void emprunter() {
	if(disponible) {
	System.out.println("Emprunt effectué");
	disponible = false;
	}
	else System.out.println("Document indisponible");
}
public void retourner() {
	System.out.println("Document rendu");
	disponible = true;
}

public static int getNbDoc() {
	return nbDoc;
}

public String toString() {
	System.out.println("Document id: "+id);
	System.out.println("Titre: "+titre);
	System.out.println("Année de publication: "+annee);
	System.out.println("Disponibilité: "+disponible);
	return "  "; 
}
public abstract void DureeEmprunt();
}