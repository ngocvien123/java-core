package QuanLyTienDien;

import java.util.Scanner;

class BienLai extends KhachHang{
	private int soMoi;
	private int soCu;
	private int soTienTra;
	
	public BienLai() {
		
	}
	
	public BienLai(String hoTen, int soNha, int soCongTo,int soMoi, int soCu, int soTienTra) {
		super(hoTen, soNha, soCongTo);
		this.soMoi = soMoi;
		this.soCu = soCu;
	}
	
	@Override
	public void NhapThongTin() {
		Scanner key = new Scanner(System.in);
		super.NhapThongTin();
		System.out.println("Chi so moi: ");
		soMoi = Integer.parseInt(key.nextLine());
		System.out.println("CHi so cu: ");
		soCu = Integer.parseInt(key.nextLine());
	}
	@Override
	public void HienThiThongTin() {
		super.HienThiThongTin();
		System.out.println("Chi so moi: "+soMoi);
		System.out.println("Chi so cu: "+soCu);
		System.out.println("So tien phai tra: "+TinhTienDien());
		System.out.println("-------------");
	}
	
	public int TinhTienDien() {
		soTienTra = (soMoi - soCu)*850000;
		return soTienTra;
	}
	
	
}
