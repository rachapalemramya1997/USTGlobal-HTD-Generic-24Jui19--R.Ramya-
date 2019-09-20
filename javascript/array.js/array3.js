console.log("=======splice=======");
var hobbies = ['singing','dancing','playing','swimming'];
hobbies.splice(0,2,'Hair cutting','skipping');
console.log('Hobbies After Splice '+hobbies);
var hobbies1 = hobbies.slice(1,4);
console.log('Hobbies After Splice '+hobbies);
console.log('Hobbies After Slicing '+hobbies1);
var hobbiesString = hobbies.join('-----');
console.log('Hobbies After Join '+hobbiesString);
var indexOfPhotography = hobbies.indexOf('Photography');
console.log('Index Of Photography '+indexOfPhotography);
console.log("======map and filter==========");
var number = [10,20,30,40,50];
var afterMap = number.map((mapNumbers=>(mapNumbers+10)));
console.log(afterMap);
var afterFilter = number.filter((filterNumbers=>(filterNumbers>10)));
console.log(afterFilter);
console.log("==============");
var items = [{
    name:'lipstick',
    price:95,
    id:1
},
{
    name:'shoe',
    price:950,
    id:2
},
{
    name:'locker',
    price:87,
    id:3
},
{
    name:'watch',
    price:70,
    id:4
}
];
var mappedItems = items.map(function(item){
   item.price = item.price + 100;
   return item;
});
console.log("Items after adding 100 " +mappedItems);
var filteredItems = items.filter(function(item){
    var itemFilter = item.price>100 && item.name.lengh>5;
    return itemFilter;
});
console.log("items filtered "+filteredItems);