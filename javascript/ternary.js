var age=21;
var checkAge = (age>21)?'Greater':(age==21)?'Equal':'Lesser';
console.log(checkAge);
console.log("===========================");
var val=10;
val=val+20;
console.log(val);
var val2=20;
val2+=20;
console.log(val2);
console.log("============create object on array=========");
var emp=[
    {
        name: 'ram',
        age: 10,
    },
    {
        name: 'pan',
        age: 20,
    },
    {
        name: 'india',
        age: 10000,
    },
];
for(var i=0;i<emp.length;i++)
{
    console.log(emp[i]);
    console.log(emp[i].name);
    console.log(emp[i].age);
}
console.log("====================");
var hobbies = ['singing','cooking','dancing','playing','walking'];
for(var value of hobbies){
    console.log('Hobbies using of loop'+value);
}
for(var index in hobbies){
    console.log(hobbies[index]);
}


