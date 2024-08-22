package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaPrincipal extends JPanel {

    public AbaPrincipal() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // Ajustando as margens entre os componentes
        gbc.fill = GridBagConstraints.BOTH;

        // Definindo a fonte padrão para os componentes
        Font fontLabel = new Font("Georgia", Font.PLAIN, 14);
        Font fontField = new Font("Georgia", Font.PLAIN, 14);
        Font fontTitle = new Font("Georgia", Font.BOLD, 16);

        // Criando e configurando o painel de Dados Gerais
        JPanel painelDadosGerais = new JPanel(new GridBagLayout());
        TitledBorder borderDadosGerais = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Dados Gerais", TitledBorder.LEFT, TitledBorder.TOP);
        borderDadosGerais.setTitleFont(fontTitle);
        painelDadosGerais.setBorder(borderDadosGerais);

        // Empresa e Divisão RH (Colocando-os um abaixo do outro)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblEmpresa = new JLabel("Empresa");
        lblEmpresa.setFont(fontLabel);
        painelDadosGerais.add(lblEmpresa, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbEmpresa = new JComboBox<>(new String[]{
            "1000 - EMPRESA RH", "1001 - EMPRESA FINANCEIRA", 
            "1002 - EMPRESA DE TECNOLOGIA", "1003 - EMPRESA DE LOGÍSTICA", 
            "1004 - EMPRESA DE MARKETING", "1005 - EMPRESA DE VENDAS"
        });
        cmbEmpresa.setFont(fontField);
        painelDadosGerais.add(cmbEmpresa, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDivisao = new JLabel("Divisão RH");
        lblDivisao.setFont(fontLabel);
        painelDadosGerais.add(lblDivisao, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbDivisao = new JComboBox<>(new String[]{
            "1001 - ADMINISTRAÇÃO", "1002 - FINANCEIRO", 
            "1003 - TECNOLOGIA", "1004 - LOGÍSTICA", 
            "1005 - MARKETING", "1006 - VENDAS"
        });
        cmbDivisao.setFont(fontField);
        painelDadosGerais.add(cmbDivisao, gbc);

        // Matrícula e Funcionário (Mantendo na mesma linha)
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblMatricula = new JLabel("Matrícula");
        lblMatricula.setFont(fontLabel);
        painelDadosGerais.add(lblMatricula, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtMatricula = new JTextField("", 10); // Aumentando o tamanho do campo
        txtMatricula.setFont(fontField);
        painelDadosGerais.add(txtMatricula, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblFuncionario = new JLabel("Funcionário");
        lblFuncionario.setFont(fontLabel);
        painelDadosGerais.add(lblFuncionario, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtFuncionario = new JTextField("", 20); // Ajustando o tamanho do campo
        txtFuncionario.setFont(fontField);
        painelDadosGerais.add(txtFuncionario, gbc);

        // Criando e configurando o painel de Endereço
        JPanel painelEndereco = new JPanel(new GridBagLayout());
        TitledBorder borderEndereco = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Endereço", TitledBorder.LEFT, TitledBorder.TOP);
        borderEndereco.setTitleFont(fontTitle);
        painelEndereco.setBorder(borderEndereco);

        // CEP e Endereço (Mantendo na mesma linha)
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCEP = new JLabel("CEP");
        lblCEP.setFont(fontLabel);
        painelEndereco.add(lblCEP, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtCEP = new JTextField("", 10); // Aumentando o tamanho do campo
        txtCEP.setFont(fontField);
        painelEndereco.add(txtCEP, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblEndereco = new JLabel("Endereço");
        lblEndereco.setFont(fontLabel);
        painelEndereco.add(lblEndereco, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtEndereco = new JTextField("", 25); // Ajustando o tamanho do campo
        txtEndereco.setFont(fontField);
        painelEndereco.add(txtEndereco, gbc);

        // Número, Bairro e Município (Organizando em colunas diferentes)
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumero = new JLabel("Nº");
        lblNumero.setFont(fontLabel);
        painelEndereco.add(lblNumero, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNumero = new JTextField("", 10); // Aumentando o tamanho do campo
        txtNumero.setFont(fontField);
        painelEndereco.add(txtNumero, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setFont(fontLabel);
        painelEndereco.add(lblBairro, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtBairro = new JTextField("", 20); // Ajustando o tamanho do campo
        txtBairro.setFont(fontField);
        painelEndereco.add(txtBairro, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblMunicipio = new JLabel("Município");
        lblMunicipio.setFont(fontLabel);
        painelEndereco.add(lblMunicipio, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtMunicipio = new JTextField("", 25); // Ajustando o tamanho do campo
        txtMunicipio.setFont(fontField);
        painelEndereco.add(txtMunicipio, gbc);

        // Telefone e Email (Mantendo na mesma linha)
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setFont(fontLabel);
        painelEndereco.add(lblTelefone, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtTelefone = new JTextField("", 15); // Mantendo o tamanho do campo
        txtTelefone.setFont(fontField);
        painelEndereco.add(txtTelefone, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCelular = new JLabel("Celular");
        lblCelular.setFont(fontLabel);
        painelEndereco.add(lblCelular, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtTelefoneCelular = new JTextField("", 15); // Mantendo o tamanho do campo
        txtTelefoneCelular.setFont(fontField);
        painelEndereco.add(txtTelefoneCelular, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(fontLabel);
        painelEndereco.add(lblEmail, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtEmail = new JTextField("", 25); // Ajustando o tamanho do campo
        txtEmail.setFont(fontField);
        painelEndereco.add(txtEmail, gbc);

        // Criando e configurando o painel de Dados Pessoais
        JPanel painelDadosPessoais = new JPanel(new GridBagLayout());
        TitledBorder borderDadosPessoais = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Dados Pessoais", TitledBorder.LEFT, TitledBorder.TOP);
        borderDadosPessoais.setTitleFont(fontTitle);
        painelDadosPessoais.setBorder(borderDadosPessoais);

        // Adicionando campos de Dados Pessoais
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblSexo = new JLabel("Sexo");
        lblSexo.setFont(fontLabel);
        painelDadosPessoais.add(lblSexo, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbSexo = new JComboBox<>(new String[]{"Feminino", "Masculino"});
        cmbSexo.setFont(fontField);
        painelDadosPessoais.add(cmbSexo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataNascimento = new JLabel("Data Nascimento");
        lblDataNascimento.setFont(fontLabel);
        painelDadosPessoais.add(lblDataNascimento, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataNascimento = new JTextField(10);
        txtDataNascimento.setFont(fontField);
        painelDadosPessoais.add(txtDataNascimento, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblEstadoCivil = new JLabel("Estado Civil");
        lblEstadoCivil.setFont(fontLabel);
        painelDadosPessoais.add(lblEstadoCivil, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbEstadoCivil = new JComboBox<>(new String[]{"Solteiro", "Casado", "Divorciado"});
        cmbEstadoCivil.setFont(fontField);
        painelDadosPessoais.add(cmbEstadoCivil, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNaturalidade = new JLabel("Naturalidade");
        lblNaturalidade.setFont(fontLabel);
        painelDadosPessoais.add(lblNaturalidade, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNaturalidade = new JTextField(20);
        txtNaturalidade.setFont(fontField);
        painelDadosPessoais.add(txtNaturalidade, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNacionalidade = new JLabel("Nacionalidade");
        lblNacionalidade.setFont(fontLabel);
        painelDadosPessoais.add(lblNacionalidade, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNacionalidade = new JTextField(20);
        txtNacionalidade.setFont(fontField);
        painelDadosPessoais.add(txtNacionalidade, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblGrauInstrucao = new JLabel("Grau de Instrução");
        lblGrauInstrucao.setFont(fontLabel);
        painelDadosPessoais.add(lblGrauInstrucao, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtGrauInstrucao = new JTextField(20);
        txtGrauInstrucao.setFont(fontField);
        painelDadosPessoais.add(txtGrauInstrucao, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblFormacao = new JLabel("Formação");
        lblFormacao.setFont(fontLabel);
        painelDadosPessoais.add(lblFormacao, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtFormacao = new JTextField(20);
        txtFormacao.setFont(fontField);
        painelDadosPessoais.add(txtFormacao, gbc);

        // Criando e configurando o painel de Filiação
        JPanel painelFiliacao = new JPanel(new GridBagLayout());
        TitledBorder borderFiliacao = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Filiação", TitledBorder.LEFT, TitledBorder.TOP);
        borderFiliacao.setTitleFont(fontTitle);
        painelFiliacao.setBorder(borderFiliacao);

        // Adicionando campos de Filiação
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblPai = new JLabel("Pai");
        lblPai.setFont(fontLabel);
        painelFiliacao.add(lblPai, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtPai = new JTextField(20);
        txtPai.setFont(fontField);
        painelFiliacao.add(txtPai, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblMae = new JLabel("Mãe");
        lblMae.setFont(fontLabel);
        painelFiliacao.add(lblMae, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtMae = new JTextField(20);
        txtMae.setFont(fontField);
        painelFiliacao.add(txtMae, gbc);

        // Adicionar os painéis ao painel principal com novo layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelDadosGerais, gbc);

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelEndereco, gbc);

        gbc.gridy = 2;
        add(painelDadosPessoais, gbc);

        gbc.gridy = 3;
        add(painelFiliacao, gbc);

        // Componente invisível para ocupar espaço abaixo e "empurrar" os painéis para o topo
        gbc.gridy = 4;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(Box.createVerticalGlue(), gbc);
    }
}