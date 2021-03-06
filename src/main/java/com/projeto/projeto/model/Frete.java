package com.projeto.projeto.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Frete implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public void setId(long id) {
        this.id = id;
    }



    private String NomeDestinario;
    private String CepDestino;
    private String CepOrigem;
    private String peso;
    private String vlTotalFrete;
    private String dataPrevistaEntrega;
    private String dataConsulta;

    public Frete(String nomeDestinario, String cepOrigem, String cepDestino) {
        NomeDestinario = nomeDestinario;
        CepOrigem = cepOrigem;
        CepDestino = cepDestino;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDestinario() {
        return NomeDestinario;
    }

    public void setNomeDestinario(String nomeDestinario) {
        NomeDestinario = nomeDestinario;
    }

    public String getCepDestino() {
        return CepDestino;
    }

    public void setCepDestino(String cepDestino) {
        CepDestino = cepDestino;
    }

    public String getCepOrigem() {
        return CepOrigem;
    }

    public void setCepOrigem(String cepOrigem) {
        CepOrigem = cepOrigem;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getVlTotalFrete() {
        return vlTotalFrete;
    }

    public void setVlTotalFrete(String vlTotalFrete) {
        this.vlTotalFrete = vlTotalFrete;
    }

    public String getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(String dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }


    @Override
    public String toString() {
        return "Frete{" +
                "id=" + id +
                ", NomeDestinario='" + NomeDestinario + '\'' +
                ", CepDestino='" + CepDestino + '\'' +
                ", CepOrigem='" + CepOrigem + '\'' +
                ", peso='" + peso + '\'' +
                ", vlTotalFrete='" + vlTotalFrete + '\'' +
                ", dataPrevistaEntrega='" + dataPrevistaEntrega + '\'' +
                ", dataConsulta='" + dataConsulta + '\'' +
                '}';
    }


    public Frete() {

    }
}
