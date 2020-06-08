

public class Lift {

	private String haszn_id;
	private int kartya_sorszam;
	private int induloszint_sorszam;
	private int célszint_sorszam;
	public Lift(String haszn_id, int kartya_sorszam, int induloszint_sorszam, int célszint_sorszam) {
		super();
		this.haszn_id = haszn_id;
		this.kartya_sorszam = kartya_sorszam;
		this.induloszint_sorszam = induloszint_sorszam;
		this.célszint_sorszam = célszint_sorszam;
	}
	public String getHaszn_id() {
		return haszn_id;
	}
	public void setHaszn_id(String haszn_id) {
		this.haszn_id = haszn_id;
	}
	public int getKartya_sorszam() {
		return kartya_sorszam;
	}
	public void setKartya_sorszam(int kartya_sorszam) {
		this.kartya_sorszam = kartya_sorszam;
	}
	public int getInduloszint_sorszam() {
		return induloszint_sorszam;
	}
	public void setInduloszint_sorszam(int induloszint_sorszam) {
		this.induloszint_sorszam = induloszint_sorszam;
	}
	public int getCélszint_sorszam() {
		return célszint_sorszam;
	}
	public void setCélszint_sorszam(int célszint_sorszam) {
		this.célszint_sorszam = célszint_sorszam;
	}
	@Override
	public String toString() {
		return "Lift [haszn_id=" + haszn_id + ", kartya_sorszam=" + kartya_sorszam + ", induloszint_sorszam="
				+ induloszint_sorszam + ", célszint_sorszam=" + célszint_sorszam + "]";
	}
	
	
	
	
	
	
}
