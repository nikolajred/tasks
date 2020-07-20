public class Task1 {
//  https://informatics.mccme.ru/mod/book/view.php?id=266&chapterid=58
    public static int Catalan(int n) {
        int[] C = new int[n + 1];
// Создаем массив для хранения C[m]
        C[0] = 1;
        // Вычисляем C[m] для m=1..n
        for (int m = 1; m <= n; ++m){
            C[m] = 0;
            for (int k = 0; k < m; ++k) {
                C[m] += C[k] * C[m - 1 - k];
            }
        }
        return C[n];
    }

    public static void main(String[] args) {
        System.out.println(Catalan(7));

    }
}
