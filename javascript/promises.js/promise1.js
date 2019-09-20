/*let resultData = new Promise(function(resolve,reject){
    if(10>10){
        reject('failed');
    }else{
        resolve('roommates');
    }
});
resultData.then((data)=>{
    console.log('employee data = '+data);
}).catch((error)=>{
    console.log('catch block = '+error)
}
);*/
//using array
let employeeData = new Promise(function(resolve,reject){
    const employee = [
        {
            name: 'ramya',
            age: 21
        },
        {
            name: 'asu',
            age: 22
        },
        {
            name: 'roopa',
            age: 19,
        }
    ];
    if(10>10){
        reject('failed');
    }else{
        resolve(employee);
    }
});
    employeeData.then((data)=>{
        //console.log('employee data = '+data);
        return data;
    }).catch((error)=>{
        console.log('catch block = '+error); 
    }).then(function(data1){
        console.log('this is then block 2',data1);
    });
