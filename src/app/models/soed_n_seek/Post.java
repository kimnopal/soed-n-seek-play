package soed_n_seek;

import java.util.Vector;
import soed_n_seek.Komentar;
import soed_n_seek.Laporan;
import soed_n_seek.Kontak;

public class Post {
	private int _iD;
	private String _judul;
	private String _deskripsi;
	private String _foto;
	private String _tanggal_dibuat;
	public Vector<Komentar> _komentar = new Vector<Komentar>();
	public Vector<Laporan> _laporan = new Vector<Laporan>();
	public Vector<Kontak> _kontak = new Vector<Kontak>();
	public Status_Kehilangan _status;
}