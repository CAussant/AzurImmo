package bts.sio.azurimmo.model;

public class Appartement {
	
	private integer id;
	
	
	@ManyToOne
	@JoinColumn(name = "batiment_id")
	private Batiment batiment;
}
