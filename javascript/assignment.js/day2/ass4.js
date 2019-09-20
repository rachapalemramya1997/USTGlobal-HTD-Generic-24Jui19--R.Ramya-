// named
var count = 5;
function fibanacci(n1,n2){
    console.log(n1+" ");
    console.log(n2);
    for(var i=2;i<count;i++){
        var n3=n1+n2;
        console.log(n3+" ");
        n1=n2;
        n2=n3;
    }
}
fibanacci(0,1);
//anonomous
var count = 5;
var fibanacci = function(n1,n2){
    console.log(n1+" ");
    console.log(n2);
    for(var i=2;i<count;i++){
        var n3=n1+n2;
        console.log(n3+" ");
        n1=n2;
        n2=n3;
    }}
   // fibanacci(0,1);
    //self invoked
    var count = 5;
(function(n1,n2){
    console.log(n1+" ");
    console.log(n2);
    for(var i=2;i<count;i++){
        var n3=n1+n2;
        console.log(n3+" ");
        n1=n2;
        n2=n3;
    }}(0,1));
    //fat arrow
    var count = 5;
var fibanacci=(n1,n2)=>{
    console.log(n1+" ");
    console.log(n2);
    for(var i=2;i<count;i++){
        var n3=n1+n2;
        console.log(n3+" ");
        n1=n2;
        n2=n3;
    }}
fibanacci(0,1);
    
    