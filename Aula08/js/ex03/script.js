/*Crie uma função que imprime de 10 até 1 e depois imprime na
tela “feliz ano novo” através de uma callback*/

function contagem(callback){
    setTimeout( function(){
      for(let i=10; i>0; i--)
      console.log(i);
      callback();
    }, 3000 );
  }
  
  function anoNovo(){
    console.log( 'Feliz ano Novo!' );
  }
  
  contagem( anoNovo );
  