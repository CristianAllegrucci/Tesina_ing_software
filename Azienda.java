import java.util.List;

public class Azienda {
	
	// Dati dell'azienda
	private String nome;
	private String città;
	private String indirizzo;
	private String telefono; // no int perchè potrebbe ignorare eventuali 0 iniziali 0039-075.... -> 39-....
	private String partitaIva;

	// Risorse
	private List<Dipendente>;
	private List<Bovino>;
	
	// Costruttore
	public Azienda(String nome, String città, String indirizzo, String telefono, String partitaIva) {
		super();
		this.nome = nome;
		this.città = città;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.partitaIva = partitaIva;
	}

	public String getNome() {
		return nome;
	}

	public String getCittà() {
		return città;
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
