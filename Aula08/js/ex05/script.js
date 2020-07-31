//Crie uma função que imprime de 10 até 1 e depois imprime na
//tela “feliz ano novo” através de async/await
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

const asyncFunction = async () =>{
    try{
        const firstPart = await contagem;
        const secondPart = await anoNovo;
        console.log(firstPart)
        console.log(secondPart);
    }
    catch (err){
        console.log(err);
    }
}

asyncFunction();