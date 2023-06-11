package br.ufmg.grupo2.network;

import br.ufmg.grupo2.model.Vehicle;
import br.ufmg.grupo2.model.types.TipoVeiculo;

import java.util.List;
import java.util.Map;

public interface InterfaceCorePanel {
    public List<Vehicle> retornaVeiculos(Map<TipoVeiculo, Integer> preferences, List<Vehicle> availableList);

    public List<Vehicle> retornaVeiculosOrdenadosPorDistancia(List<Vehicle> vehicles);

    public String retornaTempo(String startPoint, String endPoint);
    public String retornaDistancia(String startPoint, String endPoint);
}
