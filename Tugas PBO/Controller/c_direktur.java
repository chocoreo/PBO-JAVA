package Controller;
// untuk bagian direktur
public class c_direktur extends c_karyawan {
	private int gajipokok	= 18500000;
	private int tunjangan 	= 15000000;
	private int pajak		= 2;
	private String posisi	= "Direktur";
	
	public int getGajiPokok(){
		return this.gajipokok;
	}
	
	public int getTunjangan() {
		return this.tunjangan;
	}
	
	public int getPajak() {
		return this.pajak;
	}
	
	public int getPendapatan() {
		int gaji = this.getGajiPokok() + this.getTunjangan();
		
		return gaji - ((gaji * this.getPajak())/100);
	}
	
	public String getPosisi() {
		return this.posisi;
	}
}
	