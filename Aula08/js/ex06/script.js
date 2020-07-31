/*6. Crie um array com as seguintes notas [5.3, 4.7, 8.5, 7.1, 6.4, 9.2,
    9.8, 5.5, 7.4, 7.0], construa uma função para imprimir apenas as
    notas acima de 7*/

    let notas = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2,9.8, 5.5, 7.4, 7.0];
    console.log(notas.filter(function(numero){
        return (numero >= 7);
    }));
   

    