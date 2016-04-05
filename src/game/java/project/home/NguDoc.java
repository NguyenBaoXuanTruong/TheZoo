package game.java.project.home;

public class NguDoc extends NhanVat {
	String name;
	Double money, dames, buff, ngoc;

	protected NguDoc(String name, Double money, Double dames, Double buff, Double ngoc) {
		this.name = name;
		this.money = money;
		this.dames = dames;
		this.buff = buff;
		this.ngoc = ngoc;
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
}