import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidator } from './customvalidator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

get name(){
  return this.registerForm.get('name');
}
get email(){
  return this.registerForm.get('email');
}
get phno(){
  return this.registerForm.get('phno');
}


registerForm =new FormGroup({
  name: new FormControl('',[Validators.minLength(3),Validators.required,CustomValidator.noSpace]),                          
  email: new FormControl('',[,Validators.email,Validators.minLength(6),Validators.required]),
  phno: new FormControl('',[,Validators.minLength(10),Validators.required]),
                        
});
  ngOnInit() {
  }

}
