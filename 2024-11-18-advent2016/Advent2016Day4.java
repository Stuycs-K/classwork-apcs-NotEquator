import java.io.File;
import java.util.Scanner;

public class Advent2016Day4 {
    public static int sumSectorIds(String fileName) {
        int sectorIdSum = 0;

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                int lastDash = line.lastIndexOf('-');
                int bracketStart = line.indexOf('[');

                String encryptedName = line.substring(0, lastDash).replace("-", "");
                int sectorId = Integer.parseInt(line.substring(lastDash + 1, bracketStart));
                String checksum = line.substring(bracketStart + 1, line.length() - 1);

                int[] frequencies = new int[26];
                for (char c : encryptedName.toCharArray()) {
                    frequencies[c - 'a']++;
                }

                char[] letters = new char[26];
                for (int i = 0; i < 26; i++) {
                    letters[i] = (char) (i + 'a');
                }

                for (int i = 0; i < letters.length - 1; i++) {
                    for (int j = i + 1; j < letters.length; j++) {
                        if (frequencies[letters[j] - 'a'] > frequencies[letters[i] - 'a'] ||
                            (frequencies[letters[j] - 'a'] == frequencies[letters[i] - 'a'] && letters[j] < letters[i])) {
                            // Swap letters
                            char temp = letters[i];
                            letters[i] = letters[j];
                            letters[j] = temp;
                        }
                    }
                }

                String calculatedChecksum = "";
                for (int i = 0; i < 5; i++) {
                    calculatedChecksum += letters[i];
                }

                if (calculatedChecksum.equals(checksum)) {
                    sectorIdSum += sectorId;
                }
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return sectorIdSum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of sector IDs: " + sumSectorIds("C:\\Users\\motta\\OneDrive\\Desktop\\APCS\\classwork-apcs-NotEquator\\2024-11-18-advent2016\\input.txt"));
    }
}
