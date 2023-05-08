import javax.swing.JOptionPane;

public class SomaComInterface {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Digite um valor inteiro");
		int n1 = Integer.parseInt(num);

		String num2 = JOptionPane.showInputDialog("Digite um valor inteiro");
		int n2 = Integer.parseInt(num2);

		int r = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "O resultado da soma é: " + r);
		
		
	}

	
}
