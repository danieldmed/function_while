import javax.swing.JOptionPane;

public class FuncWhile3 {

    public static void main(String[] args) {
        int contador = 0;
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: (Digite 0 para sair) "));

            if (numero != 0) {
                contador = contador +1;
            }
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "Você inseriu " + contador + " números.");
    
    }
}