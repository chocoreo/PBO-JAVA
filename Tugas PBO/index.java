// Metta Saputra
// 1822250042
import java.util.Scanner;
import Controller.*;

public class index {
	private static Scanner m = new Scanner(System.in);
	
	//posisi
	private static String[] posisi	= {"Direktur","Keuangan","Office Boy"};
	//menentukan banyak class yang dipake
	private static int[] jumlah_class = {0,0,0};
	
	public static void main(String[] args) {
		//deklarasi
		int jkaryawan;
		
		//mulai
		System.out.println("            PAYROLL           ");
		System.out.println("========================================");	
		System.out.print("Masukkan Jumlah Karyawan = ");
		jkaryawan = m.nextInt();
		System.out.println("Jabatan yang tersedia");
			for(int x = 0; x < posisi.length; x++){
				System.out.println((x + 1)+". " +posisi[x]);
			}
		System.out.println("========================================");
		
		String dtKaryawan[][] = new String[jkaryawan][4];
			for(int x = 0; x < jkaryawan; x++){
			System.out.println("Input Data Karyawan ke-"+(x+1));
			System.out.print("Nama\t\t\t = ");
			dtKaryawan[x][0] = m.next();
			System.out.print("NIK\t\t\t = ");
			dtKaryawan[x][1] = m.next();
			System.out.print("Alamat\t\t\t = ");
			dtKaryawan[x][2] = m.next();
			System.out.print("Jabatan(1/2/3)\t\t = ");
			dtKaryawan[x][3] = m.next();
			System.out.println("======================================");
			++jumlah_class[
			Integer.parseInt(dtKaryawan[x][3])-1
			];
		}
		
		
		//siapkan objek gaji
		c_direktur Direktur[] = new c_direktur[jumlah_class[0]];
		c_keuangan Finance[] = new c_keuangan[jumlah_class[1]];
		c_ob ob[] = new c_ob[jumlah_class[2]];
		
		// untuk reset jumlah class (ajis blg) 
		for(int x = 0; x < jumlah_class.length; x++){
				jumlah_class[x] = 0;
			}
			
		//output
		//pake switch case kek daspro dulu
		for (int x = 0; x < jkaryawan; x++){
			System.out.println("\tGaji Karyawan ke-"+(x+1));
		
		int posisikaryawan	= Integer.parseInt(dtKaryawan[x][3]),
		index_jumlah_class = posisikaryawan - 1,
		pos = jumlah_class[index_jumlah_class];
		
		switch(posisikaryawan){
			case 1:
			Direktur[pos] = new c_direktur();
			Direktur[pos].Nama	 = dtKaryawan[x][0];
			Direktur[pos].NIK	 = dtKaryawan[x][1];
			Direktur[pos].Alamat = dtKaryawan[x][2];
			
			//output khusus nama
			System.out.println("Nama\t\t\t :" +Direktur[pos].Nama);
			
			//<output>
			System.out.println("NIK\t\t\t :" +Direktur[pos].NIK);
			System.out.println("Alamat\t\t\t :" +Direktur[pos].Alamat);
			System.out.println("Jabatan\t\t\t :" +Direktur[pos].getPosisi());
			System.out.println("Gaji Pokok\t\t :" +Direktur[pos].getGajiPokok());
			System.out.println("Tunjangan\t\t :" +Direktur[pos].getTunjangan());
			System.out.println("Pajak\t\t\t :" +Direktur[pos].getPajak()+"%");
			System.out.println("Total Terima\t\t :" +Direktur[pos].getPendapatan());
			
			break;
			
			case 2:
			Finance[pos] = new c_keuangan();
			Finance[pos].Nama	 = dtKaryawan[x][0];
			Finance[pos].NIK	 = dtKaryawan[x][1];
			Finance[pos].Alamat	 = dtKaryawan[x][2];
			
			//output khusus nama
			System.out.println("Nama\t\t\t :" +Finance[pos].Nama);
			
			//input jumlah hadir
			System.out.print("Jumlah Hadir (Hari)\t :");
			Finance[pos].j_hadir = m.nextInt();
			
			//output
			System.out.println("NIK\t\t\t :" +Finance[pos].NIK);
			System.out.println("Alamat\t\t\t :" +Finance[pos].Alamat);
			System.out.println("Jabatan\t\t\t :" +Finance[pos].getPosisi());
			System.out.println("Gaji Pokok\t\t :" +Finance[pos].getGajiPokok());
			System.out.println("Pajak\t\t\t :" +Finance[pos].getPajak()+"%");
			System.out.println("Total Terima\t\t :" +Finance[pos].getPendapatan());

			break;
			
			case 3:
			ob[pos] = new c_ob();
			ob[pos].Nama	= dtKaryawan[x][0];
			ob[pos].NIK	 	= dtKaryawan[x][1];
			ob[pos].Alamat	= dtKaryawan[x][2];
			
			//output khusus nama
			System.out.println("Nama\t\t\t :" +ob[pos].Nama);
		
			//input jumlah hadir
			System.out.print("Jumlah Hadir (Hari)\t :");
			ob[pos].j_hadir = m.nextInt();		
			System.out.print("Jumlah Lembur (Jam)\t:");
			ob[pos].j_lembur = m.nextInt();
			//output data lain
			System.out.println("NIK\t\t\t :" +ob[pos].NIK);
			System.out.println("Alamat\t\t\t :" +ob[pos].Alamat);
			System.out.println("Jabatan\t\t\t :" +ob[pos].getPosisi());
			System.out.println("Gaji Pokok\t\t :" +ob[pos].getGajiPokok());
			System.out.println("Pajak\t\t\t :" +ob[pos].getPajak()+"%");
			System.out.println("Total Terima\t\t :" +ob[pos].getPendapatan());
			
			break;
		}
		System.out.println("=====================================");
		jumlah_class[index_jumlah_class]++;
		}
	}
}