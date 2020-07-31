import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;


public class Calculadora extends WindowAdapter {
	    Frame frm1 = new Frame("Calculadora");
	    Panel pnl1 = new Panel(new GridLayout(4,4));
	    private MenuItem mi1 = new MenuItem("Sair");
	    private Button btnLimpar = new Button("Clr");
	    private Button btnSomar = new Button("+");
	    private Button btnDiminuir = new Button("-");
	    private Button btnDividir = new Button("/");
	    private Button btnMultiplicar = new Button("*");
	    private Button btnResultado = new Button("=");
	    private TextField txtF1 = new TextField("");
	    
	    private float valor1 = 0;
	    private int operacao = 0;
	    
	    public void setValor1()
	    {
	        this.valor1 = Float.parseFloat(txtF1.getText());
	    }
	    public float getValor1()
	    {
	        return valor1;
	    }
	    public Calculadora()
	    {
	        mi1.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                System.exit(0);
	            }
	        });
	        btnLimpar.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                valor1 = 0;
	                txtF1.setText("");
	            }
	        });
	        btnSomar.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                setValor1();
	                operacao = 1;
	            }
	        });
	        btnDiminuir.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                setValor1();
	                operacao = 2;
	            }
	        });
	        btnDividir.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                setValor1();
	                operacao = 3;
	            }
	        });
	        btnMultiplicar.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                setValor1();
	                operacao = 4;
	            }
	        });
	        btnResultado.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent a)
	            {
	                switch (operacao)
	                {
	                    
	                    case 1 :
	                    {
	                        operacao = 0;
	                        txtF1.setText(Float.toString(getValor1() + Float.parseFloat(txtF1.getText())));
	                        break;
	                    }
	                    
	                    case 2 :
	                    {
	                        operacao = 0;
	                        txtF1.setText(Float.toString(getValor1()- Float.parseFloat(txtF1.getText())));
	                        break;
	                    }
	                    
	                    case 3 :
	                    {
	                        try
	                        {
	                          operacao = 0;
	                          txtF1.setText(Float.toString(getValor1() / Float.parseFloat(txtF1.getText())));
	                        }
	                        catch(ArithmeticException ex)
	                            {
	                                txtF1.setText("");
	                                System.out.println("É impossível divisão por zero ! erro : ” + ex.getMessage()");
	                            }
	                        break;
	                    }
	                    
	                    case 4 :
	                    {
	                        operacao = 0;
	                        txtF1.setText(Float.toString(getValor1() * Float.parseFloat(txtF1.getText())));
	                        break;
	                    }
	                    default :
	                        System.out.println("Escolha uma operação");
	                        break;
	                }
	            }
	        });

}
    }
