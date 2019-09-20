console.log("====================");
function sum(a,b){
function addSum(){
    return a+b;
}
return addSum;
}
var addFunc = sum(10,20);
var total = addFunc();
console.log('total= '+total);
console.log("=========this keyword=======");
console.log(window);
console.log(this);
console.log(this===window);
var name = 'Ramya';
console.log(window.name);
console.log(this.name);
var person = {
    name: 'Surya',
    age: 35,
    getName: function(){
        console.log('getName method '+this);
        console.log(this);
        console.log(window);
        getData();
        function getData(){
            console.log('get data method'+this);
        }
        return this.name;
    }
}
var heroName = person.getName();
console.log('Name= '+heroName);
console.log("====method using object reference====");
for(var i=0;i<5;i++){
    console.log(i);
}
console.log('value of i '+i);
for(var j=0;j<5;j++){
    console.log(j);
}
console.log('value of j '+j);
for(var k=0;k<5;k++){
    console.log(k);
}
console.log('value of k '+k);
console.log("===var keyword is changeble but redeclaration is possible==");
var hobbies = ['dancing','singing','cooking','cricket'];
console.log('Hobbies '+hobbies);
var hobbies = ['playing'];
console.log('hobbies '+hobbies);
hobbies=['football'];
