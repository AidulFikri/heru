import java.util.Scanner;

/**
 * Program untuk memeriksa apakah sebuah kata atau frasa adalah palindrome atau bukan.
 */
public class PalindromeChecker {
    /**
     * Metode utama program. Menerima input dari pengguna dan memeriksa apakah input tersebut adalah palindrome.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau frasa: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' adalah palindrome!");
        } else {
            System.out.println("'" + input + "' bukan palindrome.");
        }
    }

    /**
     * Memeriksa apakah sebuah string adalah palindrome atau bukan.
     *
     * @param input String yang akan diperiksa apakah merupakan palindrome atau bukan.
     * @return True jika input adalah palindrome, false jika tidak.
     */
    public static boolean isPalindrome(String input) {
        // Menghapus spasi dan mengubah huruf menjadi huruf kecil
        String cleanedString = input.replaceAll("\\s", "").toLowerCase();
        int length = cleanedString.length();

        // Memeriksa apakah string adalah palindrome
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}