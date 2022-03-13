package magacin;

import java.util.LinkedList;
import java.util.List;

import interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs{


	private List<Artikal> artikli=new LinkedList<>();

	@Override
	public void dodajArtikal(Artikal artikal) {

		if(artikal!=null) {
			artikli.add(0, artikal);
		}else {
			throw new IllegalArgumentException("Artikal ne moze biti null!");
		}

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		artikli.remove(artikal);

	}

	@Override
	public Artikal pretraziArtikal(int sifraArtikla) {
		for (Artikal artikal : artikli) {
			if(artikal.getSifra()==sifraArtikla) {
				return artikal;
			}
		}
		return null;
	}
	

}
