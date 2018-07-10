package patterns.adapter;

public class Adapter implements OldApi{

	public void get(String text) {
		New nowy = new New();
		nowy.pobierzTekst(text);
	}

}
