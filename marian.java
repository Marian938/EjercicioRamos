import javax.swing.JOptionPane;

public class marian {
    public static void main(String[] args) {

        int pesos = Integer.parseInt( JOptionPane.showInputDialog("Ponga el dinero q tiene"));

        int ramo70 = (int)pesos / 70;
        double resto1 = pesos % 70;

        int ramo120 = (int)pesos / 120;
        double resto2 = pesos % 120;

        JOptionPane.showMessageDialog(null,String.format("Usted puede comprar %s ramos de 70 sobrandote %s pesos.\nY puedes compar %s ramos de 120 quedandote %s pesos", ramo70, resto1, ramo120, resto2));
    }
}
