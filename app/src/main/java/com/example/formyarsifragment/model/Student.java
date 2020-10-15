package com.example.formyarsifragment.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
//    for student form (form 1)

    private String nama, fakultas, prodi, status, pass, passconfirm, alasan, NIK, prestasi, tanggallahir,
            jeniskelamin, kewarganegaraan, agama, alamat,RT,RW, kode, provinsi,kota, noHp, email;

    public Student() {
    }

    public Student(String nama, String fakultas, String prodi, String status, String pass, String passconfirm, String alasan, String NIK, String prestasi, String tanggallahir, String jeniskelamin, String kewarganegaraan, String agama, String alamat, String RT, String RW, String kode, String provinsi, String kota, String noHp, String email) {
        this.nama = nama;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.status = status;
        this.pass = pass;
        this.passconfirm = passconfirm;
        this.alasan = alasan;
        this.NIK = NIK;
        this.prestasi = prestasi;
        this.tanggallahir = tanggallahir;
        this.jeniskelamin = jeniskelamin;
        this.kewarganegaraan = kewarganegaraan;
        this.agama = agama;
        this.alamat = alamat;
        this.RT = RT;
        this.RW = RW;
        this.kode = kode;
        this.provinsi = provinsi;
        this.kota = kota;
        this.noHp = noHp;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPassconfirm() {
        return passconfirm;
    }

    public void setPassconfirm(String passconfirm) {
        this.passconfirm = passconfirm;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getPrestasi() {
        return prestasi;
    }

    public void setPrestasi(String prestasi) {
        this.prestasi = prestasi;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRT() {
        return RT;
    }

    public void setRT(String RT) {
        this.RT = RT;
    }

    public String getRW() {
        return RW;
    }

    public void setRW(String RW) {
        this.RW = RW;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    For Parent form (second form)
private String namaAyah, NIKAyah, namaIbu, NIKIbu, tahunAyah, tahunIbu, alamatOrtu, RTOrtu, RWOrtu, provinsiOrtu, kotaOrtu, kodeOrtu, noOrtu,
        emailOrtu, pendidikanAyah, pendidikanIbu, pekerjaanAyah, pekerjaanIbu;

    public Student(String namaAyah, String NIKAyah, String namaIbu, String NIKIbu, String tahunAyah, String tahunIbu, String alamatOrtu, String RTOrtu, String RWOrtu, String provinsiOrtu, String kotaOrtu, String kodeOrtu, String noOrtu, String emailOrtu, String pendidikanAyah, String pendidikanIbu, String pekerjaanAyah, String pekerjaanIbu) {
        this.namaAyah = namaAyah;
        this.NIKAyah = NIKAyah;
        this.namaIbu = namaIbu;
        this.NIKIbu = NIKIbu;
        this.tahunAyah = tahunAyah;
        this.tahunIbu = tahunIbu;
        this.alamatOrtu = alamatOrtu;
        this.RTOrtu = RTOrtu;
        this.RWOrtu = RWOrtu;
        this.provinsiOrtu = provinsiOrtu;
        this.kotaOrtu = kotaOrtu;
        this.kodeOrtu = kodeOrtu;
        this.noOrtu = noOrtu;
        this.emailOrtu = emailOrtu;
        this.pendidikanAyah = pendidikanAyah;
        this.pendidikanIbu = pendidikanIbu;
        this.pekerjaanAyah = pekerjaanAyah;
        this.pekerjaanIbu = pekerjaanIbu;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public String getNIKAyah() {
        return NIKAyah;
    }

    public void setNIKAyah(String NIKAyah) {
        this.NIKAyah = NIKAyah;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    public String getNIKIbu() {
        return NIKIbu;
    }

    public void setNIKIbu(String NIKIbu) {
        this.NIKIbu = NIKIbu;
    }

    public String getTahunAyah() {
        return tahunAyah;
    }

    public void setTahunAyah(String tahunAyah) {
        this.tahunAyah = tahunAyah;
    }

    public String getTahunIbu() {
        return tahunIbu;
    }

    public void setTahunIbu(String tahunIbu) {
        this.tahunIbu = tahunIbu;
    }

    public String getAlamatOrtu() {
        return alamatOrtu;
    }

    public void setAlamatOrtu(String alamatOrtu) {
        this.alamatOrtu = alamatOrtu;
    }

    public String getRTOrtu() {
        return RTOrtu;
    }

    public void setRTOrtu(String RTOrtu) {
        this.RTOrtu = RTOrtu;
    }

    public String getRWOrtu() {
        return RWOrtu;
    }

    public void setRWOrtu(String RWOrtu) {
        this.RWOrtu = RWOrtu;
    }

    public String getProvinsiOrtu() {
        return provinsiOrtu;
    }

    public void setProvinsiOrtu(String provinsiOrtu) {
        this.provinsiOrtu = provinsiOrtu;
    }

    public String getKotaOrtu() {
        return kotaOrtu;
    }

    public void setKotaOrtu(String kotaOrtu) {
        this.kotaOrtu = kotaOrtu;
    }

    public String getKodeOrtu() {
        return kodeOrtu;
    }

    public void setKodeOrtu(String kodeOrtu) {
        this.kodeOrtu = kodeOrtu;
    }

    public String getNoOrtu() {
        return noOrtu;
    }

    public void setNoOrtu(String noOrtu) {
        this.noOrtu = noOrtu;
    }

    public String getEmailOrtu() {
        return emailOrtu;
    }

    public void setEmailOrtu(String emailOrtu) {
        this.emailOrtu = emailOrtu;
    }

    public String getPendidikanAyah() {
        return pendidikanAyah;
    }

    public void setPendidikanAyah(String pendidikanAyah) {
        this.pendidikanAyah = pendidikanAyah;
    }

    public String getPendidikanIbu() {
        return pendidikanIbu;
    }

    public void setPendidikanIbu(String pendidikanIbu) {
        this.pendidikanIbu = pendidikanIbu;
    }

    public String getPekerjaanAyah() {
        return pekerjaanAyah;
    }

    public void setPekerjaanAyah(String pekerjaanAyah) {
        this.pekerjaanAyah = pekerjaanAyah;
    }

    public String getPekerjaanIbu() {
        return pekerjaanIbu;
    }

    public void setPekerjaanIbu(String pekerjaanIbu) {
        this.pekerjaanIbu = pekerjaanIbu;
    }

//    For last school form (form 3)

    private String lastCampus, lastFaculty, lastProdi, lastCampusPlace, lastCampusCity, lastCampusAddress, campusCode, akreditasi, IPK;

    public Student(String lastCampus, String lastFaculty, String lastProdi, String lastCampusPlace, String lastCampusCity, String lastCampusAddress, String campusCode, String akreditasi, String IPK) {
        this.lastCampus = lastCampus;
        this.lastFaculty = lastFaculty;
        this.lastProdi = lastProdi;
        this.lastCampusPlace = lastCampusPlace;
        this.lastCampusCity = lastCampusCity;
        this.lastCampusAddress = lastCampusAddress;
        this.campusCode = campusCode;
        this.akreditasi = akreditasi;
        this.IPK = IPK;
    }

    public String getLastCampus() {
        return lastCampus;
    }

    public void setLastCampus(String lastCampus) {
        this.lastCampus = lastCampus;
    }

    public String getLastFaculty() {
        return lastFaculty;
    }

    public void setLastFaculty(String lastFaculty) {
        this.lastFaculty = lastFaculty;
    }

    public String getLastProdi() {
        return lastProdi;
    }

    public void setLastProdi(String lastProdi) {
        this.lastProdi = lastProdi;
    }

    public String getLastCampusPlace() {
        return lastCampusPlace;
    }

    public void setLastCampusPlace(String lastCampusPlace) {
        this.lastCampusPlace = lastCampusPlace;
    }

    public String getLastCampusCity() {
        return lastCampusCity;
    }

    public void setLastCampusCity(String lastCampusCity) {
        this.lastCampusCity = lastCampusCity;
    }

    public String getLastCampusAddress() {
        return lastCampusAddress;
    }

    public void setLastCampusAddress(String lastCampusAddress) {
        this.lastCampusAddress = lastCampusAddress;
    }

    public String getCampusCode() {
        return campusCode;
    }

    public void setCampusCode(String campusCode) {
        this.campusCode = campusCode;
    }

    public String getAkreditasi() {
        return akreditasi;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public String getIPK() {
        return IPK;
    }

    public void setIPK(String IPK) {
        this.IPK = IPK;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.fakultas);
        dest.writeString(this.prodi);
        dest.writeString(this.status);
        dest.writeString(this.pass);
        dest.writeString(this.passconfirm);
        dest.writeString(this.alasan);
        dest.writeString(this.NIK);
        dest.writeString(this.prestasi);
        dest.writeString(this.tanggallahir);
        dest.writeString(this.jeniskelamin);
        dest.writeString(this.kewarganegaraan);
        dest.writeString(this.agama);
        dest.writeString(this.alamat);
        dest.writeString(this.RT);
        dest.writeString(this.RW);
        dest.writeString(this.kode);
        dest.writeString(this.provinsi);
        dest.writeString(this.kota);
        dest.writeString(this.noHp);
        dest.writeString(this.email);
        dest.writeString(this.namaAyah);
        dest.writeString(this.NIKAyah);
        dest.writeString(this.namaIbu);
        dest.writeString(this.NIKIbu);
        dest.writeString(this.tahunAyah);
        dest.writeString(this.tahunIbu);
        dest.writeString(this.alamatOrtu);
        dest.writeString(this.RTOrtu);
        dest.writeString(this.RWOrtu);
        dest.writeString(this.provinsiOrtu);
        dest.writeString(this.kotaOrtu);
        dest.writeString(this.kodeOrtu);
        dest.writeString(this.noOrtu);
        dest.writeString(this.emailOrtu);
        dest.writeString(this.pendidikanAyah);
        dest.writeString(this.pendidikanIbu);
        dest.writeString(this.pekerjaanAyah);
        dest.writeString(this.pekerjaanIbu);
        dest.writeString(this.lastCampus);
        dest.writeString(this.lastFaculty);
        dest.writeString(this.lastProdi);
        dest.writeString(this.lastCampusPlace);
        dest.writeString(this.lastCampusCity);
        dest.writeString(this.lastCampusAddress);
        dest.writeString(this.campusCode);
        dest.writeString(this.akreditasi);
        dest.writeString(this.IPK);
    }

    protected Student(Parcel in) {
        this.nama = in.readString();
        this.fakultas = in.readString();
        this.prodi = in.readString();
        this.status = in.readString();
        this.pass = in.readString();
        this.passconfirm = in.readString();
        this.alasan = in.readString();
        this.NIK = in.readString();
        this.prestasi = in.readString();
        this.tanggallahir = in.readString();
        this.jeniskelamin = in.readString();
        this.kewarganegaraan = in.readString();
        this.agama = in.readString();
        this.alamat = in.readString();
        this.RT = in.readString();
        this.RW = in.readString();
        this.kode = in.readString();
        this.provinsi = in.readString();
        this.kota = in.readString();
        this.noHp = in.readString();
        this.email = in.readString();
        this.namaAyah = in.readString();
        this.NIKAyah = in.readString();
        this.namaIbu = in.readString();
        this.NIKIbu = in.readString();
        this.tahunAyah = in.readString();
        this.tahunIbu = in.readString();
        this.alamatOrtu = in.readString();
        this.RTOrtu = in.readString();
        this.RWOrtu = in.readString();
        this.provinsiOrtu = in.readString();
        this.kotaOrtu = in.readString();
        this.kodeOrtu = in.readString();
        this.noOrtu = in.readString();
        this.emailOrtu = in.readString();
        this.pendidikanAyah = in.readString();
        this.pendidikanIbu = in.readString();
        this.pekerjaanAyah = in.readString();
        this.pekerjaanIbu = in.readString();
        this.lastCampus = in.readString();
        this.lastFaculty = in.readString();
        this.lastProdi = in.readString();
        this.lastCampusPlace = in.readString();
        this.lastCampusCity = in.readString();
        this.lastCampusAddress = in.readString();
        this.campusCode = in.readString();
        this.akreditasi = in.readString();
        this.IPK = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
