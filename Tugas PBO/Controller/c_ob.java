package Controller;
// untuk bagian office boy
public class c_ob extends c_karyawan {
	public int j_lembur 		= 0;
	public int j_hadir			= 0;
	
	private int gajipokok		= 1500000;
	private int transportasi 	= 75000;
	private int tunjangan		= 0;
	private int pajak			= 2;
	private int lembur			= 10000;
	private String posisi		= "Office Boy";
	
	public int getGajiPokok(){
		return this.gajipokok;
	}
	
	public int getTransportasi() {
		return this.transportasi*j_hadir;
	}
	
	public int getPajak() {
		return this.pajak;
	}
	
	public int getLembur() {
		return this.lembur*j_lembur;
	}
	
	public double getPendapatan() {
		int gaji = this.getGajiPokok() + this.getLembur() + this.getTransportasi();
		
		return gaji-((gaji * this.getPajak())/100);
	}
	
	public String getPosisi() {
		return this.posisi;
	}
}
	