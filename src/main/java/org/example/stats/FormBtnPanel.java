package org.example.stats;



import org.example.game.GameFrame;

import javax.swing.*;

public class FormBtnPanel extends JPanel {

    private JButton newGameBtn;
    private JButton exitBtn;

    {
        initComponents();
    }

    private void initComponents() {
        newGameBtn = new JButton("New Game");
        newGameBtn.addActionListener(e -> new GameFrame());
        add(newGameBtn);

        exitBtn = new JButton("Exit");
        exitBtn.addActionListener(e -> System.exit(0));
        add(exitBtn);
    }

    public JButton getNewGameBtn() {
        return newGameBtn;
    }

    public void setNewGameBtn(JButton newGameBtn) {
        this.newGameBtn = newGameBtn;
    }

    public JButton getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JButton exitBtn) {
        this.exitBtn = exitBtn;
    }
}
