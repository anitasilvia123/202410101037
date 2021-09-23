class Petani {
    String nama;
    boolean statusPanen;

    public Petani(String nama) {
        this.nama = nama;
    }

    public void setStatuspanen(boolean status) {
        this.statusPanen = status;
    }

    public boolean pesanan(String alamat) {
        if (this.statusPanen) {
            System.out.println("berhasil memesan");
        } else {
            System.out.println("gagal memesan");
        }
        return this.statusPanen;
    }
}

class Tengkulak {
    String nama;
    String alamat;
    boolean statusPemesanan;

    public Tengkulak(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void membeli() {
        Petani petani1 = new Petani("petani1");
        petani1.setStatuspanen(true);
        this.statusPemesanan = petani1.pesanan(this.alamat);
    }

    public String lihatPemesanan() {
        if (this.statusPemesanan) {
            return "pesanan berhasil";
        } else {
            return "pesanan gagal";
        }
    }
}

public class App {
    public static void main(String[] args) {
        Tengkulak tengkulak1 = new Tengkulak("tengkulak1", "jember");
        tengkulak1.membeli();
        System.out.println(tengkulak1.lihatPemesanan());
    }
}
