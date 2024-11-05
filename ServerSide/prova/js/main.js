// selecionando o container resultado e criando um botao para limpar tudo
function createContainer() {
    let container = document.createElement('div');
    container.className = 'exercise-container';
    let backButton = document.createElement('button');
    backButton.className = 'btnBack';
    backButton.innerHTML = '&#8592;';
    backButton.onclick = () => {
      container.remove();
      // Para remover tambem o container dos resultados
      document.querySelector('.resolution').classList.remove('show');
    };
    container.appendChild(backButton);
    let resolution = document.querySelector('.resolution');
    resolution.classList.add('show'); // Deixar visivel novamente
    resolution.appendChild(container);
    return container;
  }

function Exercicio1() {
    let container = createContainer();

    let text = 'A turma de Web é dinâmica e tem as características essenciais para brilhar numa empresa';
    alert(text);

    let imprimeU = document.createElement('h6');
    imprimeU.innerText = 'Primeira ocorrência da letra “u”: ' + text.indexOf('u');
    let imprimeW = document.createElement('h6');
    imprimeW.innerText = 'Primeira ocorrência da letra “W”: ' + text.indexOf('W');
    let imprimeLength = document.createElement('h6');
    imprimeLength.innerText = 'Tamanho da String: ' + text.length;
    container.appendChild(imprimeU);
    container.appendChild(imprimeW);
    container.appendChild(imprimeLength);

  }

function Exercicio2(){

    let container = createContainer();

    myWishList = ['Brasil' , 'Japão', 'Hawai' , 'Madeira', 'Açores'];

    let giftList = document.createElement('h6');
    giftList.innerText = 'Lista de prendas: ';
    container.appendChild(giftList);
    
    for (let list of myWishList){
        let imprimeList = document.createElement('h6');
        imprimeList.innerText = 'Viagem para o ' + list;
        container.appendChild(imprimeList);
    }

    let imprimeLength = document.createElement('h6');
    imprimeLength.innerText = 'A lista de desejos tem: ' + myWishList.length + ' itens';
    container.appendChild(imprimeLength);
}

function Exercicio3(){
    let container = createContainer();
    
    let cheapObject = [];

    let object = [
        {name: 'Perfume', price : 45.00,},
        {name: 'Base', price : 19.90,},
        {name: 'Batom', price : 15.90,},
        {name: 'Lápis de Olho', price : 19.90,},
        {name: 'Calça jeans', price : 35.90,},
        {name: 'Blazer', price : 38.90,},
        ]
    
        
        for (i=0; i<object.length; i++){
            if (object[i].price < 20.00){
                cheapObject.push(object[i])
            } 
        }
        
        for (let list of cheapObject){ 
            let imprimeList = document.createElement('h6');
            imprimeList.innerText = `${list.name} - ${list.price.toFixed(2)}€`;
            container.appendChild(imprimeList);
        }
    }  

/** EXERCICIO 4 */    
function Multiply(x, y){
    let container = createContainer();

    let multiplyNumber = x * y;

    let imprimeMultiply = document.createElement('h6');
    imprimeMultiply.innerText = 'O parametro passado no HTML ' + x + ' X ' + y + ' = ' + multiplyNumber;
    container.appendChild(imprimeMultiply);

    return multiplyNumber;
}

/** EXERCICIO 5 */
function IsShortsWeather(temp){
    let container = createContainer();
    
    let boolean = temp >= 25;

    let imprimeCondition = document.createElement('h6');
    imprimeCondition.innerText = 'O parametro passado no HTML ' + temp + 'º ' + ' É tempo de usar Short? ' + boolean;
    container.appendChild(imprimeCondition);

    return boolean;
}

function Exercicio6(){
    let container = createContainer();
    let imprimeCondition = document.createElement('button');
    imprimeCondition.innerText = 'Diz-me o teu nome e dir-te-ei olá';
    imprimeCondition.className = 'btnName';
    container.appendChild(imprimeCondition);
    imprimeCondition.onclick = function(){
        let nome = prompt('Qual é o teu nome?');
        let imprimeNome = document.createElement('h6');
        imprimeNome.innerText = `Olá ${nome}`
        container.appendChild(imprimeNome);
    }
}

function Exercicio7(){
    let container = createContainer();

    let myNumber = [2, 2, 2, 2, 2];

    let soma = 0;

    for (i=0; i<myNumber.length; i++){
        soma += myNumber[i];
    }

    let imprimeTxt = document.createElement('h6');
    imprimeTxt.innerText = 'A lista de números completa: ' + myNumber;
    container.appendChild(imprimeTxt);

    let imprimeSoma = document.createElement('h6');
    imprimeSoma.innerText = 'O valor da soma é: ' + soma;
    container.appendChild(imprimeSoma);
}

function Exercicio8(){
    let container = createContainer();
    
    const colors = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];
        
    let button1 = document.createElement('button');
    let button2 = document.createElement('button');
    let button3 = document.createElement('button');
    
    button1.innerText = 'Button1';
    button1.className = 'btnExercise';
    button2.innerText = 'Button2';
    button2.className = 'btnExercise';
    button3.innerText = 'Button3';
    button3.className = 'btnExercise';

    // A função Math.floor(x) retorna o menor número inteiro dentre o número "x"
    // Random - aleatorios

    [button1, button2, button3].forEach(button => {
        button.addEventListener('click', function() {
            let randomColorIndex = Math.floor(Math.random() * colors.length);
            button.style.backgroundColor = colors[randomColorIndex];
        });
    });

    container.appendChild(button1);
    container.appendChild(button2);
    container.appendChild(button3);
}

function Exercicio9(){
    let container = createContainer();

    let txt = document.createElement('p');
    console.log(txt);
    txt.innerText = 'É só mais um esforço a seguir para ser um programador de renome';
    container.appendChild(txt);
}

function Exercicio10(){
    let container = createContainer();
    
    let txt = document.createElement('p');
    txt.innerText = 'É só mais um esforço a seguir para ser um programador de renome';
    container.appendChild(txt);

    let buttonMax = document.createElement('button');
    let buttonMin = document.createElement('button');

    buttonMax.innerText = '+';
    buttonMax.addEventListener('click', function() {
        txt.style.fontSize= '35px';
    });

    buttonMin.innerText = '-';
    buttonMin.addEventListener('click', function() {
        txt.style.fontSize= '16px';
    });

    buttonMax.className = 'btnSize';
    buttonMin.className = 'btnSize';
    container.appendChild(buttonMax);
    container.appendChild(buttonMin); 
}

function Exercicio11(){
    let container = createContainer();
    
    let text = document.createElement('p');
    text.innerText = 'É só mais um esforço a seguir para ser um programador de renome';
    container.appendChild(text);

    let buttonMax = document.createElement('button');
    let buttonMin = document.createElement('button');
    
    buttonMin.innerText = '-';
    buttonMin.addEventListener('click', function() {
        text.style.fontSize= '30px';
        text.style.textAlign= 'right';
    });

    buttonMax.innerText = '+';
    buttonMax.addEventListener('click', function() {
        text.style.fontSize= '50px';
        text.style.textAlign= 'center';
    });


    buttonMax.className = 'btnSize';
    buttonMin.className = 'btnSize';
    container.appendChild(buttonMax);
    container.appendChild(buttonMin); 
}

function Exercicio12(){
    let container = createContainer();
    const skills = ['Lógica de Código JS', 'Funções', 'DOM', 'Eventos'];

    let text = document.createElement('h4');
    text.innerText = 'O que eu aprendi em JS:';
    container.appendChild(text);

    let listItems = [];

    for (let skill of skills){ 
        let imprimeList = document.createElement('h6');
        imprimeList.innerText = skill;
        container.appendChild(imprimeList);
        listItems.push(imprimeList);
    }

    let learned = document.createElement('button');
    learned.innerText = 'Aprendido'
    learned.className = 'btnName'

    learned.addEventListener('click', function() {
        for (let i = 0; i < listItems.length; i++){ 
            listItems[i].innerText += '-aprendido'; 
        }
    });
    container.appendChild(learned);
}

function Exercicio13(){
    let container = createContainer();
    const skills = ['Lógica de Código JS', 'Funções', 'DOM', 'Eventos'];

    let text = document.createElement('h4');
    text.innerText = 'O que eu aprendi em JS:';
    container.appendChild(text);

    let listItems = [];
    for (let skill of skills){ 
        let imprimeList = document.createElement('h6');
        imprimeList.innerText = skill;
        container.appendChild(imprimeList);
        listItems.push(imprimeList);
    }

    let btnUser = document.createElement('button');
    btnUser.innerText = 'O que mais aprendeu em JS?';
    btnUser.className = 'btnJS';
    btnUser.onclick = function(){
        let nome = prompt('Digite o que aprendeu');
        let newUserSkill = document.createElement('h6');
        newUserSkill.innerText = nome;
        container.appendChild(newUserSkill);
        listItems.push(newUserSkill);
    }
    container.appendChild(btnUser);

    let learned = document.createElement('button');
    learned.innerText = 'Aprendido';
    learned.className = 'btnLearned';

    learned.addEventListener('click', function() {
        for (let i = 0; i < listItems.length; i++){ 
            listItems[i].innerText += '-aprendido'; 
        }
    });
    container.appendChild(learned);
}

    