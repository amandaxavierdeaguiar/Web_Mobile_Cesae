let num1=document.getElementById('num1');
let num2=document.getElementById('num2');
let op=document.getElementById('op');
let totalR=document.getElementById('total');
let result = document.getElementById('result');

result.addEventListener('click', function(){
    let total = 0
    num1 = num1.value;
    num2 = num2.value;

    switch(op.value){
        case '+':
        total = Number(num1) + Number(num2); // Para não contatenar!
        break;
        case '-':
        total = num1 - num2;
        break;
        case '/':
        total = num1 / num2;
        break;
        case '*':
        total = num1 * num2;
        break;      
    }
    totalR.innerText = total;
})