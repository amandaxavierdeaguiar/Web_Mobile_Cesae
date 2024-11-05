/*let num1 = '5';
let num2 = '3';
let jsDone = true;

function helloStudent(name, age){
    console.log('Olá' + name);
    return age;
}

let hello = helloStudent('Rita', 31);
let age = helloStudent('Rita', 31);*/

let password = [1234, 'sara1986', 2023];
let userPassword = prompt('Qual é a sua password?');

/*if(password[0] == userPassword){
    alert('Acertou a password')
} else{
    alert('Não acertou')
}*/

/*if(password.find(userPassword)){
    alert('Acertou a password')
} else{
    alert('Não acertou')
}*/


if (password.includes(userPassword)) {
    alert('Acertou a password')
} else {
    alert('Não acertou')
}

/*if (password.includes(userPassword)){
    alert('Acertou a password');
} else {
    alert('Não acertou');
}*/

password.push(123454566756765);
//4.3


let safePasses = password.filter(password => password.toString().length > 6);

console.log(safePasses);

safePasses.forEach((item) => {
        console.log(`${item}`);
})



/*const studentGrades =[
    {
        'studentName': 'Rita', 
        'grade': 16,
        nameAndGrade(){
            return `A ${this.studentName} tem nota ${this.grade}`
        }
    },
    {
        'studentName': 'Luis', 
        'grade': 20,
    },
    {
        'studentName': 'Joao', 
        'grade': 18,
    },
    {
        'studentName': 'André', 
        'grade': 15,
    },
    {
        'studentName': 'Luísa', 
        'grade': 19,
    }
]

studentGrades.forEach(function (student){
    console.log(`A nota da ${student.studentName} é ${student.grade}`);
});*/

/** Substitua “A minha Lista de Aprendizagens como Web Developer” por “Os meus 
ensinamentos para a vida”. */


/*let mudarNome = document.querySelector('h2');
mudarNome.textContent= 'Os meus ensinamentos para a vida';

let listItems = document.querySelectorAll('#myList li');

for (let i = 0; i < listItems.length; i++){ 
    listItems[i].innerText += ' - aprendido'; 
}
let btnUser = document.querySelector('button');
let promptUser = document.querySelectorAll('#myItem');

btnUser.onclick = function(){
    let newUserSkill = document.createElement('li');
    newUserSkill.innerText = promptUser;
    container.appendChild(newUserSkill);
    listItems.push(newUserSkill);
}*/

// Substitua “A minha Lista de Aprendizagens como Web Developer” por “Os meus ensinamentos para a vida”.
/*let mudarNome = document.querySelector('h2.achievements');
mudarNome.textContent = 'Os meus ensinamentos para a vida';

let listItems = document.querySelectorAll('#myList li');

for (let i = 0; i < listItems.length; i++) { 
    listItems[i].innerText += ' - aprendido'; 
}

const form = document.querySelector('form');
form.addEventListener('submit', function (e) {
    e.preventDefault();
    
    let promptUser = document.querySelector('#myItem').value;
    
    if (promptUser.trim() !== '') {
        let newUserSkill = document.createElement('li');
        newUserSkill.innerText = promptUser + ' - aprendido';
        
        let list = document.querySelector('#myList');
        list.appendChild(newUserSkill);
        
        document.querySelector('#myItem').value = '';
    }
});*/