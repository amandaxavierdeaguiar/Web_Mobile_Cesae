/* Na matemática, a sucessão de Fibonacci, é uma sequência de números inteiros, começando normalmente por 0 e 1, na qual cada termo subsequente corresponde à soma dos dois anteriores. */

function finacci() {
    // Variáveis
    let inputUsuario = document.getElementById("inputUser").value;
    let a = 0;
    let b = 1;
    let count = 0;
    let sequencia = "";
  
    if (inputUsuario <= 0) {
      alert("Por favor, insira um número maior que 0");
    } else if (inputUsuario == 1) {
      document.getElementById("sequencia").innerText = "A Sequencia Fibonacci até o " + inputUsuario + ":" + a;
    } else {
      while (count < inputUsuario) {
        sequencia += a + " ";
        let nth = a + b;
        a = b;
        b = nth;
        count += 1;
      }
      document.getElementById("sequenciaFibonacci").innerText = "A Sequencia Fibonacci até o " + inputUsuario + ":" + sequencia;
    }
  }

