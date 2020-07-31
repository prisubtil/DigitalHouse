/*1. Criar e definir 5 variáveis com os seguintes valores:
a. Um número inteiro positivo*/
var num1 = 1;
//b. Um número inteiro negativo
var num2 = -1;
//c. Um número decimal
var num3 = 1.3;
//d. Uma string
var nome = 'Priscila';
//e. Um valor verdadeiro
var falso = false;

//2. Agora imprima as variáveis acima usando a função console.log()
console.log(num1,num2,num3,nome,falso);

/*3. Criar e definir 2 variáveis (nome e sobrenome) e imprimir a
concatenação das variáveis adicionando um espaço no meio.*/
var nome = 'Priscila';
var sobrenome = 'Subtil';
console.log(`O nome completo é ${nome} ${sobrenome}.`)

//4. Experimente executar o seguinte código:

/*var nome = 'Clara';
console.log(Nome);   dá erro */ 

/*O que acontece?
5. Experimente executar o seguinte código:*/

var nome = 'Clara';
console.log(nome, sobrenome);

/*O que acontece? Por quê?
6. Escrever um texto em mais de uma linha e imprimir usando a
função console.log()

var frase = 'Isto é um parágrafo. \n
Este é outro parágrafo';

console.log(frase);*/

/*7. criar 2 variáveis valorNulo e naodefinido, definindo os valores
respectivamente como “null” e “undefined”, e imprimir as duas
variáveis utilizando a função console.log().*/
var valorNulo = null;
var naodefinido = undefined;
console.log(valorNulo,naodefinido);

/*8. Criar um array com 5 frutas diferentes e imprimir utilizando a
função console.log().*/
var frutas = ['Maçã, Banana, Abacaxi, Morango, Maracujá'];
console.log(frutas);

/*9. Criar uma variável de uma string com o texto: “Digital House, a
escola de programação que forma novas gerações de coders e
profissionais digitais para imaginar, inovar
e criar o que sempre sonharam.”
var digitalHouse = "Digital House, a escola de programação que forma novas gerações \n
 de coders e profissionais digitais para imaginar, inovar e criar o que sempre sonharam."; */
var lista = [10,20,30]
for(var l in lista){
    console.log(l);
    console.log(lista[l]);
}

var objeto{
    Nome: 'Priscila',
    Sobrenome: 'Subtil'
};
