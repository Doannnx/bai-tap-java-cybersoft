package nhapXuatBienKieuDuLieu;

import java.util.Scanner;

public class tinhGiaTriTrungBinh {

	public tinhGiaTriTrungBinh() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
			final int soLanNhap = 5 ;
			int tongSoNhap = 0 ;
			int giaTriTrungBinh;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Nhập số nguyên thứ 1:");
			tongSoNhap += Integer.parseInt(scan.nextLine());
			
			System.out.println("Nhập số nguyên thứ 2:");
			tongSoNhap += Integer.parseInt(scan.nextLine());
			
			System.out.println("Nhập số nguyên thứ 3");
			tongSoNhap += Integer.parseInt(scan.nextLine());
			
			System.out.println("Nhập số nguyên thứ 4");
			tongSoNhap += Integer.parseInt(scan.nextLine());
			
			System.out.println("Nhập số nguyên thứ 5");
			tongSoNhap += Integer.parseInt(scan.nextLine());
			
			giaTriTrungBinh = tongSoNhap/ soLanNhap;
			
			System.out.println("Giá trị trung bình của 5 số nguyên là:" + (int) giaTriTrungBinh );
			

	}

}
