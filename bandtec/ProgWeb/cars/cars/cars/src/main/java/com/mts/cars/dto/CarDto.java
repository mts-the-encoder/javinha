package com.mts.cars.dto;

import com.mts.cars.entity.CarEntity;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class CarDto {

    @Size(min = 2, max = 12, message = "é obrigatório e deve ter pelo menos 2 e no máximo 12 letras")
    private String modelo;
    @Size(min = 2, max = 10, message = "é obrigatório e deve ter pelo menos 2 e no máximo 10 letras")
    private String fabricante;
    private LocalDate dataFabricacao;
    @Min(1950)
    @Max(2022)
    private int anoMOdelo;
    @DecimalMin(value = "0.2")
    @DecimalMax(value = "0.7")
    private double potenciaMotor;

    public String getModelo() {
        return modelo;
    }

    public void convertDto(CarEntity car){
        setModelo(car.getModelo());
        setFabricante(car.getFabricante());
        setDataFabricacao(car.getDataFabricacao());
        setAnoMOdelo(car.getAnoMOdelo());
        setPotenciaMotor(car.getPotenciaMotor());

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getAnoMOdelo() {
        return anoMOdelo;
    }

    public void setAnoMOdelo(int anoMOdelo) {
        this.anoMOdelo = anoMOdelo;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
}
