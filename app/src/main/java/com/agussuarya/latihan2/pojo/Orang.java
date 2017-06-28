package com.agussuarya.latihan2.pojo;

import java.io.Serializable;

/**
 * Created by root on 19/06/17.
 */

public class Orang implements Serializable{
    private String nama;
    private String pekerjaan;
    private String linkImg;

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    public Orang(String nama, String pekerjaan, String linkImg) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.linkImg = linkImg;

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
