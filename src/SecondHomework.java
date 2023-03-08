import java.util.Scanner;

public class SecondHomework {
	public static void Reverse(String str) {

		String temp = "";
		StringBuilder sb = new StringBuilder(str);
		temp = sb.reverse().toString();

		if (temp.equals(str)) {
			System.out.println(str + " kelimesinin tersi : " + temp);
			System.out.println(str + " palindromdur.");
		}

		else {
			System.out.println(str + " kelimesinin tersi : " + temp);
			System.out.println(str + " palindrom değildir.");
		}
	}

	public static void Reverse2(String str) {
		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			temp += String.valueOf(str.charAt(i));
		}
		if (str.equals(temp)) {
			System.out.println(str + " kelimesinin tersi : " + temp);
			System.out.println(str + " palindromdur.");
		} else {
			System.out.println(str + " kelimesinin tersi : " + temp);
			System.out.println(str + " palindrom değildir.");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String str = scanner.nextLine();
		Reverse2(str);

	}
}
