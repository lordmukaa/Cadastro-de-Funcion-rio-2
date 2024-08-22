package br.com.cadastrofuncionarios;

import javax.swing.*;
import java.awt.*;

public class AbaVaicorintha extends JPanel {

    public AbaVaicorintha() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(50, 2, 2, 50);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;

        // Definindo a fonte para o texto "VAI CORINTHA"
        Font fontCorinthians = new Font("Georgia", Font.BOLD, 48); // Fonte grande e negrito

        // Criar um painel para conter as letras
        JPanel panelLetters = new JPanel();
        panelLetters.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); // Layout para letras juntas
        panelLetters.setOpaque(false); // Fundo transparente

        // Array com as cores desejadas
        Color[] colors = {
            Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, 
            Color.CYAN, Color.PINK, Color.LIGHT_GRAY, Color.DARK_GRAY, Color.BLACK, Color.GRAY
        };

        // Texto "VAI CORINTHANS"
        String text = "VAI CORINTHANS";

        // Adicionar cada letra como um JLabel com uma cor diferente
        for (int i = 0; i < text.length(); i++) {
            JLabel letterLabel = new JLabel(String.valueOf(text.charAt(i)));
            letterLabel.setFont(fontCorinthians);
            letterLabel.setForeground(colors[i % colors.length]); // Usar cores de forma cíclica
            panelLetters.add(letterLabel);
        }

        // Adicionar o painel com as letras ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(panelLetters, gbc);
    }
}
