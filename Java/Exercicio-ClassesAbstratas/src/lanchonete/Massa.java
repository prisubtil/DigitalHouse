package lanchonete;
public class Massa extends Lanche{
	private String molho;
	private TipoMassa tipo;
	
	public Massa() {
		super();
	}
	public Massa(Double preco, String molho, TipoMassa tipo) {
		super(preco);
		this.molho = molho;
		this.tipo = tipo;
	}
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	public TipoMassa getTipo() {
		return tipo;
	}
	public void setTipo(TipoMassa tipo) {
		this.tipo = tipo;
	}
	@Override
	public Double tempo(double distancia) {
		return 30 + super.tempo(distancia);		
	}
}