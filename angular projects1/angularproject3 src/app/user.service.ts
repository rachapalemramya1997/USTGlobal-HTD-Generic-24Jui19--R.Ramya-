import { Injectable } from '@angular/core';
@Injectable({
    providedIn:"root"
})
export class UserService {
    users =[
        {
            name:'Ramya',
            company:'ust'
        },
        {
            name:'asma',
            company:'tcs'
        },
        {
            name:'mahi',
            company:'cts'
        }
    ]
}
