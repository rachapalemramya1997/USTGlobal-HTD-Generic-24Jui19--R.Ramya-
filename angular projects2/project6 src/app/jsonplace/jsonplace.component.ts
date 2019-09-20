import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-jsonplace',
  templateUrl: './jsonplace.component.html',
  styleUrls: ['./jsonplace.component.css']
})
export class JsonplaceComponent implements OnInit {

  json : any=[];
  constructor(private http: HttpClient) { 
   http.get<any>('https://jsonplaceholder.typicode.com/posts')
   .subscribe(resData =>
   {
    this.json=resData;
     console.log(this.json);
   })
  }
  

  ngOnInit() {
  }

}
