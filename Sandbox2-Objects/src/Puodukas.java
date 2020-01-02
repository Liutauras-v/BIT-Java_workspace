
public class Puodukas {

	private String medziaga;
	private int turis;
	private int kiekis;
	private String spalva;

	public Puodukas(String m, int t) {
		this.medziaga = m;
		this.turis = t;
		this.kiekis = 0;
		this.spalva = "#fff";
	}

	public void ipilk(int kiek) {
		this.kiekis += kiek;

		if (this.kiekis > this.turis) {
			this.kiekis = this.turis;
		}
	}

	public void isgerk(int kiek) {
		this.kiekis -= kiek;

		if (this.kiekis < 0) {
			this.kiekis = 0;
		}
	}

	public String getSpalva() {
		return this.spalva;
	}

	public void setSpalva(String spalva) {
		this.spalva = spalva;
	}

	public String getMedziaga() {
		return this.medziaga;
	}

	public void setMedziaga(String medziaga) {
		this.medziaga = medziaga;
	}

	public int getTuris() {
		return this.turis;
	}

	public void setTuris(int turis) {
		this.turis = turis;
	}

	public int getKiekis() {
		return this.kiekis;
	}

	public void setKiekis(int kiekis) {
		this.kiekis = kiekis;
	}

	@Override
	public String toString() {
		return "Puodukas [medziaga=" + this.medziaga + ", turis=" + this.turis + ", kiekis=" + this.kiekis + ", spalva="
				+ this.spalva + "]";
	}

}
