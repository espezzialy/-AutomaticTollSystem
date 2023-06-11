package br.ufmg.grupo2;

import br.ufmg.grupo2.data.MockedData;
import br.ufmg.grupo2.panel.Panel;

public class ControlApplication {

    public static void main(String[] args) {
        MockedData.getInstance().fillMockData();
        Panel panel = new Panel();
        panel.start();

    }
}
