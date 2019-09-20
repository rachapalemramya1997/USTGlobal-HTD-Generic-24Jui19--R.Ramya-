var hobbies = ['dancing','acting','cycling','playing'];
var value= Array.isArray(hobbies);
console.log('is array'+" "+value);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.includes('cycling',0);
console.log('includes'+" "+value);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.unshift('cycling','memes');
console.log('is array'+" "+value);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.push('cycling','memes');
console.log('pop'+" "+value);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.pop();
console.log('pop'+" "+hobbies);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.shift();
console.log('is array'+" "+value);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.splice(0,2,'monoaction','cooking');
console.log('is array'+" "+value);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.slice(0,3);
console.log(" "+value);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.join();
console.log('string'+" "+value);

var hobbies = ['dancing','acting','cycling','playing'];
var value= hobbies.indexOf('dance');
console.log('is array'+" "+value);
var no=[10,20,30,40];
var no1=no.map(function(no,index){
    value=no+10;
    return value;
})
console.log(no1);
var no=[10,20,30,40];
var no1=no.filter(function(no,index){
    return no>10;
})
console.log(no1);
