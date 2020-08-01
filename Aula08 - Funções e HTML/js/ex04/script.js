//Crie uma função que imprime de 10 até 1 e depois imprime na
//tela “feliz ano novo” através de Promise com concatenação de then

const contagem = new Promise((resolve, reject) =>{
    setTimeout(function(){
        for(let i=10; i>0; i--){
        resolve(console.log(i));
        };
    }, 3000 )
})

const anoNovo = new Promise((resolve, reject) =>{
    resolve('Feliz Ano Novo!');
})

contagem.then(function(res) {return console.log(res)})
.then(function() {return anoNovo})
.then(function(res){return console.log(res)});