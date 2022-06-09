package j;

import java.util.Scanner;

public class Algo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String conInfo = sc.nextLine();

		String[] conInfoArr = conInfo.split(" ");
		double a = Integer.parseInt(conInfoArr[0]);
		double b = Integer.parseInt(conInfoArr[1]);
		double R = Integer.parseInt(conInfoArr[2]);
		int N = sc.nextInt();
		String[] resultArr = new String[N];

		for (int i = 0; i < N; i++) {

			Scanner sc1 = new Scanner(System.in);
			String shade = sc1.nextLine();
			String[] shadeArr = shade.split(" ");
			double x = Double.parseDouble(shadeArr[0]);
			double y = Double.parseDouble(shadeArr[1]);

			if ((Math.pow((x - a), 2) + Math.pow((y - b), 2)) >= Math.pow(R, 2)) {
				resultArr[i] = "silent";
			} else {
				resultArr[i] = "noisy";
			}
		}

		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}

		sc.close();
	}

}
