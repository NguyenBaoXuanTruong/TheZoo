package game.java.project.home;

public class HinhVuong extends HinhHoc {
	private Double n;

	protected HinhVuong(Double n) {
		this.n = n;
	}

	protected Double getCanh() {
		return n;
	}

	@Override
	protected Double Chuvi() {
		return n * 2;
	}

	@Override
	protected Double Dientich() {
		return n * n;
	}
}
