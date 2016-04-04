package game.java.project.home;

public class HinhChuNhat extends HinhVuong {
	private Double m;

	protected HinhChuNhat(Double n, Double m) {
		super(n);
		// TODO Auto-generated constructor stub
		this.m = m;
	}

	@Override
	protected Double getCanh() {
		// TODO Auto-generated method stub
		return super.getCanh();
	}

	protected Double getCanh2() {
		return m;
	}

	@Override
	protected Double Chuvi() {
		// TODO Auto-generated method stub
		return 2 * (super.getCanh() + getCanh2());
	}

	@Override
	protected Double Dientich() {
		// TODO Auto-generated method stub
		return super.getCanh() * getCanh2();
	}

}