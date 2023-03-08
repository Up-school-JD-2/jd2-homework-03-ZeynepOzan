import java.util.Scanner;

public class FirstHomework {
	public static void game() {
		boolean end = false;

		int number = (int) (Math.random() * 100);

		Scanner scanner = new Scanner(System.in);
		System.out.println("******Guessing Game******");
		System.out.print("Enter the number of Players: ");
		int numberOfPlayers = scanner.nextInt();
		int count = numberOfPlayers;
		int temp = numberOfPlayers;
		int[] players = new int[numberOfPlayers];
		int[] score = new int[numberOfPlayers];
		int[] result = new int[numberOfPlayers];
		int index = 0;
		boolean control = false;
		while (count > 0) {
			for (int i = 0; i < temp; i++) {
				System.out.println(i + 1 + ".player guess : ");
				players[i] = scanner.nextInt();

			}

			for (int i = 0; i < temp; i++) {
				if (players[i] < number) {
					System.out.println(i + 1 + ".player : Too low,try again!!");
					score[i] += 1;
				} else if (players[i] > number) {
					System.out.println(i + 1 + ".player : Too high, try again!!!");
					score[i] += 1;
				} else {
					System.out.println(i + 1 + ".player : Congratulations, You found number!!!");
					result[index] = score[i];
					count--;
					index++;
					control = true;
				}
			}
			if (control == true) {
				temp--;
			}
			control = false;

			end = true;

		}
		System.out.println();
		System.out.println("******HIGH SCORE******");
		System.out.println(" PLAYER" + "\t\t\t" + "SCORE");
		int k = 1;
		for(int i =result.length-1; i >= 0; i --) {
			System.out.println(k + ".Player  \t\t " + result[i]);
			k++;
		}
	}

	public static void main(String[] argsa) {

		game();

	}

}
