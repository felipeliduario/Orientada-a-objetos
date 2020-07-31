import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		 Pessoa a= new Pessoa();
		 a.setNome(JOptionPane.showInputDialog("Nome:"));
         a.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
         a.setSexo(JOptionPane.showInputDialog("Sexo:"));
         a.setEcivil(JOptionPane.showInputDialog("Estado Civil:"));
         System.out.println( a.toString());
	}

}
