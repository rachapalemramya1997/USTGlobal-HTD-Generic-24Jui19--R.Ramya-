import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  indianNews:any[]=[];
  constructor(private http: HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=61e45240e1b0475284e50bb67cadb677')
    .subscribe(resData =>{
      this.indianNews = resData.articles;
      console.log(this.indianNews);
    })
   }

  ngOnInit() {
  }

}
