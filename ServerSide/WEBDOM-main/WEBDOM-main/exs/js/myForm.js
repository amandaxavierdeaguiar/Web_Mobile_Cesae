const form = document.querySelector('form');
const inputValor = document.querySelector('#valor');
const inputItem = document.querySelector('#item');
const list = document.querySelector('#valorList')

form.addEventListener("submit", function(e){
    e.preventDefault();
    const valorUser = inputValor.value;
    const inputUser = inputItem.value;
    const newLi = document.createElement('li');
    newLi.innerText = 'Item: ' + inputUser + ' Quantidade: ' + valorUser;
    list.append(newLi);
    inputItem.value = "";
    inputValor.value = "";
});