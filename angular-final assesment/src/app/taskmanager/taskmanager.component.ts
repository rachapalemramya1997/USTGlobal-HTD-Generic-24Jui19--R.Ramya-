import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-taskmanager',
  templateUrl: './taskmanager.component.html',
  styleUrls: ['./taskmanager.component.css']
})
export class TaskmanagerComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  users: any[] = [];
  sendData(data : NgForm){
    this.users.push(data);
    console.log(this.users);
  }
  deleteData(data){
    this.users.splice(data,1);
  }

}
