package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entitas.Mahasiswa;
import id.ac.undiksha.siak.entitas.Dosen;
import id.ac.undiksha.siak.entitas.Pegawai;

public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.printlnALLInfo();
		
		Mahasiswa mhs2 = new Mahasiswa(
				"Budi",
				"Singaraja",
				true,
				"21516161",
				"ilmu Komputer",
				"Teknik Informatika",
				"Teknik dan kejuruan"
				);
		mhs2.printlnALLInfo();
		
		
		
	}

}
