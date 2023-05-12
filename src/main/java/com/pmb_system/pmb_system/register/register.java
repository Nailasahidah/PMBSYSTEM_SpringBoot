package com.pmb_system.pmb_system.register;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class register {
    @Id
    @SequenceGenerator(
            name = "register_id_sequence",
            sequenceName = "register_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "register_id-sequence"
    )
    private Integer id;
    @Column(
            nullable = false
    )
    private String nama_lengkap;
    @Column(
            nullable = false
    )
    private String no_wa;
    @Column(
            nullable = false
    )
    private String password;

    public register() {

    }
    public register(Integer id, String nama_lengkap, String no_wa, String password) {
        this.id = id;
        this.nama_lengkap = nama_lengkap;
        this.no_wa = no_wa;
        this.password = password;
    }



    public register(String nama_lengkap, String no_wa, String password) {
        this.nama_lengkap = nama_lengkap;
        this.no_wa = no_wa;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getNo_wa() {
        return no_wa;
    }

    public void setNo_wa(String no_wa) {
        this.no_wa = no_wa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        register register = (register) o;
        return Objects.equals(id, register.id) && Objects.equals(nama_lengkap, register.nama_lengkap) && Objects.equals(no_wa, register.no_wa) && Objects.equals(password, register.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nama_lengkap, no_wa, password);
    }

    @Override
    public String toString() {
        return "register{" +
                "id=" + id +
                ", nama_lengkap='" + nama_lengkap + '\'' +
                ", no_wa=" + no_wa +
                ", password='" + password + '\'' +
                '}';
    }
}
