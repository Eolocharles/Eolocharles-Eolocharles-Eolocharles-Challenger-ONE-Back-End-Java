package dialogs_boxes;

import utils.Converter;

import javax.swing.*;
import java.io.IOException;
import java.text.DecimalFormat;

public class UnitsOptions {
    public UnitsOptions options() throws IOException, InterruptedException {
        Object[] options = {"kilometros", "metros",  "milímetros", "milhas", "jardas", "pés","polegadas"};

        Object from = JOptionPane.showInputDialog(null, "Converter de ", "Unidades", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        Object to = JOptionPane.showInputDialog(null, "Para ", "Unidades", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (from != null) {
            if (to != null) {
                try {

                    String value = JOptionPane.showInputDialog(null, "Insira um valor", "Input", JOptionPane.PLAIN_MESSAGE);
                    double result = new Converter().unitConverter(from.toString(), to.toString(), Double.parseDouble(value));
                    DecimalFormat df = new DecimalFormat("0.00");
                    JOptionPane.showMessageDialog(null, "O valor da conversão é de " + df.format(result));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Insira um valor válido");
                }
            }
        }
        return null;
    }

}