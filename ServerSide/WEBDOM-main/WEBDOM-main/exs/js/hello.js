let btnHello = document.getElementById('hello');
let btnGoodbye = document.getElementById('goodbye');
let changeColor = document.getElementById('change-color');
let newColor = document.getElementById('new-color');
let MyBg = document.querySelector('#container');

function changeColorF(){
    const newColorN = generateColor()
    this.style.backgroundColor = newColorN;
    console.log(newColorN)
}

function getRandomInt(){
    return Math.floor(Math.random() * 256);
    
}
function generateColor(){
    let myGeneratedColor = 'rgb('+getRandomInt()+','+getRandomInt()+','+getRandomInt()+')'
    return myGeneratedColor;
}

btnHello.addEventListener('click', changeColorF);
btnGoodbye.addEventListener('click', changeColorF);
changeColor.addEventListener('click', changeColorF);
newColor.addEventListener('click', changeColorF);
MyBg.addEventListener('click', changeColorF);