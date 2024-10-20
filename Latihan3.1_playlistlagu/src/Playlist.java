public class Playlist {
    private Song head; // Menunjuk ke lagu pertama dalam playlist

    public Playlist() {
        this.head = null; // Inisialisasi head dengan null
    }

    // Metode untuk menambahkan lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title); // Membuat objek lagu baru
        if (head == null) {
            head = newSong; // Jika playlist kosong, lagu baru menjadi head
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next; // Mencari lagu terakhir
            }
            current.next = newSong; // Menambahkan lagu baru di akhir
        }
    }

    // Metode untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        Song current = head;
        while (current != null) {
            System.out.println(current.title); // Menampilkan judul lagu
            current = current.next; // Pindah ke lagu berikutnya
        }
    }public static class Main {
        public static void main(String[] args) {
            // Membuat objek Playlist
            Playlist playlist = new Playlist();

            // Menambahkan lagu ke dalam playlist
            playlist.addSong("Lagu 1");
            playlist.addSong("Lagu 2");
            playlist.addSong("Lagu 3");

            // Menampilkan semua lagu dalam playlist
            System.out.println("Daftar Lagu dalam Playlist:");
            playlist.displayPlaylist();
        }
    }
}