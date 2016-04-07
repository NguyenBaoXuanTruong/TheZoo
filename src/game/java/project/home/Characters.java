package game.java.project.home;

public class Characters extends NPC {
	private String name;
	private Double money, dames, buff, ngoc, mau;

	protected Characters(String name, Double money, Double dames, Double buff, Double ngoc, Double mau) {
		this.name = name;
		this.money = money;
		this.dames = dames;
		this.buff = buff;
		this.ngoc = ngoc;
		this.mau = mau;
	}

	@Override
	protected void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	protected void setMoney(Double money) {
		// TODO Auto-generated method stub
		this.money = money;
	}

	@Override
	protected Double getMoney() {
		// TODO Auto-generated method stub
		return this.money;
	}

	@Override
	protected void setDames(Double dames) {
		// TODO Auto-generated method stub
		this.dames = dames;
	}

	@Override
	protected Double getDames() {
		// TODO Auto-generated method stub
		return this.dames;
	}

	@Override
	protected void setBuff(Double buff) {
		// TODO Auto-generated method stub
		this.buff = buff;
	}

	@Override
	protected Double getBuff() {
		// TODO Auto-generated method stub
		return this.buff;
	}

	@Override
	protected void setNgoc(Double ngoc) {
		// TODO Auto-generated method stub
		this.ngoc = ngoc;
	}

	@Override
	protected Double getNgoc() {
		// TODO Auto-generated method stub
		return this.ngoc;
	}

	@Override
	protected void setMau(Double mau) {
		// TODO Auto-generated method stub
		this.mau = mau;
	}

	@Override
	protected Double getMau() {
		// TODO Auto-generated method stub
		return this.mau;
	}

	/// Phan process
	protected Double tancong() {
		Double randomDame = (int) (Math.random() * this.getDames() - 30) + this.getBuff();
		return randomDame;
	}

	protected Double buff() {
		Double randomBuff = (int) (Math.random() * this.getMau()) + this.getBuff();
		this.setBuff(randomBuff);
		if (this.getBuff() > 30.0)
			this.setBuff(30.0);
		return this.getBuff();
	}

	protected Double epNgoc() {
		this.setMoney(this.getMoney() - 10);
		this.setNgoc(this.getNgoc() + 1);
		return this.getNgoc();
	}
}