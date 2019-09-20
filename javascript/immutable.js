console.log('=============immutable means nochange=============');
var message = 'Hello';
console.log(message);
message = message + 'world';
console.log(message);
var message1 = message;
console.log(message1);
message = 'hi';
console.log(message);
console.log(message1);
console.log('======mutable used to modify the object=====');
var person = {
    name: 'samantha',
    age: 35,
    color:'white'
};
console.log(person);
person.name = 'kajal';
console.log(person);
var person1 = person;
console.log(person);
person.name = 'rajini';
console.log(person);
console.log(person1);
console.log('========function declaration====');
function first(){
    console.log("first");
}
function second(){
    console.log("second");
}
first();
second();
console.log('=======1000=1sec  stack expression=======');
function first(){
    setTimeout(function(){
    console.log("first");
},1000);}
function second(){
    console.log("second");
}
first();
second();
console.log('========10000=10sec=============');
function first(){
    setTimeout(function(){
    console.log("first");
},10000);}
function second(){
    console.log("second");
}
first();
second();
console.log('===call back function====');
function first(callback){
    setTimeout(function(){
    console.log("this is first");
    callback();
},1000);
}
function second(){
    console.log("second");
}
first(second);
