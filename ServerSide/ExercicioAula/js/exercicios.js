function peopleNames(){
    const fullNames = [
        {first: 'Albus', last: 'Dumbledore'},   
        {first: 'Harry', last: 'Potter'}, 
        {first: 'Hermione', last: 'Granger'}, 
        {first: 'Ron', last: 'Weasley'},
        {first: 'Rubeus', last: 
        'Hagrid'}, 
        {first: 'Minerva', last: 'McGonagall'}, 
        {first: 'Severus', last: 'Snape'}
    ];

    const firstName = fullNames.map(function(fName){
        return fName.first
    })

    console.log(fullNames);
    console.log(firstName);
}

function ArrowFunction(){
    const greet = (nome) => {
        return nome
    } 
    console.log('Hey ' + greet('Amanda'))
}

/*function validUserNames(){
    let usernames = ['Amanda', 'amanda123456', 'Bianca', 'bianca123', 'Adilson', 'adilson123456', 'Odie' , 'odie_fofinho', 'Andrea', 'andrea1']

    let filterNames = usernames.filter (usernames => usernames.length < 10);

    filterNames.forEach((item) => {
        console.log(`${item}`);
    });
}*/

function validUserNames(usernames){
    let filterNames = usernames.filter (usernames => usernames.length < 10);

    console.log(filterNames)
}

function allEvens(num) {
    return num.every(numero => numero % 2 === 0);
  }