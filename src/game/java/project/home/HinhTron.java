package game.java.project.home;

public class HinhTron extends HinhHoc {
	private Double r;

	protected HinhTron(Double r) {
		this.r = r;
	}

	protected Double getR() {
		return r;
	}

	@Override
	protected Double Chuvi() {
		return r * 2 * 3.14;
	}

	@Override
	protected Double Dientich() {
		// TODO Auto-generated method stub
		return r * r * 3.14;
	}
}