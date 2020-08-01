

let numeroPrimo =(num)=> {

    let primo = `O número ${num} é primo`;
    let naoePrimo = `O número ${num} não é primo`;
    let resultado = naoePrimo;
    
    for (i = 2; i < num; i++) {
        resultado = primo
    	if (num % i === 0) {
    		resultado = naoePrimo;
    		break;		
    	}
    }
    if (num === 2) {
    	resultado = primo;
    }
    
    return console.log(resultado);
    
};
numeroPrimo(13);

