# Etapa 1: Build da aplicação
FROM maven:3.9.8-eclipse-temurin-21 AS build
WORKDIR /app

# Copiar os arquivos necessários para o Maven resolver as dependências
COPY pom.xml .
COPY src ./src

# Compilar o projeto, sem rodar os testes
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final apenas com o jar
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copiar o jar compilado da imagem anterior
COPY --from=build /app/target/*.jar app.jar

# Expor a porta da aplicação
EXPOSE 8084

# Comando de entrada
ENTRYPOINT ["java", "-jar", "app.jar"]