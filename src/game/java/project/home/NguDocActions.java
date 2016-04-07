package game.java.project.home;

public class NguDocActions {
	NguDoc nv1 = new NguDoc("Tom", 100.0, 20.0, 0.0, 2.0, 1000.0);

	protected void setTen(String name) {
		nv1.setName(name);
	}

	protected String getTen() {
		String n = nv1.getName();
		return n;
	}

	protected void setMau(Double mau) {
		nv1.setMau(mau);
	}

	protected Double tancong() {
		Double randomDame = (int) (Math.random() * nv1.getDames()) + nv1.getBuff();
		return randomDame;
	}

	protected Double buff() {
		Double randomBuff = (int) (Math.random() * nv1.getMau()) + nv1.getBuff();
		nv1.setBuff(randomBuff);
		if (nv1.getBuff() > 30.0)
			nv1.setBuff(30.0);
		return nv1.getBuff();
	}

	protected Double epNgoc() {
		nv1.setMoney(nv1.getMoney() - 10);
		nv1.setNgoc(nv1.getNgoc() + 1);
		return nv1.getNgoc();
	}
}
