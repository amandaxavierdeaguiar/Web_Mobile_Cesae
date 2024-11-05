//Variaveis de Controle
let numero = '';
let operacao = '';
let resultado = 0;
let novoNumero = true; // Se o numero foi inserido

function adicionarNumero(num) {
    numero += num;
    document.getElementById("display").innerText = numero;
}

function adicionarOperacao(ope) {
    numero += ' ' + ope + ' ';
    operacao = ope;
    document.getElementById("display").innerText = numero;
}

function calcular() {
    let numeros = numero.split(operacao); 
    // a string numero é dividida em dois elementos, separados pelo operador.
    let num1 = parseFloat(numeros[0]);
    let num2 = parseFloat(numeros[1]);
    // Esta guardando em um array os dois elementos separados pelo split

    if (operacao === '+'){
        resultado = num1 + num2;
    } else if (operacao === '-'){
        resultado = num1 - num2;
    } else if (operacao === '*'){
        resultado = num1 * num2;
    } else if (operacao === '/'){
        resultado = num1 / num2;
    }
    document.getElementById("display").innerText = resultado;
    numero = '';
    operacao = '';
    novoNumero = true; // Resetar para iniciar um novo
}

function limpar() {
    numero = '';
    operacao = '';
    resultado = 0;
    novoNumero = true; // Resetar para iniciar um novo
    document.getElementById("display").innerText = '0';
}

