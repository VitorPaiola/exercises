# 📌 Cálculos Matemáticos em Java

Este repositório contém diversos programas em Java para resolver problemas matemáticos comuns, como cálculo de média salarial, conversão de temperatura, quantidade de azulejos para cobrir uma parede, entre outros.

## 🚀 Tecnologias Utilizadas

- Java (JDK 8+)
- Scanner para entrada de dados do usuário
- Estruturas de controle (loops, condicionais)
- Métodos para modularização do código
- Formatação de saída (`printf`)

## 📂 Estrutura do Projeto

📦 Calculos-Java  
├── 📁 src  
│   ├── 📁 Cavalos  
│   │   ├── Cavalos.java  
│   ├── 📁 HomensMulheres  
│   │   ├── HomensMulheres.java  
│   ├── 📁 LataOleo  
│   │   ├── LataOleo.java  
│   ├── 📁 MediaSalario  
│   │   ├── MediaSalario.java  
│   ├── 📁 Parede  
│   │   ├── Parede.java  
│   ├── 📁 Temperatura  
│   │   ├── Temperatura.java  
└── README.md

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**
Abra o terminal e navegue até a pasta `src` do projeto. Em seguida, execute:

```sh
javac -d . NomeDaPasta/NomeDoArquivo.java
```

Por exemplo, para compilar o programa de cálculo de média salarial:

```sh
javac -d . MediaSalario/MediaSalario.java
```

### 2️⃣ **Executar**
Após a compilação, execute o programa com:

```sh
java NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java MediaSalario.MediaSalario
```

## 📌 Descrição dos Programas

### 🏇 **Cavalos**

Calcula a quantidade de cavalos necessários para levantar uma massa de `m` kg a uma altura `h` metros em `t` segundos.

📌 **Fórmula:**  
```java
cavalos = (massa * altura / tempo) / 745.6999;
```

### 👥 **HomensMulheres**

Solicita ao usuário a quantidade de homens e mulheres em um grupo e calcula a porcentagem de cada um.

### 🏗️ **Parede**

Calcula a quantidade de azulejos necessários para cobrir uma parede retangular, dada a altura e largura da parede e do azulejo.

📌 **Fórmula:**
```java
qtdAzulejos = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);
```

### 🥫 **LataOleo**

Calcula o volume de uma lata de óleo cilíndrica, com base no raio r e altura h.

📌 **Fórmula:**
```java
volume = 3.14159 * r * r * h;
```

### 📊 **MediaSalario**

Calcula a média salarial de uma empresa, solicitando ao usuário a quantidade de funcionários e os respectivos salários.

📌 **Fórmula:**
```java
mediaSalarial = somaSalarios / totalFuncionarios;
```

### 🌡️ **Temperatura**

Converte a temperatura de Celsius para Fahrenheit e vice-versa.

📌 **Fórmulas:**
```java
fahrenheit = (celsius * 9/5) + 32;
celsius = (fahrenheit - 32) * 5/9;
```

### 📜 **Licença**

Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais. Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**

Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos cálculos ou funcionalidades, sinta-se à vontade para abrir um Pull Request. Estamos ansiosos para ver suas melhorias! 😃
