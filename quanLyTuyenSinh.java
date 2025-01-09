package ham;

import java.util.Scanner;

public class quanLyTuyenSinh {
	static final int KHU_VUC_A = 2;
	static final int KHU_VUC_B = 1;
	static final float KHU_VUC_C = 0.5f;
	
	static final float DOI_TUONG_1 = 2.5f;
	static final float DOI_TUONG_2 = 1.5f;
	static final int DOI_TUONG_3 = 1;
	

	public quanLyTuyenSinh() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		float diem1= nhapDiem1(scann) ;
		float diem2= nhapDiem2(scann);
		float diem3= nhapDiem3(scann);	
		float diemChuan= nhapDiemChuan(scann);		
		char khuVuc = nhapKhuVuc(scann);		
		int doiTuong = nhapDoiTuong(scann) ;
		
		float ketQua = xetTuyen(diem1, diem2, diem3, khuVuc, doiTuong, diemChuan);
	}
	
	// các hàm nhập điểm
	
	public static float nhapDiem1( Scanner scann) {
		float mon1;
		System.out.println("Mời bạn nhập điểm môn thứ nhất");
		mon1 = Float.parseFloat(scann.nextLine());
		return mon1;
	}
	public static float nhapDiem2( Scanner scann) {
		float mon2;
		System.out.println("Mời bạn nhập điểm môn thứ hai");
		mon2 = Float.parseFloat(scann.nextLine());
		return mon2;
	}
	public static float nhapDiem3( Scanner scann) {
		float mon3;
		System.out.println("Mời bạn nhập điểm môn thứ ba");
		mon3 = Float.parseFloat(scann.nextLine());
		return mon3;
	}
	
	public static float nhapDiemChuan( Scanner scann) {
		float diem;
		System.out.println("Mời bạn nhập điểm chuẩn");
		diem = Float.parseFloat(scann.nextLine());
		return diem;
	}
	
	// hàm nhập khu vực
	
	public static char nhapKhuVuc(Scanner scann) {
		char khu;
		System.out.println("Nhập khu vực của thí sinh");
		System.out.println("A. Khu vực A");
		System.out.println("B. Khu vực B");
		System.out.println("C. Khu vực C");
		System.out.println("X. Không có khu vực");
		
		khu = scann.nextLine().charAt(0);
		
		return khu;
	}
	
	public static int nhapDoiTuong(Scanner scann) {
		int loai;
		System.out.println("Nhập đối tượng của thí sinh:");
		System.out.println("1. Đối tượng 1");
		System.out.println("2. Đối tượng 2");
		System.out.println("3. Đối tượng 3");
		System.out.println("0. Không có đối tượng");
		loai = Integer.parseInt(scann.nextLine());
		return loai;
	}
	
	
	//Hàm chọn khu vực
	
	public static float chonKhuVuc(char khuVuc) {
		float diemKhu = 0;
		if (khuVuc == 'A') {
			diemKhu = KHU_VUC_A;
		}else if (khuVuc =='B') {
			diemKhu = KHU_VUC_B;
		}else if (khuVuc == 'C') {
			diemKhu =  KHU_VUC_C;
		}else {
			diemKhu = 0;
		}
		return diemKhu;
	}
	
	// Hàm chọn đối tượng
	
	private static float chonDoiTuong(int doiTuong) {
		float diem;
		if (doiTuong == 1) {
			diem = DOI_TUONG_1;
		}else if (doiTuong == 2) {
			diem = DOI_TUONG_2;
		}else if (doiTuong ==3) {
			diem = DOI_TUONG_3;
		}else {
			diem = 0;
		}
		return diem;
	}
	
	// Hàm tính điểm 3 môn
	
		public static float tinhDiem3Mon(float diem1, float diem2, float diem3) {
			float tong = diem1 + diem2 +diem3;
			return tong;
		}
		
	// Hàm tính tổng điểm
		public static float tongDiem(float diem1, float diem2, float diem3, char khuVuc, int doiTuong ) {
			float tong = 0;
				tong = tinhDiem3Mon(diem1, diem2, diem3) + chonKhuVuc(khuVuc) + chonDoiTuong(doiTuong);
			return tong;
		}
	// Hàm xét tuyển
		public static float xetTuyen(float diem1, float diem2, float diem3, char khuVuc, int doiTuong ,float diemChuan) {
			float tong = tongDiem(diem1, diem2, diem3, khuVuc, doiTuong);
			if (tong >= diemChuan) {
				System.out.println("Bạn đã đậu với số điểm" + tong);
			}
			else if (diem1 ==0 || diem2 ==0 || diem3 ==0 ) {
				System.out.println("Bạn đã rớt có môn 0 điểm:" + tong );
			}else {
				System.out.println("Bạn đã rớt " + tong );
			}
			return tong;
		}
		

}
