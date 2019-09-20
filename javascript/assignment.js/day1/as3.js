var emp = {
    ename: 'blake',
    eid: '204',
    company: 'ust',
    place: 'tirupati',
    getename: function(){
        return this.ename
    },
    geteid: function(){
        return this.eid;
    }
}
console.log(emp);
var ename = emp.ename;
console.log("ename= "+ename);

var eid = emp.eid;
console.log("eid= "+eid);

var company = emp.company;
console.log("company= "+company);

var place = emp.place;
console.log("place= "+place);