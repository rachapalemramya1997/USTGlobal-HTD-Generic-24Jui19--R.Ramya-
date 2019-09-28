import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {


  constructor(private http:HttpClient) {
    this.getdata();
   }
   users:any[];

  ngOnInit() {
  }
  getdata(){
    this.http.get<any>("https://jsonplaceholder.typicode.com/users").subscribe(data=>{
      console.log(data);
      this.users = data;
    });
  }

}
