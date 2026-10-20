package Biblio;

public class Revue extends Document {
    private int num;
	Revue(int id, String titre, int annee, boolean disponible, int num) {
		super(id, titre, annee, disponible);
		this.setNum(num);
	}

	@Override
	public void DureeEmprunt() {
		System.out.println("L'emprunt de la revue dure 7 jours");
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
