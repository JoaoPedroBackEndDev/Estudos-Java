# 🧮 Calculadora com Tratamento de Exceções em Java

Este projeto é uma calculadora simples desenvolvida em **Java** para praticar **tratamento de exceções** e o uso da estrutura `switch`.  
A calculadora recebe dois números e um operador simples (`+`, `-`, `*`, `/`) e retorna o resultado da operação.

## 🚀 Funcionalidades
- Operações básicas: soma, subtração, multiplicação e divisão
- Tratamento de **divisão por zero** (`ArithmeticException`)
- Tratamento de **operador inválido** (`IllegalArgumentException`)
- Tratamento de **entrada inválida** quando o usuário digita algo que não seja número (`InputMismatchException`)
- Código organizado em **classe separada** para a lógica (`Calculadora`) e uma classe principal (`Main`) para entrada/saída de dados

## 📂 Estrutura do Projeto
```
CalculadoraSwitch/
│
├── src/
│   ├── model/entities/
│   │   └──Calculator.java   # Contém o método calcular()
│   └── application/
│       └── Program.java          # Contém a entrada de dados e chamadas à Calculadora
└── README.md
```

## 💻 Exemplo de Uso
```bash
Enter a number: 10
Enter a operator (+, -, *, /): /
Enter a second number: 2
Result: 5.00
```

Exemplo de tratamento de erro:
```bash
Enter a number: abc
Error: Input not accepted
```

## 🛠 Tecnologias Utilizadas
- Java 17 (funciona também em versões anteriores)
- IntelliJ IDEA (para desenvolvimento)

## 📚 Conceitos Praticados
- Estrutura `switch`
- Tratamento de exceções com `try-catch`
- `ArithmeticException`, `IllegalArgumentException` e `InputMismatchException`
- Criação e utilização de classes
- Separação de responsabilidades no código

## ▶️ Como Executar
No terminal:
```bash
javac Calculator.java Program.java
java Program
```

## 📜 Licença
Este projeto está sob a licença MIT. Sinta-se livre para utilizar e modificar.
