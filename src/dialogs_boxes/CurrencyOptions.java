package dialogs_boxes;

import utils.Converter;

import javax.swing.*;
import java.io.IOException;
import java.text.DecimalFormat;


public class CurrencyOptions {
    public CurrencyOptions options() throws IOException, InterruptedException {
        Object[] options = {"Reais", "Dólares", "Euros", "Libras", "Pesos Argentinos", "Pesos Chilenos"};

        Object from = JOptionPane.showInputDialog(null, "Converter de ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        Object to = JOptionPane.showInputDialog(null, "Para ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (from != null) {
            if (to != null) {
                try {

                    String value = JOptionPane.showInputDialog(null, "Insira um valor", "Input", JOptionPane.PLAIN_MESSAGE);
                    double result = new Converter().currencyConverter(from.toString(), to.toString(), Double.parseDouble(value));
                    DecimalFormat df = new DecimalFormat("0.000");
                    JOptionPane.showMessageDialog(null, "O valor da conversão é de " + df.format(result));

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Insira um valor válido");
                }
            }
        }
        return null;
    }

}


