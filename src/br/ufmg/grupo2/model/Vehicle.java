package br.ufmg.grupo2.model;

import br.ufmg.grupo2.model.types.TipoVeiculo;

public class Vehicle {

    private String id;
    private String localization;
    private TipoVeiculo tipoVeiculo;
    private boolean isOnCall;

    public Vehicle(String id, String localization, TipoVeiculo tipoVeiculo, boolean isOnCall) {
        this.id = id;
        this.localization = localization;
        this.tipoVeiculo = tipoVeiculo;
        this.isOnCall = isOnCall;
    }

    public String getLocalization() {
        return localization;
    }

    public TipoVeiculo getCarType() {
        return tipoVeiculo;
    }


    public String getId() {
        return id;
    }

    public boolean isOnCall() {
        return isOnCall;
    }

    public void setOnCall(boolean onCall) {
        isOnCall = onCall;
    }
}
