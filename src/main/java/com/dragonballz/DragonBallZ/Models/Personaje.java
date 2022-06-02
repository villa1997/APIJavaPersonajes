package com.dragonballz.DragonBallZ.Models;

import javax.persistence.*;

@Entity
@Table(name = "personajes")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "Nombre", length = 60, nullable = false)
    private String Nombre;

    @Column(name = "Planeta", length =  60, nullable = false)
    private String Planeta;

    @Column(name = "Edad", nullable = false)
    private Integer Edad;

    @Column(name = "NumeroPeleas", nullable = false)
    private Integer NumeroPeleas;

    @Column(name = "Sayayin", nullable = false)
    private Boolean Sayayin;

    public Personaje(Long id, String nombre, String planeta, Integer edad, Integer numeroPeleas, Boolean sayayin) {
        Id = id;
        Nombre = nombre;
        Planeta = planeta;
        Edad = edad;
        NumeroPeleas = numeroPeleas;
        Sayayin = sayayin;
    }

    public Personaje() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPlaneta() {
        return Planeta;
    }

    public void setPlaneta(String planeta) {
        Planeta = planeta;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getNumeroPeleas() {
        return NumeroPeleas;
    }

    public void setNumeroPeleas(Integer numeroPeleas) {
        NumeroPeleas = numeroPeleas;
    }

    public Boolean getSayayin() {
        return Sayayin;
    }

    public void setSayayin(Boolean sayayin) {
        Sayayin = sayayin;
    }
}
