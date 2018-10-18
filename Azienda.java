import java.util.List;

public class Azienda {
	
	// Dati dell'azienda
	private String nome;
	private String citt�;
	private String indirizzo;
	private String telefono; // no int perch� potrebbe ignorare eventuali 0 iniziali 0039-075.... -> 39-....
	private String partitaIva;

	// Risorse
	private List<Dipendente>;
	private List<Bovino>;
	
	// Costruttore
	public Azienda(String nome, String citt�, String indirizzo, String telefono, String partitaIva) {
		super();
		this.nome = nome;
		this.citt� = citt�;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.partitaIva = partitaIva;
	}

	public String getNome() {
		return nome;
	}

	public String getCitt�() {
		return citt�;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	
}
