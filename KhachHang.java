package QuanLyTienDien;

import java.util.Scanner;

public class KhachHang {
	private String hoTen;
	private int soNha;
	private int soCongTo;
	
	public KhachHang(){
		
	}
	
	public KhachHang(String hoTen, int soNha, int soCongTo) {
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.soCongTo = soCongTo;
	}
	
	public void NhapThongTin() {
		Scanner key = new Scanner(System.in);
		System.out.println("Ho ten ho dan su dung");
		hoTen = key.nextLine();
		System.out.println("So nha: ");
		soNha = Integer.parseInt(key.nextLine());
		System.out.println("So cong to: ");
		soCongTo = Integer.parseInt(key.nextLine());
		
	}
	
	public void HienThiThongTin() {
		System.out.println("Ho ten ho dan: "+hoTen);
		System.out.println("So nha: "+soNha);
		System.out.println("So cong to: "+soCongTo);
	}
	
}
