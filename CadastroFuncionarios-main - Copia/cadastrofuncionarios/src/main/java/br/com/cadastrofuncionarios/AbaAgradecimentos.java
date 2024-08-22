package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaAgradecimentos extends JPanel {

    public AbaAgradecimentos() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 20, 10, 20); // Margens exageradas para criar desarmonia
        gbc.fill = GridBagConstraints.BOTH;

        // Definindo a fonte padrão para os componentes
        Font fontLabel = new Font("Comic Sans MS", Font.BOLD, 12); // Fonte Comic Sans
        Font fontField = new Font("Courier New", Font.PLAIN, 10);  // Fonte Courier New
        Font fontTitle = new Font("Impact", Font.ITALIC, 18);      // Fonte Impact
        Font fontTextArea = new Font("Arial", Font.BOLD, 12);      // Fonte Arial negrito

        // Cores contrastantes e desagradáveis
        Color panelBackground = new Color(255, 165, 0); // Laranja forte para o fundo
        Color borderColor = new Color(128, 0, 128); // Roxo para as bordas
        Color textColor = Color.BLACK; // Preto para o texto

        // Criando e configurando o painel de Agradecimentos
        JPanel painelAgradecimentos = new JPanel(new GridBagLayout());
        painelAgradecimentos.setBackground(panelBackground);
        TitledBorder borderAgradecimentos = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(borderColor, 2), "Agradecimentos", TitledBorder.RIGHT, TitledBorder.BOTTOM
        );
        borderAgradecimentos.setTitleFont(fontTitle);
        borderAgradecimentos.setTitleColor(textColor);
        painelAgradecimentos.setBorder(borderAgradecimentos);

        // Título
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        JLabel lblTitulo = new JLabel("Agradecimentos");
        lblTitulo.setFont(fontTitle);
        lblTitulo.setForeground(textColor);
        painelAgradecimentos.add(lblTitulo, gbc);

        // Texto de agradecimentos
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        JTextArea txtAgradecimentos = new JTextArea(8, 40);
        txtAgradecimentos.setText(
            "Primeiramente agradeço a Deus.\n\n " +
            "Gostaríamos de expressar nossa imensa gratidão à nossa amiga designer pela " +
            "realização deste projeto. Agradecemos ao nosso professor Élcio pelo suporte e orientação, " +
            "aos colegas de equipe pela colaboração e esforço, e às nossas famílias pelo " +
            "apoio contínuo durante todo o processo de desenvolvimento.\n\n" +
            "Este projeto é fruto de um esforço coletivo, e somos gratos a todos que " +
            "contribuíram para o seu sucesso."
        );
        txtAgradecimentos.setWrapStyleWord(true);
        txtAgradecimentos.setLineWrap(true);
        txtAgradecimentos.setFont(fontTextArea);
        txtAgradecimentos.setForeground(textColor);
        txtAgradecimentos.setBackground(Color.YELLOW); // Fundo amarelo para o texto
        txtAgradecimentos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAgradecimentos);
        painelAgradecimentos.add(scrollPane, gbc);

        // Criando e configurando o painel de Reconhecimentos Especiais
        JPanel painelReconhecimentos = new JPanel(new GridBagLayout());
        painelReconhecimentos.setBackground(panelBackground);
        TitledBorder borderReconhecimentos = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(borderColor, 2), "Reconhecimentos Especiais", TitledBorder.RIGHT, TitledBorder.BOTTOM
        );
        borderReconhecimentos.setTitleFont(fontTitle);
        borderReconhecimentos.setTitleColor(textColor);
        painelReconhecimentos.setBorder(borderReconhecimentos);

        // Reconhecimentos
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        JTextArea txtReconhecimentos = new JTextArea(6, 40);
        txtReconhecimentos.setText(
            "Gostaríamos de fazer um agradecimento especial aos seguintes indivíduos:\n" +
            "- Prof. Élcio, pela orientação durante o desenvolvimento deste trabalho.\n" +
            "- Designer e Teles, pelo apoio técnico e revisões cruciais.\n" +
            "- Equipe de TI, Eu e o Chat GPT.\n\n" +
            "Seu suporte foi inestimável e essencial para a conclusão deste projeto."
        );
        txtReconhecimentos.setWrapStyleWord(true);
        txtReconhecimentos.setLineWrap(true);
        txtReconhecimentos.setFont(fontTextArea);
        txtReconhecimentos.setForeground(textColor);
        txtReconhecimentos.setBackground(Color.YELLOW); // Fundo amarelo para o texto
        txtReconhecimentos.setEditable(false);
        JScrollPane scrollPaneReconhecimentos = new JScrollPane(txtReconhecimentos);
        painelReconhecimentos.add(scrollPaneReconhecimentos, gbc);

        // Adicionar os painéis ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelAgradecimentos, gbc);

        gbc.gridy = 1;
        add(painelReconhecimentos, gbc);

        // Componente invisível para ocupar espaço abaixo e "empurrar" os painéis para o topo
        gbc.gridy = 2;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(Box.createVerticalGlue(), gbc);
    }
}