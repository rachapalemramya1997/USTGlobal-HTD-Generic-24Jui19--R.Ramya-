import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  indianNews:any[]=[];
  TechNews:any[]=[];
  UsNews:any[]=[];

  constructor(private http:HttpClient) { 
    http.get <any>('https://newsapi.org/v2/top-headlines?category=sports&apiKey=5134ae57f14541f1bbe56534d2fa254d')
    .subscribe(resData=>{
      this.indianNews=resData.articles;
      console.log(this.indianNews);
    }),http.get <any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=5134ae57f14541f1bbe56534d2fa254d')
    .subscribe(resData=>{
      this.TechNews=resData.articles;
      console.log(this.TechNews);
    }),http.get <any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=5134ae57f14541f1bbe56534d2fa254d')
    .subscribe(resData=>{
      this.UsNews=resData.articles;
      console.log(this.UsNews);
    })

  }

  ngOnInit() {
  }

}
