import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String questSequence = generateQuestSequence(N);
        System.out.println(questSequence);
    }

    public static String generateQuestSequence(int N) {
        StringBuilder questSequence = new StringBuilder(N);

        for (int i = 0; i < N; i++) {
            double probabilityOfSilver = (double) i / (N - 1);

            if (probabilityOfSilver < 0.2) {
                questSequence.append('b');
            } else if (probabilityOfSilver < 0.5) {
                if ((i % 3) == 0) {
                    questSequence.append('s');
                } else {
                    questSequence.append('b');
                }
            } else if (probabilityOfSilver < 0.8) {
                if ((i % 2) == 0) {
                    questSequence.append('s');
                } else {
                    questSequence.append('b');
                }
            } else {
                questSequence.append('s');
            }
        }

        return questSequence.toString();
    }
}