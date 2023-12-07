package soed_n_seek;

import java.util.Vector;
import soed_n_seek.Komentar;
import soed_n_seek.Laporan;

public class Mahasiswa extends User {
	private String _nim;
	private String _jurusan;
	public Vector<Komentar> _komentar = new Vector<Komentar>();
	public Vector<Laporan> _laporan = new Vector<Laporan>();

	public void createComment() {
		throw new UnsupportedOperationException();
	}

	public void editComment() {
		throw new UnsupportedOperationException();
	}

	public void deleteComment() {
		throw new UnsupportedOperationException();
	}
}