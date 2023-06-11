package br.ufmg.grupo2.data;

import br.ufmg.grupo2.model.Incident;
import br.ufmg.grupo2.model.Vehicle;
import br.ufmg.grupo2.model.types.TipoVeiculo;
import br.ufmg.grupo2.model.types.IncidentType;
import br.ufmg.grupo2.network.LocalCorePanel;
import br.ufmg.grupo2.network.LocalExternalCall;

import java.util.ArrayList;
import java.util.List;


// Essa classe funciona como padrão Singleton
public class MockedData {

    private static MockedData uniqueInstance;
    private List<Incident> incidents = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();


    public LocalCorePanel localCorePanel = new LocalCorePanel();
    public LocalExternalCall localExternalCall = new LocalExternalCall();

    private MockedData() {}

    public static synchronized MockedData getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new MockedData();

        return uniqueInstance;
    }

    public List<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents(Incident incident) {
        this.incidents.add(incident);
    }

    public List<Vehicle> getCars() {
        return vehicles;
    }

    public void fillMockData() {
        this.incidents.add(new Incident("31585100", "Assalto a mão armada", IncidentType.MEDIO, false, false, false));
        this.incidents.add(new Incident("31585110", "Briga no bar", IncidentType.LEVE, true, true, false));
        this.incidents.add(new Incident("31585120", "Batida no transito com fogo", IncidentType.MEDIO, false, true, true));
        this.incidents.add(new Incident("31585130", "Furto em colégio", IncidentType.LEVE, false, false, false));
        this.incidents.add(new Incident("31585140", "Troca de tiros com baleados", IncidentType.GRAVE, true, true, false));
        this.incidents.add(new Incident("31585150", "Guerra entre gangues acontencendo", IncidentType.URGENTE, true, false, true));
        this.incidents.add(new Incident("31585160", "Briga entre amigos", IncidentType.LEVE, false, false, false));
        this.incidents.add(new Incident("31585170", "Tentativa de engano em fundação", IncidentType.LEVE, false, false, false));



        this.vehicles.add(new Vehicle("1", "31585300", TipoVeiculo.CARRO, false));
        this.vehicles.add(new Vehicle("2", "31585310", TipoVeiculo.CARRO, false));
        this.vehicles.add(new Vehicle("3", "31585320", TipoVeiculo.CARRO, false));
        this.vehicles.add(new Vehicle("4", "31585330", TipoVeiculo.MOTO, false));
        this.vehicles.add(new Vehicle("5", "31585340", TipoVeiculo.MOTO, false));
        this.vehicles.add(new Vehicle("6", "31585350", TipoVeiculo.MOTO, false));
        this.vehicles.add(new Vehicle("7", "31585360", TipoVeiculo.CAMBURAO, false));
        this.vehicles.add(new Vehicle("8", "31585370", TipoVeiculo.CAMBURAO, false));
        this.vehicles.add(new Vehicle("11", "31585375", TipoVeiculo.CAMBURAO, false));
        this.vehicles.add(new Vehicle("9", "31585380", TipoVeiculo.CARRO, false));
        this.vehicles.add(new Vehicle("10", "31585390", TipoVeiculo.CARRO, false));
    }


}
