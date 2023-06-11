package br.ufmg.grupo2.network;

public interface ExternalCall {

    public String callFirefighters(boolean isNeeded);

    public String callParamedical(boolean isNeeded);
}
