import java.util.Scanner;

public class WordAnalyzer {

    public int countTargetWord(String[] words, String targetWord) {
        if (words == null || targetWord == null) {
            return 0;
        }

        int count = 0;
        for (String word : words) {
            if (word != null && word.equalsIgnoreCase(targetWord)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 👉 Nhập danh sách từ
        System.out.print("Nhập các từ (cách nhau bằng dấu cách): ");
        String input = scanner.nextLine();

        // 👉 Nhập từ cần tìm
        System.out.print("Nhập từ cần tìm: ");
        String target = scanner.nextLine();

        // 👉 Tách chuỗi thành mảng
        String[] words = input.split(" ");

        // 👉 Gọi hàm xử lý
        WordAnalyzer analyzer = new WordAnalyzer();
        int result = analyzer.countTargetWord(words, target);

        // 👉 In kết quả
        System.out.println("Số lần xuất hiện của '" + target + "' là: " + result);

        scanner.close();
    }
}