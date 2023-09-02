# Java Essentials

<br>

## Variáveis e Tipos de dados

- byte (-128 | 127)
- short (-32768 | 32767)
- int (-2.147.483.648 | 2.147.483.647) 
- long
- double (dupla precisão)
- float (precisão simples)
- chat
- boolean

<br>

## Operadores

- atribuição ( = )
- matemáticos ( + | * | / | % )
- incremento / decremento ( ++ | -- )
- igualdade ( == | != )
- relacionais ( < | > | <= | >= )
- lógicos ( || - && )

<br>

## Condicionais

- ( if | else | else - if )
- ( switch case )

<br>

## Repetição

- ( for | while | do - while )

<br>

## Array

- Estrutura de dados para armazenar uma coleção de elementos;
- Modo 1 | declarando um array: int[ ] array;
- Modo 2 | declarando um array: int[ ] array = new int[numero de elementos];
- Modo 2 | declarando um array: int[ ] array = {1, 2, 3, 4, 5};
- Tamanho o array: array.length;
- Copiando um array: Arrays.copyOfRange(array, [index - início] , [index - fim]);
- Copiando um array: Arrays.copyOf(array, [quantidade de index]);
- Comparando 2 arrays: Arrays.equals(array1, array2));
- Ordenando um array: Arrays.sort(sorted);

<br>

## Encapsulamento

- Private: acesso dentro da classe;
- Public: todo o projeto tem acesso;
- Protected: acesso dentro do pacote;

<br>

## Abstração

- Classe abstrata: Pode ter métodos com ou sem implementação, campos com estado, e suporta herança única (extends);
- Interface: Apenas métodos abstratos, não pode ter campos com estado, e suporta herança múltipla (implements);

<br>

## Polimorfismo

- Sobrescrita: classe filha fornece uma implementação específica para um método já definido em sua classe pai, mantendo a mesma assinatura;
- Sobrecarga: vários métodos na mesma classe com o mesmo nome, mas com diferentes parâmetros;