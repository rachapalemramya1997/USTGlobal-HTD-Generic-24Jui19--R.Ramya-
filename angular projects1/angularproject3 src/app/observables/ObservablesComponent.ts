import { Component, OnInit, OnDestroy } from '@angular/core';
import { interval, Subscription } from 'rxjs';
@Component({
    selector: 'app-observables',
    templateUrl: './observables.component.html',
    styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit, OnDestroy {
    mySubscription: Subscription;
    constructor() { }
    ngOnInit() {
        this.mySubscription = interval(1000).subscribe(data => {
            console.log(data);
        }, err => {
            console.log(err);
        }, () => {
            console.log('subscription complete');
        });
    }
    ngOnDestroy() {
        this.mySubscription.unsubscribe();
    }
}
