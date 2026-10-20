package Biblio;

public class Livre extends Document {
    private String auteur;
	Livre(int id, String titre, int annee, boolean disponible, String auteur) {
		super(id, titre, annee, disponible);
		this.setAuteur(auteur);
	}

	@Override
	public void DureeEmprunt() {
		System.out.println("L'emprunt du livre dure 21 jours");
		
	}
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
