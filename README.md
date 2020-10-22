# Instruções gerais
Este arquivo serve para descrever itens básicos e necessários para rodar a aplicação.

#### Instalações necessárias
* [Java 8] (https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html)
* [IntelliJ IDEA], selecionar versão Community (https://www.jetbrains.com/pt-br/idea/download/) 
* [Gradle], baixar última release. Necessário registrar no path (https://gradle.org/releases/)
* [Docker], atentar os pré-requisitos (https://docs.docker.com/docker-for-windows/install/) 
* [Git] (https://git-scm.com/downloads)

#### Como baixar o projeto e rodar
Com o git instalado, abra o gitbash em um diretório desejado e rode o comando abaixo:

```
git clone https://github.com/stack-java-criciuma/first-api.git 
``` 

Após isso abra o IntelliJ e selecione o botão 'Open or import', e selecione a pasta do projeto start-template.
Isso vai fazer com que o projeto seja aberto e as dependencias sejam carregadas.

Na sequencia temos que abri o terminal para subir o banco, então é so abrir e digitar o comando abaixo:

```
docker-compose up
```

Na sequencia é so localizar no projeto a classe StartTemplateApplication e clicar no botão verde que irá aparecer sobre o nome da classe.