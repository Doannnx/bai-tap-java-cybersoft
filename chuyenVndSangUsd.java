package nhapXuatBienKieuDuLieu;

import java.util.Scanner;

public class chuyenVndSangUsd {

	public chuyenVndSangUsd() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float TIGIAVND = 23.500f;
		float usd ;
		float vnd ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Đổi tiền USD => VND");
		
		System.out.println("Vui lòng nhập số USD:");
		usd = Float.parseFloat(scan.nextLine());
		
		vnd = usd * TIGIAVND ;
		
		System.out.println("Số VND sau khi đổi là:"+ (float) vnd + " vnđ" );

	}

}
