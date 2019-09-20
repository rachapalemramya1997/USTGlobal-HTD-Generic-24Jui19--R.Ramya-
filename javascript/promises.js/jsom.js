let employeeJSON = {
    name:'reddy',
    age: 21,
    hobbies: ['dreaming','dancing']
}
//${employeeJSON.name}   //string interpolation
console.log('My name is ${employeeJSON.name}');
console.log(employeeJSON);
let jsomObject = JSON.stringify(employeeJSON);
console.log(jsomObject);
let jsObject = JSON.parse(jsomObject);
console.log(jsObject);