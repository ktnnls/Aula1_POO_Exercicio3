# Aula1_POO_Exercicio3
Armazenando alguns exercícios da faculdade ADS Uninter, Matéria Programação Orientada a Objetos em JAVA.

Este código em Java permite ao usuário inserir uma lista de nomes e exibe essa lista em duas ordens: na ordem original de entrada e na ordem reversa. Ele utiliza ArrayList para armazenar os nomes e Collections.reverse para inverter a ordem.

Funcionamento
Definição de Variáveis e Entrada de Dados:

Um objeto Scanner é criado para capturar a entrada do usuário.
A variável qtd define a quantidade de nomes a ser inserida, que o usuário especifica.
O programa armazena os nomes em um ArrayList<String>, adicionando um nome a cada iteração do laço for.
Impressão da Lista em Ordem Normal e Reversa:

Após a entrada de todos os nomes, a lista é exibida na ordem de entrada.
Em seguida, Collections.reverse é aplicado para inverter a ordem dos elementos.
A lista invertida é então exibida, mostrando os nomes na ordem reversa.
Fechamento do Scanner:

O Scanner é fechado após o uso, garantindo o correto gerenciamento de recursos.

Exemplo:
Digite a quantidade de nomes: 3
Digite o nome 1: Ana
Digite o nome 2: Bruno
Digite o nome 3: Carlos


Saída:
Copiar código
Ordem normal:
[Ana, Bruno, Carlos]

Ordem reversa:
[Carlos, Bruno, Ana]
