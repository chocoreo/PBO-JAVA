package Controller;
// untuk bagian keuangan
public class c_keuangan extends c_karyawan {
	public int j_hadir			= 0;
	
	private int gajipokok		= 3400000;
	private int transportasi 	= 300000;
	private int tunjangan		= 0;
	private int pajak			= 2;
	private String posisi		= "Keuangan";
	
	public int getGajiPokok(){
		return this.gajipokok;
	}
	
	public int getTransportasi() {
		return this.transportasi*j_hadir;
	}
	
	public int getPajak() {
		return this.pajak;
	}
	
	public int getPendapatan() {
		int gaji = this.getGajiPokok() + this.getTransportasi();
		
		return gaji-((gaji * this.getPajak())/100);
	}
	
	public String getPosisi() {
		return this.posisi;
	}
}
	