package ham;

import java.util.Scanner;

public class tinhThueThuNhap {
	// % thuế phải chịu với thu nhập cá nhân <= thu nhập chịu thuế
	public final static float THUE_60 = 0.05f ;
	public final static float THUE_120 = 0.1f ;
	public final static float THUE_210 = 0.15f ;
	public final static float THUE_384 = 0.20f ;
	public final static float THUE_624 = 0.25f ;
	public final static float THUE_960 = 0.30f ;
	public final static float THUE_TREN_960 = 0.35f ;
	
	public final static byte THU_NHAP_60 = 60 ;
	public final static byte THU_NHAP_120 = 60 ;
	public final static byte THU_NHAP_210 = 90 ;
	public final static short THU_NHAP_384 = 147 ;
	public final static short THU_NHAP_624 = 240 ;
	public final static short THU_NHAP_960 = 336 ;
	
	

	public tinhThueThuNhap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ten ;
		System.out.println("Nhập tên người nộp thuế");
		ten = scan.nextLine();
		float thuNhapChiuThue = tinhThuNhapChiuThue(scan) ;
		
		float dongThue = tinhTienThuePhaiTra(thuNhapChiuThue);
		System.out.println("Số thuế" + ten + " phải nộp là: " + dongThue+ "triệu đồng" );

	}
	
	public static float tinhThuNhapChiuThue(Scanner scan) {
		System.out.println("Nhập vào tổng thu nhập trong năm đợn vị triệu đồng");
		float tinhThuNhap = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập vào số người phụ thuộc");
		int soNguoi = Integer.parseInt(scan.nextLine());
		
		tinhThuNhap = tinhThuNhap - 4 - soNguoi * 1.6f;
		
		return tinhThuNhap;
	}
	
	public static float tinhTienThue( float thuNhapChiuThue, float thue) {
		float tinhTien = thuNhapChiuThue * thue ;
		return tinhTien;
	}
	
	public static float tinhTienThuePhaiTra( float thuNhapChiuThue) {
		float tienThuePhaiNop = 0  ;
		if (thuNhapChiuThue <= THU_NHAP_60 ) {
			tienThuePhaiNop = tinhTienThue(thuNhapChiuThue, THUE_60);
		}else if (thuNhapChiuThue <= THU_NHAP_120) {
			thuNhapChiuThue -= THU_NHAP_60;
			tienThuePhaiNop = tinhTienThue(THU_NHAP_60, THUE_60) + tinhTienThue(thuNhapChiuThue, THUE_120);
		}else if (thuNhapChiuThue <= THU_NHAP_210) {
			thuNhapChiuThue -= THU_NHAP_120;
			tienThuePhaiNop = tinhTienThue(THU_NHAP_60, THUE_60) + tinhTienThue(THUE_120, THUE_120)+ tinhTienThue(thuNhapChiuThue, THUE_210);
		}
		else if (thuNhapChiuThue <= THU_NHAP_384) {
			thuNhapChiuThue -= THU_NHAP_210;
			tienThuePhaiNop = tinhTienThue(THU_NHAP_60, THUE_60) + tinhTienThue(THUE_120, THUE_120)+ tinhTienThue(THUE_210, THUE_210)
				+ tinhTienThue(thuNhapChiuThue, THUE_384);
		}else if (thuNhapChiuThue <= THU_NHAP_624) {
			thuNhapChiuThue -= THU_NHAP_384;
			tienThuePhaiNop = tinhTienThue(THU_NHAP_60, THUE_60) + tinhTienThue(THUE_120, THUE_120)+ tinhTienThue(THUE_210, THUE_210)
				+ tinhTienThue(THU_NHAP_384, THUE_384)+ tinhTienThue(thuNhapChiuThue, THUE_624);
		}else if (thuNhapChiuThue <= THU_NHAP_960) {
			thuNhapChiuThue -= THU_NHAP_624;
			tienThuePhaiNop = tinhTienThue(THU_NHAP_60, THUE_60) + tinhTienThue(THUE_120, THUE_120)+ tinhTienThue(THUE_210, THUE_210)
				+ tinhTienThue(THU_NHAP_384, THUE_384)+ tinhTienThue(THUE_624, THUE_624) + tinhTienThue(thuNhapChiuThue, THUE_960);
		}else if (thuNhapChiuThue >= THU_NHAP_960) {
			thuNhapChiuThue -= THU_NHAP_960;
			tienThuePhaiNop = tinhTienThue(THU_NHAP_60, THUE_60) + tinhTienThue(THUE_120, THUE_120)+ tinhTienThue(THUE_210, THUE_210)
				+ tinhTienThue(THU_NHAP_384, THUE_384)+ tinhTienThue(THUE_624, THUE_624) + tinhTienThue(THU_NHAP_960, THUE_960) + tinhTienThue(thuNhapChiuThue, THUE_TREN_960) ;
			
		}
		return tienThuePhaiNop;
	}
}
