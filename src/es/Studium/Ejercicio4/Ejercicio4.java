package es.Studium.Ejercicio4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 * @author alvaro
 *
 */

public class Ejercicio4 extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	
	//Creamos el panel
		Panel pnlPanel1 = new Panel();
		Panel pnlPanel2 = new Panel();
		Panel pnlPanel3 = new Panel();
		
		//Creamos el grupo	
	CheckboxGroup chkgrMotor = new CheckboxGroup();
	//En este caso, se pueden elegir todas las opciones que queramos
	//Las opciones se mostraran en el orden introducido
	Label lblMotor = new Label("¿Tipo de motorización?");
	Checkbox chkMotor1 = new Checkbox("Gasolina", false, chkgrMotor);
	Checkbox chkMotor2 = new Checkbox("Diésel", false, chkgrMotor);
	Checkbox chkMotor3 = new Checkbox("Híbrido", false, chkgrMotor);
	Checkbox chkMotor4 = new Checkbox("Eléctrico", false, chkgrMotor);
	//Creamos el grupo	
		CheckboxGroup chkgrPuerta = new CheckboxGroup();
	Label lblPuerta = new Label("¿Número de puertas?");
	Checkbox chkPuerta3 = new Checkbox("3 Puertas", false, chkgrPuerta);
	Checkbox chkPuerta4 = new Checkbox("4 Puertas", false, chkgrPuerta);
	Checkbox chkPuerta5 = new Checkbox("5 Puertas", false, chkgrPuerta);
	//Creamos el grupo	
		CheckboxGroup chkgrPintura = new CheckboxGroup();
	Label lblPintura = new Label("¿Pintura Metalizada?");
	Checkbox chkPinturaS = new Checkbox("Si", false, chkgrPintura);
	Checkbox chkPinturaN = new Checkbox("No", false, chkgrPintura);
	Button btnBoton1 = new Button("Calcular presupuesto");
	
	public Ejercicio4()
	{
		setLayout( new GridLayout( 4,2 ) );
		setTitle("VehÃ­culos"); //Titulo de la ventana
		pnlPanel1.add(lblMotor);
		pnlPanel1.add(chkMotor1);
		pnlPanel1.add(chkMotor2);
		pnlPanel1.add(chkMotor3);
		pnlPanel1.add(chkMotor4);
		pnlPanel2.add(lblPuerta); 
		pnlPanel2.add(chkPuerta3); 
		pnlPanel2.add(chkPuerta4); 
		pnlPanel2.add(chkPuerta5); 
		pnlPanel3.add(lblPintura); 
		pnlPanel3.add(chkPinturaS);
		pnlPanel3.add(chkPinturaN);
		pnlPanel3.add(btnBoton1);
		add(pnlPanel1);
		add(pnlPanel2);
		add(pnlPanel3);
		this.addWindowListener(this);
		btnBoton1.addActionListener(this);
		setLocationRelativeTo(null);
		setSize(500,250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio4();//Muestra el Checkbox
	}
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		int presupuesto=0;
		if (chkMotor1.getState()== true) {
			presupuesto=presupuesto+7000;
		}
		if (chkMotor2.getState()== true) {
			presupuesto=presupuesto+8000;
		}
		if (chkMotor3.getState()== true) {
			presupuesto=presupuesto+9000;
		}
		if (chkMotor4.getState()== true) {
			presupuesto=presupuesto+8500;
		}
		if (chkPuerta3.getState()== true) {
			presupuesto=presupuesto+2000;
		}
		if (chkPuerta4.getState()== true) {
			presupuesto=presupuesto+3000;
		}
		if (chkPuerta5.getState()== true) {
			presupuesto=presupuesto+2500;
		}
		if (chkPinturaS.getState()== true) {
			presupuesto=presupuesto+1500;
		}
		if (chkPinturaN.getState()== true) {
			presupuesto=presupuesto+1500;
		}
		System.out.println(presupuesto);
	}
	@Override
	public void windowOpened(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent we) {
		
			System.exit(0); 
	}
	@Override
	public void windowClosed(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
}