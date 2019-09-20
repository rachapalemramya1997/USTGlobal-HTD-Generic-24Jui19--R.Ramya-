console.log("name");
var prime=function(num){
if(num%2==0 || num==0 || num==1){
    console.log('given is not prime='+num);
}
else{
    console.log('prime= '+num);
}}
prime(6);

console.log("self invoke");
(function(num){
    if(num%2==0 || num==0 || num==1){
        console.log('given is not prime='+num);
    }
    else{
        console.log('prime= '+num);
    }} 
(6));

console.log("function expression");
function prime(num){
    if(num%2==0 || num==0 || num==1){
        console.log('given is not prime='+num);
    }
    else{
        console.log('prime= '+num);
    }
}
prime(6);

console.log("fatarrow");
var prime=(num)=>{
    if(num%2==0 || num==0 || num==1){
        console.log('given is not prime='+num);
    }
    else{
        console.log('prime= '+num);
    }
}
prime(6);

