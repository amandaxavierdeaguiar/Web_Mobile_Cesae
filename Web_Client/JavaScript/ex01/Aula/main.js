// Criar uma função para calcular

function calcularSoma(){

    // Variavel valor A
    let valorA = parseInt(document.getElementById("inputValorA").value) // ParseInt, passar o String para Inteiro

    // Variavel valor B
    let valorB = parseInt(document.getElementById("inputValorB").value)

    // Variavel para guardar o Resultado
    let resultadoSoma = valorA + valorB

    // alert("O resultado da funcao é" + resultadoSoma)

    document.getElementById("textoResultado").innerText = "Resultado é: " + resultadoSoma
}

function compararOpe(){
    //Tipo de Dado

    //Guardar o dado numa variavel
    let tipoDado = document.getElementById("inputTipoDado").value

    //Comparacao
    if (tipoDado === "+"){
        calcularSoma();
    } else if (tipoDado === "-"){
        calcularSubtracao();
    }
}