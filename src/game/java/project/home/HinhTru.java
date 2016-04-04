package game.java.project.home;

public class HinhTru extends HinhTron {
	private Double cao;

	protected HinhTru(Double r, Double h) {
		super(r);
		this.cao = h;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Double getR() {
		// TODO Auto-generated method stub
		return super.getR();
	}

	protected Double getCao() {
		return cao;
	}

	@Override
	protected Double Chuvi() {
		// TODO Auto-generated method stub
		return super.Chuvi() * cao;
	}

	@Override
	protected Double Dientich() {
		// TODO Auto-generated method stub
		return super.Dientich() * cao;
	}
}