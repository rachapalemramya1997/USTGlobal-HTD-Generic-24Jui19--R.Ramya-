import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NewsComponent } from './news/news.component';
import { BusinessComponent } from './business/business.component';


const routes: Routes = [
  {path:'' ,component:NewsComponent},
  { path:'business',component:BusinessComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
