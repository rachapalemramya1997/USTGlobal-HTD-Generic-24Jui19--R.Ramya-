import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddTaskComponent } from './add-task/add-task.component';
import { ViewaddtaskComponent } from './viewaddtask/viewaddtask.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddTaskComponent,
    ViewaddtaskComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'AddTask',component:AddTaskComponent},
      {path:'viewAddTask',component:ViewaddtaskComponent}  
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
