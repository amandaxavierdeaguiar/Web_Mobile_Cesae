function numero(){

    // Variaveis
    let inicio = document.getElementById("rangeIncio").value;
    let fim = document.getElementById("rangeFim").value;

    let numerosPares = ''
    let numerosImpares = ''
    //For(inicializacao, comparacao, incremento)


    for(var i = inicio; i <= fim; i++){
        if(i % 2 === 0){
            numerosPares += i + ' '
        } else(
            numerosImpares += i + ' '
        )
    }
    document.getElementById("textoNumerosPares").innerText = "Os números pares [" + numerosPares + "]" 
    document.getElementById("textoNumerosImpares").innerText = "Os números impares são: " + numerosImpares+ "]" 
}