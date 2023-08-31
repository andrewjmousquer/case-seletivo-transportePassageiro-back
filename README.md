# Case: Sistema de Controle de Abastecimento para Transporte de Passageiros Back-End

Repositório destinado ao teste de requisitos para processo seletivo para um sistema de Controle de Abastecimento para Transporte de Passageiros - Back-End

---
## Requisitos

Para o desenvolvimento, você precisará do Java JDK, Maven e um ambiente de desenvolvimento integrado (IDE), como o IntelliJ IDEA ou o Eclipse.

### Java JDK
- Faça o download e instalação do [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) de acordo com o seu sistema operacional.

### Maven
- Faça o download e instalação do [Apache Maven](https://maven.apache.org/download.cgi) de acordo com o seu sistema operacional.

### IDE (IntelliJ IDEA ou Eclipse)
- Escolha uma IDE de sua preferência e instale-a.

Certifique-se de ter o Git instalado em seu ambiente (você pode encontrar o Git [aqui](https://git-scm.com/)).

Se a instalação foi bem-sucedida, você poderá executar o comando a seguir.

    $ java --version   
    openjdk 17.0.8.1 2023-08-24
    OpenJDK Runtime Environment Temurin-17.0.8.1+1 (build 17.0.8.1+1)
    OpenJDK 64-Bit Server VM Temurin-17.0.8.1+1 (build 17.0.8.1+1, mixed mode, sharing)

    $ mvn --version
    Apache Maven 3.9.4 (dfbb324ad4a7c8fb0bf182e6d91b0ae20e3d2dd9)
    Maven home: C:\Program Files\apache-maven-3.9.4
    Java version: 17.0.8, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-17
    Default locale: pt_BR, platform encoding: Cp1252
    OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

---
## Instalação e Execução

1. Clone o repositório:

    git clone https://github.com/seu-usuario/case-seletivo-transportePassageiro-back.git
    cd backend
    mvn install
    mvn spring-boot:run

    OBS: Vc precisa ter o frontend git clone https://github.com/andrewjmousquer/case-seletivo-transportePassageiro-front.git para executar esse projeto: segue as instruções do readme front.

    

2. Abra o projeto em sua IDE e aguarde a indexação.

3. Execute o projeto:
   
   - Encontre a classe principal do projeto, geralmente anotada com `@SpringBootApplication`.
   - Execute a aplicação clicando com o botão direito nessa classe e escolhendo a opção "Run".

A aplicação estará disponível em: http://localhost:8080.

---
## Configurações do Banco de Dados

Este projeto utiliza o banco de dados H2 para fins de demonstração. As configurações de conexão com o banco de dados podem ser encontradas no arquivo `src/main/resources/application.properties`.

---
MUITO OBRIGADO!!!! =)

ATT: ANDREW J MOUSQUER - DEV-SOFT
