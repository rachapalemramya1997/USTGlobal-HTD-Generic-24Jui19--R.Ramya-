console.log("==========function expression=====");
var fact=1;
var factorial = function(num){
    for(var i=1;i<=num;i++){
    fact = fact*i;
}
console.log('factorial of number= '+fact);
}
factorial(4);
console.log("=======named=====");
var fact=1;
function factorial(num){
    for(var i=1;i<=num;i++){
    fact = fact*i;
}
console.log('factorial of number = '+fact);
}factorial(4);
console.log("======self invoke======");
var fact=1;
(function(num){
    for(var i=1;i<=num;i++){
    fact = fact*i;
}
    console.log('factorial of number = '+fact);
}(4));
console.log("=======fat arrow=========");
var fact=1;
var factorial = (num)=>{
    for(var i=1;i<=num;i++){
    fact = fact*i;
}console.log('factorial of number = '+fact);
}
factorial(4);
