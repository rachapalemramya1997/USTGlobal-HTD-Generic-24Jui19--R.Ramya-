import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-github',
  templateUrl: './github.component.html',
  styleUrls: ['./github.component.css']
})
export class GithubComponent implements OnInit {
   
  gitAPI : any=[];
 constructor(private http: HttpClient) { 
  http.get<any>('https://api.github.com/users')
  .subscribe(resData =>
  {
   this.gitAPI=resData;
    console.log(this.gitAPI);
  })
 }
 


  ngOnInit() {
  }

}
