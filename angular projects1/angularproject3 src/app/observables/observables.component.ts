import { Component, OnInit, OnDestroy } from '@angular/core';
// import { interval, Subscription } from 'rxjs';
// import { map } from "rxjs/operators";
@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit, OnDestroy{
  mySubscription: any;
    // ngOnDestroy(): void {
    //     throw new Error("Method not implemented.");
    // }
//mySubscription: Subscription;
  constructor() { }

  ngOnInit() {
//    this.mySubscription = interval(1000).pipe(map(data =>{
//        return data*10;
//    })),subscribe(data=>{
//      console.log(data);
//    },err=>{
//      console.log(err);

//    },()=>{
//      console.log('subscription complete');
//    });

  }
// tslint:disable-next-line: adjacent-overload-signatures
ngOnDestroy(){
this.mySubscription.unsubscribe();
}
 }
