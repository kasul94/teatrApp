package teatrApp.main.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kontakt {

	@Id
	@GeneratedValue
	private int id_kontakt;
	private String email;
	private String telefon;

	public int getId_kontakt() {
		return id_kontakt;
	}

	public void setId_kontakt(int id_kontakt) {
		this.id_kontakt = id_kontakt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
