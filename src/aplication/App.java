package aplication;

import dialogs_boxes.CurrencyOptions;
import dialogs_boxes.TemperatureOptions;
import dialogs_boxes.UnitsOptions;

import javax.swing.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        Object[] options = {"Moeda", "Unidades", "Temperatura"};
        Object selectedOption = JOptionPane.showInputDialog(null, "Escolha um conversor:", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if(selectedOption != null) {
            if(selectedOption == "Moeda"){
                CurrencyOptions currencyOptions = new CurrencyOptions().options();
            } else if (selectedOption == "Unidades") {
                UnitsOptions unitsOptions = new UnitsOptions().options();
            } else if (selectedOption == "Temperatura") {
                TemperatureOptions temperatureOptions = new TemperatureOptions().options();
            }
        }
        int selected =  JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        if(selected == JOptionPane.YES_OPTION){
            main(args);
        } else if (selected == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
        }else if (selected == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa concluído");
        }



    }
}

