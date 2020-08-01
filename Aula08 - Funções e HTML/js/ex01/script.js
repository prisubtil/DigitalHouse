//Crie uma função que recebe um número e verifica se ele é parou ímpar.
function parImpar(numero) {
    
        console.log(numero % 2 == 0? "Par": "Impar");
    }

    var readlineSync = require('readline-sync');
    var numero = readlineSync.questionInt('Digite um numero para saber se e PAR ou IMPAR: ');
    console.log(parImpar(numero));

//for(let i = 10; i <= 15; i++) {