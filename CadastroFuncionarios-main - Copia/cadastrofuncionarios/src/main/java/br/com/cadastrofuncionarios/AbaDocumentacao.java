package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaDocumentacao extends JPanel {

    public AbaDocumentacao() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Ajuste das margens
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Fonte geral dos componentes
        Font fontLabel = new Font("Georgia", Font.PLAIN, 14);
        Font fontField = new Font("Georgia", Font.PLAIN, 14);
        Font fontTitle = new Font("Georgia", Font.BOLD, 16);

        // Painel do RG
        JPanel painelRG = new JPanel(new GridBagLayout());
        TitledBorder borderRG = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "RG", TitledBorder.LEFT, TitledBorder.TOP);
        borderRG.setTitleFont(fontTitle);
        painelRG.setBorder(borderRG);
        GridBagConstraints gbcRG = new GridBagConstraints();
        gbcRG.insets = new Insets(5, 5, 5, 5);
        gbcRG.fill = GridBagConstraints.HORIZONTAL;

        // RG, Orgão Expedidor, UF, e Data Expedição
        gbcRG.gridx = 0;
        gbcRG.gridy = 0;
        painelRG.add(new JLabel("Número:"), gbcRG);

        gbcRG.gridx = 1;
        gbcRG.gridwidth = GridBagConstraints.REMAINDER;
        gbcRG.weightx = 1.0;
        JTextField txtNumeroRG = new JTextField(12);
        painelRG.add(txtNumeroRG, gbcRG);

        gbcRG.gridx = 0;
        gbcRG.gridy = 1;
        gbcRG.gridwidth = 1;
        painelRG.add(new JLabel("Orgão Expedidor:"), gbcRG);

        gbcRG.gridx = 1;
        gbcRG.gridwidth = 1;
        gbcRG.weightx = 1.0;
        JComboBox<String> cmbOrgaoExpedidor = new JComboBox<>(new String[]{"SSP", "DGPC", "DETRAN", "IFP", "PM", "PC", "Outros"});
        painelRG.add(cmbOrgaoExpedidor, gbcRG);

        gbcRG.gridx = 2;
        gbcRG.weightx = 0;
        painelRG.add(new JLabel("UF:"), gbcRG);

        gbcRG.gridx = 3;
        gbcRG.gridwidth = 1;
        gbcRG.weightx = 1.0;
        JComboBox<String> cmbUF = new JComboBox<>(new String[]{"GO", "SP", "RJ", "MG", "RS", "SC", "PR", "DF", "BA", "CE", "PE", "RN", "PB", "SE", "AL", "MA", "PI", "TO", "PA", "AP", "RR", "AM", "AC", "RO", "MT", "MS", "ES", "RN", "Outros"});
        painelRG.add(cmbUF, gbcRG);

        gbcRG.gridx = 4;
        gbcRG.weightx = 0;
        painelRG.add(new JLabel("Data Expedição:"), gbcRG);

        gbcRG.gridx = 5;
        gbcRG.gridwidth = GridBagConstraints.REMAINDER;
        gbcRG.weightx = 1.0;
        JTextField txtDataExpedicao = new JTextField(10);
        painelRG.add(txtDataExpedicao, gbcRG);

        // Painel de Informação Militar
        JPanel painelMilitar = new JPanel(new GridBagLayout());
        TitledBorder borderMilitar = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Informação Militar", TitledBorder.LEFT, TitledBorder.TOP);
        borderMilitar.setTitleFont(fontTitle);
        painelMilitar.setBorder(borderMilitar);
        GridBagConstraints gbcMilitar = new GridBagConstraints();
        gbcMilitar.insets = new Insets(5, 5, 5, 5);
        gbcMilitar.fill = GridBagConstraints.HORIZONTAL;

        // Situação Militar e Data Baixa
        gbcMilitar.gridx = 0;
        gbcMilitar.gridy = 0;
        painelMilitar.add(new JLabel("Situação:"), gbcMilitar);

        gbcMilitar.gridx = 1;
        gbcMilitar.gridwidth = GridBagConstraints.REMAINDER;
        gbcMilitar.weightx = 1.0;
        JTextField txtSituacao = new JTextField(12);
        painelMilitar.add(txtSituacao, gbcMilitar);

        gbcMilitar.gridx = 0;
        gbcMilitar.gridy = 1;
        painelMilitar.add(new JLabel("Data Baixa:"), gbcMilitar);

        gbcMilitar.gridx = 1;
        gbcMilitar.gridwidth = GridBagConstraints.REMAINDER;
        gbcMilitar.weightx = 1.0;
        JTextField txtDataBaixa = new JTextField(10);
        painelMilitar.add(txtDataBaixa, gbcMilitar);

        // Painel do CNH
        JPanel painelCNH = new JPanel(new GridBagLayout());
        TitledBorder borderCNH = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "CNH", TitledBorder.LEFT, TitledBorder.TOP);
        borderCNH.setTitleFont(fontTitle);
        painelCNH.setBorder(borderCNH);
        GridBagConstraints gbcCNH = new GridBagConstraints();
        gbcCNH.insets = new Insets(5, 5, 5, 5);
        gbcCNH.fill = GridBagConstraints.HORIZONTAL;

        // Número CNH, Categoria, Data Cadastro e Data Vencimento
        gbcCNH.gridx = 0;
        gbcCNH.gridy = 0;
        painelCNH.add(new JLabel("Número:"), gbcCNH);

        gbcCNH.gridx = 1;
        gbcCNH.gridwidth = GridBagConstraints.REMAINDER;
        gbcCNH.weightx = 1.0;
        JTextField txtNumeroCNH = new JTextField(12);
        painelCNH.add(txtNumeroCNH, gbcCNH);

        gbcCNH.gridx = 0;
        gbcCNH.gridy = 1;
        painelCNH.add(new JLabel("Categoria:"), gbcCNH);

        gbcCNH.gridx = 1;
        gbcCNH.gridwidth = 1;
        gbcCNH.weightx = 1.0;
        JTextField txtCategoria = new JTextField(5);
        painelCNH.add(txtCategoria, gbcCNH);

        gbcCNH.gridx = 2;
        painelCNH.add(new JLabel("Data Cadastro:"), gbcCNH);

        gbcCNH.gridx = 3;
        gbcCNH.gridwidth = GridBagConstraints.REMAINDER;
        gbcCNH.weightx = 1.0;
        JTextField txtDataCadastro = new JTextField(10);
        painelCNH.add(txtDataCadastro, gbcCNH);

        gbcCNH.gridx = 2;
        gbcCNH.gridy = 2;
        painelCNH.add(new JLabel("Data Vencimento:"), gbcCNH);

        gbcCNH.gridx = 3;
        gbcCNH.gridwidth = GridBagConstraints.REMAINDER;
        gbcCNH.weightx = 1.0;
        JTextField txtDataVencimento = new JTextField(10);
        painelCNH.add(txtDataVencimento, gbcCNH);

        // Painel de CTPS
        JPanel painelCTPS = new JPanel(new GridBagLayout());
        TitledBorder borderCTPS = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "CTPS", TitledBorder.LEFT, TitledBorder.TOP);
        borderCTPS.setTitleFont(fontTitle);
        painelCTPS.setBorder(borderCTPS);
        GridBagConstraints gbcCTPS = new GridBagConstraints();
        gbcCTPS.insets = new Insets(5, 5, 5, 5);
        gbcCTPS.fill = GridBagConstraints.HORIZONTAL;

        // Número, Série, Órgão, UF
        gbcCTPS.gridx = 0;
        gbcCTPS.gridy = 0;
        painelCTPS.add(new JLabel("Número:"), gbcCTPS);

        gbcCTPS.gridx = 1;
        gbcCTPS.gridwidth = 1;
        gbcCTPS.weightx = 1.0;
        JTextField txtNumeroCTPS = new JTextField(12);
        painelCTPS.add(txtNumeroCTPS, gbcCTPS);

        gbcCTPS.gridx = 2;
        gbcCTPS.weightx = 0;
        painelCTPS.add(new JLabel("Série:"), gbcCTPS);

        gbcCTPS.gridx = 3;
        gbcCTPS.gridwidth = 1;
        gbcCTPS.weightx = 1.0;
        JTextField txtSerieCTPS = new JTextField(5);
        painelCTPS.add(txtSerieCTPS, gbcCTPS);

        gbcCTPS.gridx = 0;
        gbcCTPS.gridy = 1;
        painelCTPS.add(new JLabel("Órgão:"), gbcCTPS);

        gbcCTPS.gridx = 1;
        gbcCTPS.gridwidth = 1;
        gbcCTPS.weightx = 1.0;
        JTextField txtOrgaoCTPS = new JTextField(10);
        painelCTPS.add(txtOrgaoCTPS, gbcCTPS);

        gbcCTPS.gridx = 2;
        gbcCTPS.weightx = 0;
        painelCTPS.add(new JLabel("UF:"), gbcCTPS);

        gbcCTPS.gridx = 3;
        gbcCTPS.gridwidth = GridBagConstraints.REMAINDER;
        gbcCTPS.weightx = 1.0;
        JComboBox<String> cmbUFCTPS = new JComboBox<>(new String[]{"GO", "SP", "RJ", "MG", "Outros"});
        painelCTPS.add(cmbUFCTPS, gbcCTPS);

        // Painel de PIS
        JPanel painelPIS = new JPanel(new GridBagLayout());
        TitledBorder borderPIS = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "PIS", TitledBorder.LEFT, TitledBorder.TOP);
        borderPIS.setTitleFont(fontTitle);
        painelPIS.setBorder(borderPIS);
        GridBagConstraints gbcPIS = new GridBagConstraints();
        gbcPIS.insets = new Insets(5, 5, 5, 5);
        gbcPIS.fill = GridBagConstraints.HORIZONTAL;

        // Número, Data Cadastro
        gbcPIS.gridx = 0;
        gbcPIS.gridy = 0;
        painelPIS.add(new JLabel("Número:"), gbcPIS);

        gbcPIS.gridx = 1;
        gbcPIS.gridwidth = GridBagConstraints.REMAINDER;
        gbcPIS.weightx = 1.0;
        JTextField txtNumeroPIS = new JTextField(12);
        painelPIS.add(txtNumeroPIS, gbcPIS);

        gbcPIS.gridx = 0;
        gbcPIS.gridy = 1;
        painelPIS.add(new JLabel("Data Cadastro:"), gbcPIS);

        gbcPIS.gridx = 1;
        gbcPIS.gridwidth = GridBagConstraints.REMAINDER;
        gbcPIS.weightx = 1.0;
        JTextField txtDataCadastroPIS = new JTextField(10);
        painelPIS.add(txtDataCadastroPIS, gbcPIS);

        // Painel de Conselho Regional
        JPanel painelConselhoRegional = new JPanel(new GridBagLayout());
        TitledBorder borderConselhoRegional = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Conselho Regional", TitledBorder.LEFT, TitledBorder.TOP);
        borderConselhoRegional.setTitleFont(fontTitle);
        painelConselhoRegional.setBorder(borderConselhoRegional);
        GridBagConstraints gbcConselhoRegional = new GridBagConstraints();
        gbcConselhoRegional.insets = new Insets(5, 5, 5, 5);
        gbcConselhoRegional.fill = GridBagConstraints.HORIZONTAL;

        // Nome, Sigla, Registro Regional, Número, Data Expedição, Órgão Emissor, Data Validade
        gbcConselhoRegional.gridx = 0;
        gbcConselhoRegional.gridy = 0;
        painelConselhoRegional.add(new JLabel("Nome:"), gbcConselhoRegional);

        gbcConselhoRegional.gridx = 1;
        gbcConselhoRegional.gridwidth = 1;
        gbcConselhoRegional.weightx = 1.0;
        JTextField txtNomeConselho = new JTextField(12);
        painelConselhoRegional.add(txtNomeConselho, gbcConselhoRegional);

        gbcConselhoRegional.gridx = 2;
        gbcConselhoRegional.weightx = 0;
        painelConselhoRegional.add(new JLabel("Sigla:"), gbcConselhoRegional);

        gbcConselhoRegional.gridx = 3;
        gbcConselhoRegional.gridwidth = 1;
        gbcConselhoRegional.weightx = 1.0;
        JTextField txtSiglaConselho = new JTextField(5);
        painelConselhoRegional.add(txtSiglaConselho, gbcConselhoRegional);

        gbcConselhoRegional.gridx = 0;
        gbcConselhoRegional.gridy = 1;
        painelConselhoRegional.add(new JLabel("Reg. Regional:"), gbcConselhoRegional);

        gbcConselhoRegional.gridx = 1;
        gbcConselhoRegional.gridwidth = 1;
        gbcConselhoRegional.weightx = 1.0;
        JTextField txtRegRegional = new JTextField(10);
        painelConselhoRegional.add(txtRegRegional, gbcConselhoRegional);

        gbcConselhoRegional.gridx = 0;
        gbcConselhoRegional.gridy = 2;
        painelConselhoRegional.add(new JLabel("Número:"), gbcConselhoRegional);

        gbcConselhoRegional.gridx = 1;
        gbcConselhoRegional.gridwidth = 1;
        gbcConselhoRegional.weightx = 1.0;
        JTextField txtNumeroConselho = new JTextField(10);
        painelConselhoRegional.add(txtNumeroConselho, gbcConselhoRegional);

        gbcConselhoRegional.gridx = 2;
        gbcConselhoRegional.weightx = 0;
        painelConselhoRegional.add(new JLabel("Data Expedição:"), gbcConselhoRegional);

        gbcConselhoRegional.gridx = 3;
        gbcConselhoRegional.gridwidth = 1;
        gbcConselhoRegional.weightx = 1.0;
        JTextField txtDataExpedicaoConselho = new JTextField(10);
        painelConselhoRegional.add(txtDataExpedicaoConselho, gbcConselhoRegional);

        gbcConselhoRegional.gridx = 0;
        gbcConselhoRegional.gridy = 3;
        painelConselhoRegional.add(new JLabel("Órgão Emissor:"), gbcConselhoRegional);

        gbcConselhoRegional.gridx = 1;
        gbcConselhoRegional.gridwidth = 1;
        gbcConselhoRegional.weightx = 1.0;
        JTextField txtOrgaoEmissorConselho = new JTextField(12);
        painelConselhoRegional.add(txtOrgaoEmissorConselho, gbcConselhoRegional);

        gbcConselhoRegional.gridx = 2;
        gbcConselhoRegional.weightx = 0;
        painelConselhoRegional.add(new JLabel("Data Validade:"), gbcConselhoRegional);

        gbcConselhoRegional.gridx = 3;
        gbcConselhoRegional.gridwidth = GridBagConstraints.REMAINDER;
        gbcConselhoRegional.weightx = 1.0;
        JTextField txtDataValidadeConselho = new JTextField(10);
        painelConselhoRegional.add(txtDataValidadeConselho, gbcConselhoRegional);

        // Painel de RIC
        JPanel painelRIC = new JPanel(new GridBagLayout());
        TitledBorder borderRIC = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "RIC", TitledBorder.LEFT, TitledBorder.TOP);
        borderRIC.setTitleFont(fontTitle);
        painelRIC.setBorder(borderRIC);
        GridBagConstraints gbcRIC = new GridBagConstraints();
        gbcRIC.insets = new Insets(5, 5, 5, 5);
        gbcRIC.fill = GridBagConstraints.HORIZONTAL;

        // Número, Órgão Expedidor, Data Expedição
        gbcRIC.gridx = 0;
        gbcRIC.gridy = 0;
        painelRIC.add(new JLabel("Número:"), gbcRIC);

        gbcRIC.gridx = 1;
        gbcRIC.gridwidth = GridBagConstraints.REMAINDER;
        gbcRIC.weightx = 1.0;
        JTextField txtNumeroRIC = new JTextField(12);
        painelRIC.add(txtNumeroRIC, gbcRIC);

        gbcRIC.gridx = 0;
        gbcRIC.gridy = 1;
        painelRIC.add(new JLabel("Órgão Expedidor:"), gbcRIC);

        gbcRIC.gridx = 1;
        gbcRIC.gridwidth = GridBagConstraints.REMAINDER;
        gbcRIC.weightx = 1.0;
        JTextField txtOrgaoExpedidorRIC = new JTextField(10);
        painelRIC.add(txtOrgaoExpedidorRIC, gbcRIC);

        gbcRIC.gridx = 0;
        gbcRIC.gridy = 2;
        painelRIC.add(new JLabel("Data Expedição:"), gbcRIC);

        gbcRIC.gridx = 1;
        gbcRIC.gridwidth = GridBagConstraints.REMAINDER;
        gbcRIC.weightx = 1.0;
        JTextField txtDataExpedicaoRIC = new JTextField(10);
        painelRIC.add(txtDataExpedicaoRIC, gbcRIC);

        // Adicionando os painéis ao painel principal com o novo layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelRG, gbc);

        gbc.gridy = 1;
        add(painelMilitar, gbc);

        gbc.gridy = 2;
        add(painelCNH, gbc);

        gbc.gridy = 3;
        add(painelCTPS, gbc);

        gbc.gridy = 4;
        add(painelPIS, gbc);

        gbc.gridy = 5;
        add(painelConselhoRegional, gbc);

        gbc.gridy = 6;
        add(painelRIC, gbc);

        // Componente invisível para ocupar espaço abaixo e "empurrar" os painéis para o topo
        gbc.gridy = 7;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(Box.createVerticalGlue(), gbc);
    }
}