package nhapXuatBienKieuDuLieu;

import java.util.Scanner;

public class bai3_timDiemM {

	public bai3_timDiemM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		float xTam, yTam, banKinh , xDiemM, yDiemM, khoangCach;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Xác định tọa đổ điểm M ");
		System.out.println("Vui lòng nhập tọa độ x tâm đường tròn:");
		xTam = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập tọa đọ y tâm đường tròn:");
		yTam = Float.parseFloat(scan.nextLine());
		
		System.out.println("Vui lòng nhập vào bán kính đường tròn");
		banKinh = Float.parseFloat(scan.nextLine());
		
		System.out.println("Vui lòng nhập tọa độ x điểm M:");
		xDiemM = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập tọa độ y điểm M");
		yDiemM = Float.parseFloat(scan.nextLine());
		
		khoangCach = (float) Math.sqrt((xTam-xDiemM)*(xTam-xDiemM) + (yTam-yDiemM)*(yTam-yDiemM)) ;
		
		if(khoangCach > banKinh) {
			System.out.println("Điểm M nằm ngoài đường tròn");
		}else if (khoangCach < banKinh) {
			System.out.println("Điểm M nằm trong đường tròn");
		}else {
			System.out.println("Diểm M nằm trên đường tròn");
		}

	}

}
