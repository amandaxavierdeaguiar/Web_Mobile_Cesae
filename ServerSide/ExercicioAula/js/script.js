/*let desserts = ['pudim', 'natinha', 'bolo chocolate', 'pavê']

for (let i=0; i<desserts.length; i++){
    console.log(desserts[i]);
}

for(let element of desserts){
    console.log(element);
}

for(let item in desserts){
    console.log(item, desserts[item]);
}*/

/*let opcao = prompt('Bem vindo, aperte qualquer tecla para continuar')
let compras = []

while(true){
    
    let input = prompt('Adicione um item:')
    compras.push(input)

    console.log(compras);
    let opcao2 = prompt('Lista de Compras: [ 1 ] - Adicionar Item [ 0 ] - Sair')
    if (opcao2 == 0){
        break
    }
}*/

/*let compras = [];
let item = '';

while(item != 'fim'){
    item = prompt('Adicione um item: ').toLowerCase;
    compras.push(item);
}

compras.pop();
for (let list of compras){
    console.log(list);
}*/

function listaCompras(){
    let compras = [];
    let item = '';

    while(item != 'fim'){
        item = prompt('Adicione um item: ').toLowerCase();
        compras.push(item);
    }

    compras.pop();
    for (let list of compras){
        console.log(list);
    }
}

function rant(message){
    /*1. Escreva uma função chamada rant que aceite um argumento chamado 
    message.
    2. A função deverá ser associada a um botão que, quando clicado, deverá 
    imprimir o que utilizador quiser definir como mensagem 3 vezes em letra 
    maiúscula.*/

    for (let i=0; i<3; i++){
        console.log(i+1, message.toUpperCase());
    }
}