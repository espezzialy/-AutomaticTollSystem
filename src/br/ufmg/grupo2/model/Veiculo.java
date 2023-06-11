package br.ufmg.grupo2.model;

import br.ufmg.grupo2.model.types.TipoVeiculo;

public class Veiculo {

    private String placa;
    private TipoVeiculo tipoVeiculo;
    private boolean isOnCall;

    public Vehicle(String placa, TipoVeiculo tipoVeiculo, boolean isOnCall) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.isOnCall = isOnCall;
    }

    public String getLocalization() {
        return localization;
    }

    public TipoVeiculo getCarType() {
        return tipoVeiculo;
    }


    public String getPlaca() {
        return placa;
    }

    public boolean isOnCall() {
        return isOnCall;
    }

    public void setOnCall(boolean onCall) {
        isOnCall = onCall;
    }
}
