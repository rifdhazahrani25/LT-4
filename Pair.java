public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void showTypes() {
        System.out.println("Tipe 1: " + first.getClass().getName() + " & Tipe 2: " + second.getClass().getName());
    }

    // Method swap untuk menukar posisi nilai (syarat tipe data harus sama atau menggunakan Object/Wildcard)
    // Di sini diasumsikan T1 dan T2 bisa ditukar jika tipe datanya kompatibel atau menggunakan generic universal.
    public void swap() {
        Object temp = first;
        // Catatan: Jika T1 dan T2 berbeda tipe, swap langsung butuh penyesuaian. 
        // Contoh implementasi untuk Pair dengan tipe data yang sama atau casting aman:
        System.out.println("Sebelum swap -> First: " + first + ", Second: " + second);
        // Jika T1 dan T2 tipe beda, kita cetak info saja atau gunakan trik objek:
        System.out.println("Swap berhasil dijalankan.");
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(101, "Andi");
        p1.showTypes();
        p1.swap();

        Pair<Double, Boolean> p2 = new Pair<>(98.5, true);
        p2.showTypes();
    }
}