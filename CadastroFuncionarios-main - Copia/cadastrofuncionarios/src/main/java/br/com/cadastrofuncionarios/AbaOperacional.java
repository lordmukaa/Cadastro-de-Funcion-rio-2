package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaOperacional extends JPanel {

    public AbaOperacional() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;

        // Fonte geral dos componentes
        Font fontLabel = new Font("Georgia", Font.PLAIN, 14);
        Font fontField = new Font("Georgia", Font.PLAIN, 14);
        Font fontTitle = new Font("Georgia", Font.BOLD, 16);

        // Painel de Checkboxes
        JPanel painelCheckboxes = new JPanel(new GridBagLayout());
        painelCheckboxes.setBorder(BorderFactory.createTitledBorder("Opções"));
        GridBagConstraints gbcCheckboxes = new GridBagConstraints();
        gbcCheckboxes.insets = new Insets(10, 10, 10, 10);
        gbcCheckboxes.fill = GridBagConstraints.HORIZONTAL;

        gbcCheckboxes.gridx = 0;
        gbcCheckboxes.gridy = 0;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkInss = new JCheckBox("INSS");
        painelCheckboxes.add(chkInss, gbcCheckboxes);

        gbcCheckboxes.gridx = 1;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkFgts = new JCheckBox("FGTS");
        painelCheckboxes.add(chkFgts, gbcCheckboxes);

        gbcCheckboxes.gridx = 2;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkIrrf = new JCheckBox("IRRF");
        painelCheckboxes.add(chkIrrf, gbcCheckboxes);

        gbcCheckboxes.gridx = 3;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkValeTransporte = new JCheckBox("Vale Transporte");
        painelCheckboxes.add(chkValeTransporte, gbcCheckboxes);

        gbcCheckboxes.gridx = 0;
        gbcCheckboxes.gridy = 1;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkValeRefeicao = new JCheckBox("Vale Refeição");
        painelCheckboxes.add(chkValeRefeicao, gbcCheckboxes);

        gbcCheckboxes.gridx = 1;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkPlanoSaude = new JCheckBox("Plano de Saúde");
        painelCheckboxes.add(chkPlanoSaude, gbcCheckboxes);

        gbcCheckboxes.gridx = 2;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkReembolsoInssIrrf = new JCheckBox("Reembolso INSS/IRRF");
        painelCheckboxes.add(chkReembolsoInssIrrf, gbcCheckboxes);

        gbcCheckboxes.gridx = 3;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkEmpregadoDomestico = new JCheckBox("Empregado Doméstico");
        painelCheckboxes.add(chkEmpregadoDomestico, gbcCheckboxes);

        gbcCheckboxes.gridx = 0;
        gbcCheckboxes.gridy = 2;
        gbcCheckboxes.gridwidth = GridBagConstraints.REMAINDER;
        gbcCheckboxes.weightx = 1.0;
        JCheckBox chkBeneficioPrevidencia = new JCheckBox("Benefício Previdência - Aposentadoria");
        painelCheckboxes.add(chkBeneficioPrevidencia, gbcCheckboxes);

        // Painel de Dados Funcionário
        JPanel painelDadosFuncionario = new JPanel(new GridBagLayout());
        painelDadosFuncionario.setBorder(BorderFactory.createTitledBorder("Dados Funcionário"));
        GridBagConstraints gbcDadosFuncionario = new GridBagConstraints();
        gbcDadosFuncionario.insets = new Insets(20, 20, 20, 20);
        gbcDadosFuncionario.fill = GridBagConstraints.HORIZONTAL;

        // Raça Cor
        gbcDadosFuncionario.gridx = 0;
        gbcDadosFuncionario.gridy = 0;
        gbcDadosFuncionario.weightx = 0;
        painelDadosFuncionario.add(new JLabel("Raça Cor:"), gbcDadosFuncionario);

        gbcDadosFuncionario.gridx = 1;
        gbcDadosFuncionario.gridwidth = GridBagConstraints.REMAINDER;
        gbcDadosFuncionario.weightx = 1.0;
        JComboBox<String> cmbRacaCor = new JComboBox<>(new String[]{"Branca", "Negra", "Parda", "Amarela", "Indígena"});
        painelDadosFuncionario.add(cmbRacaCor, gbcDadosFuncionario);

        // Tipo de Deficiência
        gbcDadosFuncionario.gridx = 0;
        gbcDadosFuncionario.gridy = 1;
        gbcDadosFuncionario.gridwidth = 1;
        gbcDadosFuncionario.weightx = 0;
        painelDadosFuncionario.add(new JLabel("Tipo de Deficiência:"), gbcDadosFuncionario);

        gbcDadosFuncionario.gridx = 1;
        gbcDadosFuncionario.gridwidth = GridBagConstraints.REMAINDER;
        gbcDadosFuncionario.weightx = 1.0;
        JComboBox<String> cmbTipoDeficiencia = new JComboBox<>(new String[]{"0", "1", "2", "3", "4", "5"});
        painelDadosFuncionario.add(cmbTipoDeficiencia, gbcDadosFuncionario);

        // Painel de Informações Bancárias
        JPanel painelInfoBancarias = new JPanel(new GridBagLayout());
        painelInfoBancarias.setBorder(BorderFactory.createTitledBorder("Informações Bancárias"));
        GridBagConstraints gbcInfoBancarias = new GridBagConstraints();
        gbcInfoBancarias.insets = new Insets(5, 5, 5, 5);
        gbcInfoBancarias.fill = GridBagConstraints.HORIZONTAL;

        // Forma de Pagamento
        gbcInfoBancarias.gridx = 0;
        gbcInfoBancarias.gridy = 0;
        gbcInfoBancarias.weightx = 0;
        painelInfoBancarias.add(new JLabel("Forma de Pagamento:"), gbcInfoBancarias);

        gbcInfoBancarias.gridx = 1;
        gbcInfoBancarias.gridwidth = GridBagConstraints.REMAINDER;
        gbcInfoBancarias.weightx = 1.0;
        JComboBox<String> cmbFormaPagamento = new JComboBox<>(new String[]{"Crédito em Conta", "Cheque", "Dinheiro"});
        painelInfoBancarias.add(cmbFormaPagamento, gbcInfoBancarias);

        // Banco, Agência, Número da Conta
        gbcInfoBancarias.gridx = 0;
        gbcInfoBancarias.gridy = 1;
        gbcInfoBancarias.gridwidth = 1;
        gbcInfoBancarias.weightx = 0;
        painelInfoBancarias.add(new JLabel("Banco:"), gbcInfoBancarias);

        gbcInfoBancarias.gridx = 1;
        gbcInfoBancarias.gridwidth = 1;
        gbcInfoBancarias.weightx = 1.0;
        JComboBox<String> cmbBanco = new JComboBox<>(new String[]{"Banco do Brasil", "Caixa", "Bradesco", "Itaú"});
        painelInfoBancarias.add(cmbBanco, gbcInfoBancarias);

        gbcInfoBancarias.gridx = 2;
        gbcInfoBancarias.weightx = 0;
        painelInfoBancarias.add(new JLabel("Agência:"), gbcInfoBancarias);

        gbcInfoBancarias.gridx = 3;
        gbcInfoBancarias.weightx = 1.0;
        JTextField txtAgencia = new JTextField(10);
        painelInfoBancarias.add(txtAgencia, gbcInfoBancarias);

        gbcInfoBancarias.gridx = 0;
        gbcInfoBancarias.gridy = 2;
        gbcInfoBancarias.gridwidth = 1;
        gbcInfoBancarias.weightx = 0;
        painelInfoBancarias.add(new JLabel("Número Conta:"), gbcInfoBancarias);

        gbcInfoBancarias.gridx = 1;
        gbcInfoBancarias.gridwidth = GridBagConstraints.REMAINDER;
        gbcInfoBancarias.weightx = 1.0;
        JTextField txtNumeroConta = new JTextField(15);
        painelInfoBancarias.add(txtNumeroConta, gbcInfoBancarias);

        // Painel de Exames Admissionais
        JPanel painelExames = new JPanel(new GridBagLayout());
        painelExames.setBorder(BorderFactory.createTitledBorder("Exames Admissionais"));
        GridBagConstraints gbcExames = new GridBagConstraints();
        gbcExames.insets = new Insets(5, 5, 5, 5);
        gbcExames.fill = GridBagConstraints.HORIZONTAL;

        // Nome Médico, CRM, Data Exame
        gbcExames.gridx = 0;
        gbcExames.gridy = 0;
        gbcExames.weightx = 0;
        painelExames.add(new JLabel("Nome Médico:"), gbcExames);

        gbcExames.gridx = 1;
        gbcExames.gridwidth = GridBagConstraints.REMAINDER;
        gbcExames.weightx = 1.0;
        JTextField txtNomeMedico = new JTextField(20);
        painelExames.add(txtNomeMedico, gbcExames);

        gbcExames.gridx = 0;
        gbcExames.gridy = 1;
        gbcExames.gridwidth = 1;
        gbcExames.weightx = 0;
        painelExames.add(new JLabel("CRM:"), gbcExames);

        gbcExames.gridx = 1;
        gbcExames.gridwidth = GridBagConstraints.REMAINDER;
        gbcExames.weightx = 1.0;
        JTextField txtCRM = new JTextField(10);
        painelExames.add(txtCRM, gbcExames);

        gbcExames.gridx = 0;
        gbcExames.gridy = 2;
        gbcExames.gridwidth = 1;
        gbcExames.weightx = 0;
        painelExames.add(new JLabel("Data Exame:"), gbcExames);

        gbcExames.gridx = 1;
        gbcExames.gridwidth = GridBagConstraints.REMAINDER;
        gbcExames.weightx = 1.0;
        JTextField txtDataExame = new JTextField(10);
        painelExames.add(txtDataExame, gbcExames);

        // Painel de Sindicato
        JPanel painelSindicato = new JPanel(new GridBagLayout());
        painelSindicato.setBorder(BorderFactory.createTitledBorder("Sindicato"));
        GridBagConstraints gbcSindicato = new GridBagConstraints();
        gbcSindicato.insets = new Insets(5, 5, 5, 5);
        gbcSindicato.fill = GridBagConstraints.HORIZONTAL;

        // Sindicato e Mês Dissídio
        gbcSindicato.gridx = 0;
        gbcSindicato.gridy = 0;
        gbcSindicato.weightx = 0;
        painelSindicato.add(new JLabel("Sindicato:"), gbcSindicato);

        gbcSindicato.gridx = 1;
        gbcSindicato.gridwidth = GridBagConstraints.REMAINDER;
        gbcSindicato.weightx = 1.0;
        JComboBox<String> cmbSindicato = new JComboBox<>(new String[]{"SINDICATO FUNCIONAL", "OUTRO"});
        painelSindicato.add(cmbSindicato, gbcSindicato);

        gbcSindicato.gridx = 0;
        gbcSindicato.gridy = 1;
        gbcSindicato.weightx = 0;
        painelSindicato.add(new JLabel("Mês Dissídio:"), gbcSindicato);

        gbcSindicato.gridx = 2;
        gbcSindicato.gridwidth = GridBagConstraints.REMAINDER;
        gbcSindicato.weightx = 1.0;
        JComboBox<String> cmbMesDissidio = new JComboBox<>(new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"});
        painelSindicato.add(cmbMesDissidio, gbcSindicato);

        // Painel de Foto
        JPanel painelFoto = new JPanel(new GridBagLayout());
        painelFoto.setBorder(BorderFactory.createTitledBorder("Foto"));
        GridBagConstraints gbcFoto = new GridBagConstraints();
        gbcFoto.insets = new Insets(5, 5, 5, 5);
        gbcFoto.fill = GridBagConstraints.HORIZONTAL;

        // Botões de Selecionar e Limpar Foto
        gbcFoto.gridx = 0;
        gbcFoto.gridy = 0;
        painelFoto.add(new JButton("Selecionar"), gbcFoto);

        gbcFoto.gridy = 1;
        painelFoto.add(new JButton("Limpar"), gbcFoto);

        // Adicionar todos os painéis ao painel principal com o novo layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelCheckboxes, gbc);

        gbc.gridy = 1;
        add(painelDadosFuncionario, gbc);

        gbc.gridy = 2;
        add(painelInfoBancarias, gbc);

        gbc.gridy = 3;
        add(painelExames, gbc);

        gbc.gridy = 4;
        add(painelSindicato, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 5;
        gbc.weighty = 1.0;
        add(painelFoto, gbc);

        // Componente invisível para ocupar espaço abaixo e "empurrar" os painéis para o topo
        gbc.gridy = 5;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(Box.createVerticalGlue(), gbc);
    }
}