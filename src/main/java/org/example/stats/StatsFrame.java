package org.example.stats;

import javax.swing.*;
import java.awt.*;

public class StatsFrame extends JFrame{

	FormBtnPanel panelButtons;
	StatsPanel panelStats;

	StatsFrame(String winner){

		panelButtons = new FormBtnPanel();
		panelStats = new StatsPanel(String.format("The winner is - %s", winner));
		this.add(panelButtons, BorderLayout.SOUTH);
		this.add(panelStats, BorderLayout.CENTER);

		this.setTitle("Statistics");
		this.setResizable(false);
		this.setBackground(Color.white);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}