package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

public class CadastroFuncionariosApp {

    public static void main(String[] args) {
        // Configuração básica da janela
        JFrame frame = new JFrame("Cadastro de Funcionários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 800);
        frame.setLocationRelativeTo(null);

        // Criar o painel superior
        JPanel painelSuperior = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margens proporcionais

        // Definindo a fonte padrão para os componentes
        Font fontLabel = new Font("Segoe UI", Font.PLAIN, 12); // Fonte padrão do sistema
        Font fontField = new Font("Segoe UI", Font.PLAIN, 12); // Fonte padrão do sistema
        Font fontTitle = new Font("Segoe UI", Font.BOLD, 14);  // Fonte padrão do sistema, negrito

        // Cores padrão
        Color lightGray = new Color(240, 240, 240); // Cinza claro para os botões
        Color background = Color.WHITE; // Branco para o fundo
        Color text = Color.BLACK; // Preto para o texto

        // Configurar a aparência dos botões
        UIManager.put("Button.background", lightGray);
        UIManager.put("Button.foreground", Color.BLACK);
        UIManager.put("Button.border", new RoundedBorder(5)); // Borda levemente arredondada

        painelSuperior.setBackground(background);

        // Status e Botões
        gbc.gridx = 0; 
        gbc.gridy = 0;
        gbc.gridwidth = 1; 
        gbc.anchor = GridBagConstraints.WEST;
        JLabel lblStatus = new JLabel("Status:");
        lblStatus.setFont(fontLabel);
        lblStatus.setForeground(text);
        painelSuperior.add(lblStatus, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        JLabel lblStatusValue = new JLabel("Aberto");
        lblStatusValue.setForeground(text);
        lblStatusValue.setFont(fontLabel);
        painelSuperior.add(lblStatusValue, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        JButton btnSalvar = new JButton("Salvar");
        customizeButton(btnSalvar);
        painelSuperior.add(btnSalvar, gbc);

        gbc.gridx = 3;
        JButton btnConcluir = new JButton("Concluir");
        customizeButton(btnConcluir);
        painelSuperior.add(btnConcluir, gbc);

        gbc.gridx = 4;
        JButton btnExcluir = new JButton("Excluir");
        customizeButton(btnExcluir);
        painelSuperior.add(btnExcluir, gbc);

        gbc.gridx = 5;
        JButton btnOcorrencia = new JButton("Ocorrência");
        customizeButton(btnOcorrencia);
        painelSuperior.add(btnOcorrencia, gbc);

        gbc.gridx = 6;
        JLabel lblSituacao = new JLabel("Situação:");
        lblSituacao.setFont(fontLabel);
        lblSituacao.setForeground(text);
        painelSuperior.add(lblSituacao, gbc);

        gbc.gridx = 7;
        JLabel lblSituacaoValue = new JLabel("Ativo");
        lblSituacaoValue.setForeground(text);
        lblSituacaoValue.setFont(fontLabel);
        painelSuperior.add(lblSituacaoValue, gbc);

        gbc.gridx = 8;
        JButton btnFechar = new JButton("Fechar");
        customizeButton(btnFechar);
        painelSuperior.add(btnFechar, gbc);

        // CPF e Nome
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setFont(fontLabel);
        lblCPF.setForeground(text);
        painelSuperior.add(lblCPF, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField txtCPF = new JTextField(15);
        txtCPF.setFont(fontField);
        painelSuperior.add(txtCPF, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setFont(fontLabel);
        lblNome.setForeground(text);
        painelSuperior.add(lblNome, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField txtNome = new JTextField(25);
        txtNome.setFont(fontField);
        painelSuperior.add(txtNome, gbc);

        // Criação do JTabbedPane para as abas
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(background); // Fundo branco para as abas

        // Adiciona as abas utilizando as classes separadas
        tabbedPane.addTab("Principal", new AbaPrincipal());
        tabbedPane.addTab("Documentação", new AbaDocumentacao());
        tabbedPane.addTab("Contrato", new AbaContrato());
        tabbedPane.addTab("Operacional", new AbaOperacional());
        tabbedPane.addTab("Agradecimentos", new AbaAgradecimentos());
        tabbedPane.addTab("Extra", new AbaVaicorintha());

        // Colocar o JTabbedPane dentro de um JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabbedPane);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Adicionar os painéis ao frame
        frame.setLayout(new BorderLayout());
        frame.add(painelSuperior, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Exibe a tela
        frame.setVisible(true);
    }

    // Método para customizar os botões
    private static void customizeButton(JButton button) {
        button.setUI(new BasicButtonUI());
        button.setBackground(new Color(240, 240, 240)); // Cinza claro
        button.setBorder(new RoundedBorder(5)); // Borda levemente arredondada
        button.setFocusPainted(false); // Remover foco pintado
        button.setFont(new Font("Segoe UI", Font.PLAIN, 12)); // Fonte padrão
    }

    // Classe interna para criar uma borda levemente arredondada
    static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(5, 5, 5, 5);
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(Color.GRAY);
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius); // Bordas levemente arredondadas
        }
    }
}