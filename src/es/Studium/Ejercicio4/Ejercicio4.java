package es.Studium.Ejercicio4;

import java.awt.*;
/**
 * @author alvaro
 *
 */

public class Ejercicio4 extends Frame
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
		setTitle("Vehículos"); //Titulo de la ventana
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
		
		setLocationRelativeTo(null);
		setSize(500,250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio4();//Muestra el Checkbox
	}
}