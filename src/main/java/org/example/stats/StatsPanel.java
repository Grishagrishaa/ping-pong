package org.example.stats;

import javax.swing.*;
import java.awt.*;

public class StatsPanel extends JPanel {
    private static final int LAYOUT_ROWS = 5;
    private static final int LAYOUT_COLS = 2;
    private static final int HORIZONTAL_GAP = 0;
    private static final int VERTICAL_GAP = 20;

    public StatsPanel(String label) {
        initComponents(label);

    }

    private void initComponents(String label) {
        setPanelUp();
        add(new JLabel(label), BorderLayout.CENTER);
    }

    private void setPanelUp() {
        setLayout(new GridLayout(LAYOUT_ROWS, LAYOUT_COLS, HORIZONTAL_GAP, VERTICAL_GAP));
    }

    public void clearForm() {

    }
}
