package pojo;

/**
 * Created by root on 19/06/17.
 */

public class Orang {
    private String nama;
    private String pekerjaan;

    public Orang(String nama, String pekerjaan) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPekerjaan() {
        return this.pekerjaan;
    }
}
