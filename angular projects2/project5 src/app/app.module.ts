import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { CarsComponent } from './cars/cars.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { RecipesComponent } from './recipes/recipes.component';
import { NewsComponent } from './news/news.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { RecipeDetailsComponent } from './recipes-details/recipe-details.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    CarDetailsComponent,
    RecipesComponent,
    NewsComponent,
    MobilesComponent,
    RecipeDetailsComponent,
    MobileDetailsComponent,
    NewsDetailsComponent,
    HeaderComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'',component:HomeComponent},
      {path:'cars',component:CarsComponent},
      {path:'recipes',component:RecipesComponent},
      {path:'mobiles',component:MobilesComponent},
      {path:'news',component:NewsComponent},
     // {path:'**',component:PageNotFoundComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
