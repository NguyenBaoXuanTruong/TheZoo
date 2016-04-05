package game.java.project.home;

public class HinhVuong extends HinhHoc {
	private Double n;

	private HinhVuong(Double n) {
		this.n = n;
	}

	protected HinhVuong() {
	}

	protected Double getCanh() {
		return n;
	}

	protected void setCanh(Double n) {
		this.n = n;
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
