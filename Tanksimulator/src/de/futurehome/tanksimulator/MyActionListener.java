package de.futurehome.tanksimulator;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	DateTimeFormatter zeitFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		LocalDateTime zeitObj = LocalDateTime.now();
		String zeit = zeitObj.format(zeitFormat);
		if (obj == f.btnBeenden)
			System.exit(0);
		
		double fuellstand = f.myTank.getFuellstand();
		
		if (obj == f.btnEinfuellen) {
			 fuellstand = fuellstand + 5;
			 f.getHistoriePanel().add(new Label(zeit +": Der Wasserstand wurde um 5 auf "+fuellstand+" erhoeht"));
		}
		
		if (obj == f.btnVerbrauchen) {
			 fuellstand = fuellstand - f.getVerbrauchSliderValue();
			 f.getHistoriePanel().add(new Label(zeit +": Der Wasserstand wurde um "+ f.getVerbrauchSliderValue() +" auf "+fuellstand+" gesenkt"));
		}
		
		if (obj == f.btnZuruecksetzen) {
			 fuellstand = 0;
			 f.getHistoriePanel().add(new Label(zeit +": Der Wasserstand wurde zurueckgesetzt"));
		}

		 f.myTank.setFuellstand(fuellstand);
		 f.getFuellstandBar().setValue((int)fuellstand);
		 f.lblFuellstand.setText(fuellstand+ "("+fuellstand/2+"%)");
	}
}