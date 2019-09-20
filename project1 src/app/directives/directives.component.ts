import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
  condition = false;

  users = [
    {
      id : 1,
      name : 'ramya',
      city : 'tirupati'
    },
    {
      id : 2,
      name : 'ram',
      city :  'chitoor'
    },
    {
      id : 3,
      name : 'raja',
      city : 'pune'
    },
    {
      id : 4,
      name : 'reddy',
      city : 'chandragiri'
    },
    {
      id : 5,
      name : 'bangi',
      city : 'mumbai'
    },
    
  ]
  constructor() { }
  //using splice remove 1st object 
removeUser(user){
  let index = this.users.indexOf(user);
  this.users.splice(index, 1);
  this.condition = true;
}
close(){
  this.condition=false;
}
  ngOnInit() {
  }

}
