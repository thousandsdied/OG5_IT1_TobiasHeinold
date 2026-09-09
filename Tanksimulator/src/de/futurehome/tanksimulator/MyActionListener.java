package de.futurehome.tanksimulator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == f.btnBeenden)
			System.exit(0);
		
		double fuellstand = f.myTank.getFuellstand();
		
		if (obj == f.btnEinfuellen) {
			 fuellstand = fuellstand + 5;

		}
		
		if (obj == f.btnVerbrauchen) {
			 fuellstand = fuellstand - 2;
			
		}
		
		if (obj == f.btnZuruecksetzen) {
			 fuellstand = 0;

		}

		 f.myTank.setFuellstand(fuellstand);
		
		 f.lblFuellstand.setText(""+fuellstand+"("+fuellstand/2+"%)");
		
	}
}