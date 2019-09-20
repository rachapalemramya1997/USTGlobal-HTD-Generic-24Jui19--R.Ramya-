var sumval = sum(10,20);
function sum(num1,num2){
    if(num1!==undefined && num2!=undefined){
        sumvalue = num1 + num2;
return sumvalue;
    }}
console.log('sum = '+sumval);
console.log("======function expression and anonomous function======");
var addData = function(num1,num2){
    sumval = num1 + num2;
    return sumval;
};
var addValue = addData(10,20);
console.log('Add value = '+addValue)
console.log("======function expression and anonomous function======");
var addValue = addData(10,20);
var addData = function(num1,num2){
    sumval = num1 + num2;
    return sumval;
};
console.log('Add value = '+addValue)
console.log("==========self invoke function====");
(function(num1,num2){
    var sumDate = num1 + num2;
    console.log('Sumvalue'+sumDate);
}(10,20));
console.log("==============fat arrow function===========");
var sumValue = (num1,num2)=>{
    var totalsum = num1 + num2;
    return totalsum;
}
var valueData = sumValue(10,20);
console.log('value = '+valueData);
console.log("====================");
var sumVal = (num1,num2)=>num1+num2;
var sumData = sumVal(10,50);
console.log('sum = '+sumData);