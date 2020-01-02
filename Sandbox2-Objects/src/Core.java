
public class Core {

	public static void main(String[] args) {

//		Puodukas p = new Puodukas("plast", 150);
//		
//		System.out.println(p.medziaga);
//		
//		System.out.println(p.kiekis);
//		p.ipilk(2000);
//		System.out.println(p.kiekis);
//		p.isgerk(100);
//		System.out.println(p.kiekis);
//		p.isgerk(100);
//		System.out.println(p.kiekis);
//		
//		
//		System.out.println("============");
//		
//		Puodukas mano = new Puodukas("didesnis", 400);
//		Puodukas tavo = new Puodukas("mazesnis", 200);
//		tavo.ipilk(200);
//		
//		Puodukas[] puodukai = perpilk(mano,tavo);
//		
//		mano = puodukai[0];
//		tavo = puodukai[1];
//		
//		
//		
//		
//		System.out.println(mano.kiekis);
//		System.out.println(tavo.kiekis);
//		

		Puodukas p = new Puodukas("kazkokia", 150);

		System.out.println(p.getTuris());

		EPuodukas e = new EPuodukas(200);

		System.out.println(e.getSpalva());
		System.out.println(e.getTemp());
		
		System.out.println(e.toString());
		
		

	}

//	public static Puodukas[] perpilk(Puodukas p1, Puodukas p2) {
//		int temp = p1.kiekis;
//		p1.kiekis = p2.kiekis;
//		p2.kiekis = temp;
//		
//		if (p1.kiekis > p1.turis) {
//			p1.kiekis = p1.turis;
//		}
//		if (p2.kiekis > p2.turis) {
//			p2.kiekis = p2.turis;
//		}
//		if (p1.kiekis < 0) {
//			p1.kiekis = 0;
//		}
//		if (p2.kiekis < 0) {
//			p2.kiekis = 0;
//		}
//		
//		Puodukas[] puodukai = {p1, p2};
//		
//		return puodukai;
//	}

}
