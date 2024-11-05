/*let myLuckyNumber = 32;
let myName = "Amanda";
const MESSAGE = "      TASTE THE RAINBOW! ";
let whisper = MESSAGE.toLowerCase().trim() ;
// trim - retorna uma nova string com os espaços removidos antes e depois.



console.log(whisper);
alert(whisper);
alert(myName + ' idade: ' + myLuckyNumber)*/

/*const WORD = 'skateboard';
let procurarLetra = WORD.indexOf('b');
let retiraBoard = WORD.slice(0, 5);
console.log(retiraBoard);
let facialHair = WORD.replace('o', 'e');
console.log(facialHair);*/

//Retirar a parte board da constante.
// replace - substituir o O pelo E
// guardar o resutado na variavel facilHair

//let myName = prompt('Qual o nome?');
//console.log(myName);

/*let diaSemana= prompt('Qual o dia da semana').toLowerCase().trim();

switch(diaSemana){
    case('segunda'):
        document.write(diaSemana + '<h2>Foco!</h2>');
        break;
    case('terça'):
        document.write('<h2>Foco!</h2>');
        break;
    case('quarta'):
        document.write('<h2>Foco!</h2>');
        break;
    case('quinta'):
        document.write('<h2>Foco!</h2>');
        break;
    case('sexta'):
        document.write('<h2>yay, sobrevivemos a mais uma semana!</h2>');
        break;
    default:
        document.write('<h2>Dia invalido</h2>');
        break;
    }

let password = prompt('Digite a password');
let tamanhoString = password.length;
    console.log(tamanhoString);  
    if (tamanhoString < 6) {
        document.write('<h2>Erro: Dia da semana deve ter pelo menos 6 caracteres!</h2>');
      } else {
        document.write('<h2>Entrou!</h2>');
      }*/

/*1. Cria um array de planetas: Mercúrio, Vénus, Terra, Mart, Jupiter, Saturno, 
Urano, Neptuno, Plutão.
2. Mart foi escrito mal. Substitui pelo nome correcto, Marte.
3. Ups, o planeta Plutão foi removido do Sistema Solar.. Utilizando os métodos dos 
arrays, remove o planeta da lista.
4. Descobriste um novo planeta, yaaay. Inventa um nome e adiciona ao início do 
array.
5. Faz console.log() do array e verifica se está certo.*/

/*let planetas = ['Mercúrio', 'Vénus', 'Terra', 'Mart', 'Jupiter', 'Saturno'];

planetas[3] = 'Marte';

// Remover o ultimo
planetas.pop();

planetas.forEach((item, index) => {
    document.write(`${index}: ${item}<br>`);
  });

//Descobriste um novo planeta, yaaay. Inventa um nome e adiciona ao início do array.
planetas.unshift('AmandinhaXavier');

//forEach: O array completo que está sendo percorrido.

document.write('yaaay, DESCOBRI UM NOVO PLANETA: <br>')
planetas.forEach((item, index) => {
    document.write(`${index}: ${item}<br>`);
  });*/

/*const airplaneSeats = [
    ['Ruth', 'Anthony', 'Stevie'],
    ['Amelia', 'Pedro', 'Maya'],
    ['Xavier', 'Ananya', 'Luis'],
    ['Luke', null, 'Deniz'],
    ['Rin', 'Sakura', 'Francisco']
];

airplaneSeats[3][1] = 'Amanda'
console.log(airplaneSeats)*/

/** nome e assigna-lhe um nome à tua escolha.
• inStock, como verdadeiro.
• Price com o valor 1.99
• Colors, com um array de vermelho, azul e verde;

. Imprime na consola os seguintes valores:
• Price
• Cor Verde
3. Ups, a inflacção chegou à nossa loja. Muda o valor do produto para 2.55
 */

/*let ex = {
    name: 'Ice Tea',
    inStock : true,
    price : 1.99,
    colors: ['vermelho', 'azul','verde'],
}
 
console.log("Preço: " + ex.price);
console.log("Cor verde: " + ex.colors[2]);

ex.price = 2.55;

console.log(ex)*/


// Lista vazia para guardar
/*let numeros = [];

for(let i = 5; i<26; i += 5){
    numeros.push(i);
}

console.log(numeros)

console.log(numeros.reverse())*/

/** 1. Declare o seguinte array:
const people = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"];
2. Imprima na página os nomes em letra maiúscula.
 */

const people = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"];

for(let i = 0; i < people.length; i++) {
    console.log(people[i].toUpperCase());
}