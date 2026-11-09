public class Buku {

    private String judul;
    private String isbn;
    private String pengarang;

    public Buku(String judul, String isbn, String pengarang) {
        this.judul = judul;
        this.isbn = isbn;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void tampilBuku() {
        System.out.println("<======Daftar buku======>");
        System.out.println("");
        System.out.println("Judul Buku  : " + getJudul());
        System.out.println("Isbn Buku   : " + getIsbn());
        System.out.println("Pengarang   : " + getPengarang());
    }
}
