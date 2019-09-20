let resultData = new Promise(function(resolve,reject){
    if(10>10){
        reject('failed');
    }else{
        resolve('success');
    }
});
resultData.then((data)=>{
    console.log('then block = '+data);
}).catch((error)=>{
    console.log('catch block = '+error)
}
);
