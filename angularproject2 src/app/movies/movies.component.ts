import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  

  movieArray: any[]=[];
  constructor(private http: HttpClient) { }
  searchMovies(searchName){
 this.http.get<any>(`http://www.omdbapi.com/?s=${searchName}&apikey=385ef405`)
.subscribe(resData=>{
  this.movieArray = resData.search;
  console.log(this.movieArray);
})
}
  ngOnInit() {
  }}