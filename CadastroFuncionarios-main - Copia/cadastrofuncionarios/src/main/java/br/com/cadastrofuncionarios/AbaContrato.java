package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaContrato extends JPanel {

    public AbaContrato() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Ajuste das margens
        gbc.fill = GridBagConstraints.HORIZONTAL; // Para que o campo ocupe todo o espaço horizontal
        gbc.anchor = GridBagConstraints.WEST; // Alinhamento à esquerda

        // Definindo a fonte padrão para os componentes
        Font fontLabel = new Font("Georgia", Font.PLAIN, 14);
        Font fontField = new Font("Georgia", Font.PLAIN, 14);
        Font fontTitle = new Font("Georgia", Font.BOLD, 16);

        // Painel de Vínculo
        JPanel painelVinculo = new JPanel(new GridBagLayout());
        TitledBorder borderVinculo = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Vínculo", TitledBorder.LEFT, TitledBorder.TOP);
        borderVinculo.setTitleFont(fontTitle);
        painelVinculo.setBorder(borderVinculo);
        GridBagConstraints gbcVinculo = new GridBagConstraints();
        gbcVinculo.insets = new Insets(5, 5, 5, 5);
        gbcVinculo.fill = GridBagConstraints.HORIZONTAL;
        gbcVinculo.anchor = GridBagConstraints.WEST;

        // Tipo de Vínculo e Tipo de Admissão
        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 0;
        painelVinculo.add(new JLabel("Vínculo:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 3;
        gbcVinculo.weightx = 1.0;
        JComboBox<String> cmbVinculo = new JComboBox<>(new String[]{
            "15 - Trabalhador urbano vinculado a empregador pessoa física por contrato indeterminado",
            "16 - Trabalhador rural vinculado a empregador pessoa física por contrato indeterminado"
        });
        painelVinculo.add(cmbVinculo, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 1;
        painelVinculo.add(new JLabel("Tipo de Admissão:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 3;
        JTextField txtTipoAdmissao = new JTextField(20);
        painelVinculo.add(txtTipoAdmissao, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 2;
        painelVinculo.add(new JLabel("Reemprego:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 3;
        JComboBox<String> cmbReemprego = new JComboBox<>(new String[]{"Sim", "Não"});
        painelVinculo.add(cmbReemprego, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 3;
        painelVinculo.add(new JLabel("Data Admissão:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JTextField txtDataAdmissao = new JTextField(12);
        painelVinculo.add(txtDataAdmissao, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 4;
        painelVinculo.add(new JLabel("Tipo de Salário:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JComboBox<String> cmbTipoSalario = new JComboBox<>(new String[]{"Mensal", "Semanal", "Diário", "Horário"});
        painelVinculo.add(cmbTipoSalario, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 5;
        painelVinculo.add(new JLabel("Horário:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JComboBox<String> cmbHorario = new JComboBox<>(new String[]{"Geral", "Noturno", "Turno Fixo"});
        painelVinculo.add(cmbHorario, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 6;
        painelVinculo.add(new JLabel("Hrs. Sem.:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JTextField txtHorasSemanais = new JTextField(5);
        painelVinculo.add(txtHorasSemanais, gbcVinculo);

        // FGTS
        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 7;
        painelVinculo.add(new JLabel("FGTS:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 1;
        JComboBox<String> cmbFgts = new JComboBox<>(new String[]{"Optante", "Não Optante"});
        painelVinculo.add(cmbFgts, gbcVinculo);

        gbcVinculo.gridx = 2;
        painelVinculo.add(new JLabel("Data Opção:"), gbcVinculo);

        gbcVinculo.gridx = 3;
        gbcVinculo.gridwidth = 2;
        JTextField txtDataOpcaoFgts = new JTextField(12);
        painelVinculo.add(txtDataOpcaoFgts, gbcVinculo);

        // Adiantamento Quinzenal
        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 8;
        painelVinculo.add(new JLabel("Adiantamento Quinzenal:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 1;
        JCheckBox chkAdiantamento = new JCheckBox("Sim");
        painelVinculo.add(chkAdiantamento, gbcVinculo);

        gbcVinculo.gridx = 2;
        painelVinculo.add(new JLabel("Percentual:"), gbcVinculo);

        gbcVinculo.gridx = 3;
        gbcVinculo.gridwidth = 2;
        JTextField txtPercentual = new JTextField(5);
        painelVinculo.add(txtPercentual, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 9;
        painelVinculo.add(new JLabel("Valor Fixo:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JTextField txtValorFixo = new JTextField(12);
        painelVinculo.add(txtValorFixo, gbcVinculo);

        // Valor Salário e Tipo de Reajuste
        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 10;
        painelVinculo.add(new JLabel("Valor Salário:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JTextField txtValorSalario = new JTextField(12);
        painelVinculo.add(txtValorSalario, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 11;
        painelVinculo.add(new JLabel("Tipo de Reajuste:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JComboBox<String> cmbTipoReajuste = new JComboBox<>(new String[]{"Fixo", "Variável"});
        painelVinculo.add(cmbTipoReajuste, gbcVinculo);

        // Experiência e Atividade Desenvolvida
        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 12;
        painelVinculo.add(new JLabel("Experiência Vencimento:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JTextField txtVencimentoExperiencia = new JTextField(12);
        painelVinculo.add(txtVencimentoExperiencia, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 13;
        painelVinculo.add(new JLabel("Prorrogação:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JTextField txtProrrogacao = new JTextField(12);
        painelVinculo.add(txtProrrogacao, gbcVinculo);

        gbcVinculo.gridx = 0;
        gbcVinculo.gridy = 14;
        painelVinculo.add(new JLabel("Atividade Desenvolvida:"), gbcVinculo);

        gbcVinculo.gridx = 1;
        gbcVinculo.gridwidth = 2;
        JPanel panelAtividade = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton rbtUrbana = new JRadioButton("Urbana");
        JRadioButton rbtRural = new JRadioButton("Rural");
        ButtonGroup groupAtividade = new ButtonGroup();
        groupAtividade.add(rbtUrbana);
        groupAtividade.add(rbtRural);
        panelAtividade.add(rbtUrbana);
        panelAtividade.add(rbtRural);
        painelVinculo.add(panelAtividade, gbcVinculo);

        // Painel de Cargo
        JPanel painelCargo = new JPanel(new GridBagLayout());
        TitledBorder borderCargo = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Cargo", TitledBorder.LEFT, TitledBorder.TOP);
        borderCargo.setTitleFont(fontTitle);
        painelCargo.setBorder(borderCargo);
        GridBagConstraints gbcCargo = new GridBagConstraints();
        gbcCargo.insets = new Insets(5, 5, 5, 5);
        gbcCargo.fill = GridBagConstraints.HORIZONTAL;
        gbcCargo.anchor = GridBagConstraints.WEST;

        // Cargo, Departamento e Categoria GFIP
        gbcCargo.gridx = 0;
        gbcCargo.gridy = 0;
        painelCargo.add(new JLabel("Cargo:"), gbcCargo);

        gbcCargo.gridx = 1;
        gbcCargo.gridwidth = 3;
        gbcCargo.weightx = 1.0;
        JComboBox<String> cmbCargo = new JComboBox<>(new String[]{"142105 - Gerente administrativo", "Selecione"});
        painelCargo.add(cmbCargo, gbcCargo);

        gbcCargo.gridx = 0;
        gbcCargo.gridy = 1;
        painelCargo.add(new JLabel("Departamento:"), gbcCargo);

        gbcCargo.gridx = 1;
        gbcCargo.gridwidth = 3;
        JComboBox<String> cmbDepartamento = new JComboBox<>(new String[]{"1 - ADMINISTRATIVO", "2 - FINANCEIRO", "3 - TECNOLOGIA", "4 - LOGÍSTICA"});
        painelCargo.add(cmbDepartamento, gbcCargo);

        gbcCargo.gridx = 0;
        gbcCargo.gridy = 2;
        painelCargo.add(new JLabel("Categoria GFIP:"), gbcCargo);

        gbcCargo.gridx = 1;
        gbcCargo.gridwidth = 3;
        JComboBox<String> cmbCategoriaGFIP = new JComboBox<>(new String[]{"11 - Contribuinte individual - Diretor não empregado e demais"});
        painelCargo.add(cmbCategoriaGFIP, gbcCargo);

        gbcCargo.gridx = 0;
        gbcCargo.gridy = 3;
        painelCargo.add(new JLabel("Tipo Contrato:"), gbcCargo);

        gbcCargo.gridx = 1;
        gbcCargo.gridwidth = 3;
        JComboBox<String> cmbTipoContrato = new JComboBox<>(new String[]{"Prazo Determinado", "Prazo Indeterminado"});
        painelCargo.add(cmbTipoContrato, gbcCargo);

        // Painel de Rescisão
        JPanel painelRescisao = new JPanel(new GridBagLayout());
        TitledBorder borderRescisao = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Rescisão", TitledBorder.LEFT, TitledBorder.TOP);
        borderRescisao.setTitleFont(fontTitle);
        painelRescisao.setBorder(borderRescisao);
        GridBagConstraints gbcRescisao = new GridBagConstraints();
        gbcRescisao.insets = new Insets(5, 5, 5, 5);
        gbcRescisao.fill = GridBagConstraints.HORIZONTAL;

        // Data Demissão, Motivo Demissão, etc.
        gbcRescisao.gridx = 0;
        gbcRescisao.gridy = 0;
        painelRescisao.add(new JLabel("Data Demissão:"), gbcRescisao);

        gbcRescisao.gridx = 1;
        gbcRescisao.gridwidth = GridBagConstraints.REMAINDER;
        gbcRescisao.weightx = 1.0;
        JTextField txtDataDemissao = new JTextField(12);
        painelRescisao.add(txtDataDemissao, gbcRescisao);

        gbcRescisao.gridx = 0;
        gbcRescisao.gridy = 1;
        painelRescisao.add(new JLabel("Motivo Demissão:"), gbcRescisao);

        gbcRescisao.gridx = 1;
        gbcRescisao.gridwidth = GridBagConstraints.REMAINDER;
        gbcRescisao.weightx = 1.0;
        JTextField txtMotivoDemissao = new JTextField(20);
        painelRescisao.add(txtMotivoDemissao, gbcRescisao);

        gbcRescisao.gridx = 0;
        gbcRescisao.gridy = 2;
        painelRescisao.add(new JLabel("Aviso Prévio:"), gbcRescisao);

        gbcRescisao.gridx = 1;
        gbcRescisao.gridwidth = 1;
        gbcRescisao.weightx = 1.0;
        JCheckBox chkAvisoPrevio = new JCheckBox();
        painelRescisao.add(chkAvisoPrevio, gbcRescisao);

        gbcRescisao.gridx = 0;
        gbcRescisao.gridy = 3;
        painelRescisao.add(new JLabel("Data Aviso Início:"), gbcRescisao);

        gbcRescisao.gridx = 1;
        gbcRescisao.gridwidth = 2;
        gbcRescisao.weightx = 1.0;
        JTextField txtDataAvisoInicio = new JTextField(10);
        painelRescisao.add(txtDataAvisoInicio, gbcRescisao);

        gbcRescisao.gridx = 0;
        gbcRescisao.gridy = 4;
        painelRescisao.add(new JLabel("Data Aviso Fim:"), gbcRescisao);

        gbcRescisao.gridx = 1;
        gbcRescisao.gridwidth = 2;
        gbcRescisao.weightx = 1.0;
        JTextField txtDataAvisoFim = new JTextField(10);
        painelRescisao.add(txtDataAvisoFim, gbcRescisao);

        gbcRescisao.gridx = 0;
        gbcRescisao.gridy = 5;
        painelRescisao.add(new JLabel("Motivo RAIS:"), gbcRescisao);

        gbcRescisao.gridx = 1;
        gbcRescisao.gridwidth = GridBagConstraints.REMAINDER;
        gbcRescisao.weightx = 1.0;
        JTextField txtMotivoRais = new JTextField(20);
        painelRescisao.add(txtMotivoRais, gbcRescisao);

        // Adicionar os painéis ao painel principal com novo layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelVinculo, gbc);

        gbc.gridy = 1;
        add(painelCargo, gbc);

        gbc.gridy = 2;
        add(painelRescisao, gbc);

        // Componente invisível para ocupar espaço abaixo e "empurrar" os painéis para o topo
        gbc.gridy = 3;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(Box.createVerticalGlue(), gbc);
    }
}