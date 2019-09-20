console.log("==========function expression=====");
var circle = function(radius){
    circumference = (Math.PI)*2*radius;
}
circle(4)
console.log('circumference of circle = '+circumference);
console.log("=======named=====");
function circle(radius){
    circumference = (Math.PI)*2*radius;
}
circle(4)
console.log('circumference of circle = '+circumference);
console.log("======self invoke======");
(function(radius){
    circumference = (Math.PI)*2*radius;
}(4));
console.log('circumference of circle = '+circumference);
console.log("=======fat arrow=========");
var circle = (radius)=>{
    circumference = (Math.PI)*2*radius;
}
circle(4)
console.log('circumference of circle = '+circumference);
