/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.garagem;

/**
 *
 * @author s.lucas
 */
public class carro {

    public carro() {
        modelo = "Celta";
        marca = "Chevrolet";
        ano = 2008;
        velocidadeatual = 0.1;
        velocidademaxima = 180;
        cor = "preto";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeatual() {
        return velocidadeatual;
    }

    public void setVelocidadeatual(double velocidadeatual) {
        this.velocidadeatual = velocidadeatual;
    }

    public double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }
    private String modelo, marca, cor;
    private int ano;
    private double velocidadeatual, velocidademaxima;

    public void acelerar() {
        velocidadeatual += 5;
    }

    public void freiar() {
        velocidadeatual -= 2;
    }

    public void trocarcor(String cor) {
        this.cor = cor;
    }

    public void imprimir() {
        System.out.println("Este carro é um: " + modelo + "\nDe marca" + marca + "\nDe cor" + cor +"\nDo ano de" + ano);
        
    }
}
