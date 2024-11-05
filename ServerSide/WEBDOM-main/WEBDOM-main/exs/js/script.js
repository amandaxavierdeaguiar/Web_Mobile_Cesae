/* EXERCICIO 1 */

/*const image = unicorn;
console.log('Clicou no texto: ' + image);

const mainheadingTXT = mainheading
console.log('Clicou na imagem'+ mainheadingTXT);
*/

/* EXERCICIO 2 */

/*const doneTodos = document.querySelectorAll('.done');

const checkbox = document.querySelector('input[type="checkbox"]');

console.log(doneTodos);
console.log(checkbox);*/

/* EXERCICIO 3 */

/*const changeH1 = document.querySelector('span').innerText = 'Yack';
console.log (changeH1);*/

/* EXERCICIO 4 */ 

/*function btnImage(){
    
    const imgChicken = document.querySelector('img');
    //console.log(imgChicken.getAttribute('img'));

    if (imgChicken == "https://devsprouthosting.com/images/egg.jpg") {
        console.log(imgChicken.getAttribute('img'));
    } else {
        imgChicken.setAttribute('src', 'https://devsprouthosting.com/images/chicken.jpg');
    }   
}*/

/** CORREÇÃO */


/*function btnImage(){
    let myImage = document.querySelector('img');

    
    
    //myImage.setAttribute('src' , 'https://devsprouthosting.com/images/chicken.jpg');

    if (myImage.src == 'https://devsprouthosting.com/images/chicken.jpg') {
            myImage.setAttribute('src', 'https://devsprouthosting.com/images/egg.jpg');
        } else {
            myImage.setAttribute('src', 'https://devsprouthosting.com/images/chicken.jpg');
        }   
    }*/


/* EXERCICIO 5 */

/*let container = document.querySelector('#container');
let img = document.querySelector('img');
container.style.textAlign = 'center';
img.style.width = '150px';
img.style.borderRadius = '50%';*/

/* EXERCICIO 6 */

/*const colors = ['red', 'orange', 
'yellow', 'green', 'blue', 'indigo', 'violet'];

for(let i = 0; i<colors.length; i ++){
    const allColor = document.querySelectorAll('span');
    allColor[i].style.backgroundColor = colors[i];
}*/

/** EXERCICIO BUTTONS */


/*let myContainer = document.querySelector('#container');

for(let i=1; i<101; i++){
    let myButton = document.createElement('button');
    myButton.innerText = 'Button' + i;

    myContainer.appendChild(myButton);
}*/

let hello = document.getElementById('hello');
let goodBye = document.getElementById('goodbye');

function helloGoodBye(message){
    alert(message)
}

hello.addEventListener('mouseover', () => {
    helloGoodBye('hello')})

goodBye.addEventListener('mouseover', () => {
    helloGoodBye('Good Bye')})

let colorsBtn = document.querySelector('#change-color');
let newColor = document.querySelector('#new-color');
myBackground = document.querySelector('#container');

colorsBtn.addEventListener('click', () => {
    let color = makeRandColor();
    myBackground.style.backgroundColor = color;
    newColor.innerText = color;
})

const makeRandColor = () =>{
    const r = Math.floor(Math.random() * 256);
    const g = Math.floor(Math.random() * 256);
    const b = Math.floor(Math.random() * 256);

    return `rgb(${r}, ${g}, ${b})`;
}
    
/*let colorsBtn = document.querySelector('#change-color');
colorsBtn.addEventListener('click', newColor);

function newColor() {
    const newColor = makeRandColor();
    this.style.backgroundColor = newColor;
}

const makeRandColor = () =>{
    const r = Math.floor(Math.random() * 256);
    const g = Math.floor(Math.random() * 256);
    const b = Math.floor(Math.random() * 256);

    return `rgb(${r}, ${g}, ${b})`;
}*/


