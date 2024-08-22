# Cadastro de Funcionários - Versão 2

Este é um projeto Java aprimorado para o gerenciamento de cadastro de funcionários. A nova versão apresenta melhorias significativas, incluindo novos painéis e uma interface de usuário mais refinada. A aplicação agora oferece funcionalidades adicionais para gerenciar documentações, contratos, operações funcionais e outras informações importantes dos funcionários.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **src/main/java/br/com/cadastrofuncionarios/**: Contém as classes Java principais do projeto, divididas em diferentes abas para melhor organização.
- **src/main/resources/**: (opcional) Caso haja recursos como imagens ou arquivos de configuração.
- **pom.xml**: Arquivo de configuração do Maven para gerenciamento de dependências e construção do projeto.
- **target/**: Diretório gerado pelo Maven, contendo os arquivos compilados e o JAR executável do projeto.

## Principais Funcionalidades

### Novos Painéis

- **AbaPrincipal.java**: Gestão dos dados principais dos funcionários, como empresa, divisão, endereço, e dados pessoais.
- **AbaContrato.java**: Gerenciamento detalhado de contratos, incluindo informações sobre vínculo, cargo, rescisão e salário.
- **AbaDocumentacao.java**: Gestão de documentos importantes, como RG, CNH, PIS, CTPS, entre outros.
- **AbaOperacional.java**: Administração de dados operacionais, incluindo opções de benefícios, dados bancários, e informações sindicais.
- **AbaAgradecimentos.java**: (exemplo de uma aba adicional que pode ser personalizada conforme necessário).
- **AbaVaicorintha.java**: Uma aba extra personalizada (indicada apenas como exemplo ou para funções adicionais não especificadas).

## Como Executar

### Pré-requisitos

- JDK 8 ou superior
- Maven 3.6 ou superior

### Passos para Execução

1. Clone o repositório:

   ```bash
   git clone <url_do_repositorio>

Documentação
A documentação interna do código e as explicações detalhadas sobre cada aba e funcionalidade podem ser encontradas diretamente nos comentários do código-fonte.

Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork do projeto e enviar um pull request com melhorias ou novas funcionalidades.

Segurança
Para informações sobre vulnerabilidades de segurança, consulte o arquivo SECURITY.md (se aplicável).
