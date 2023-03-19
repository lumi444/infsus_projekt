import { Component } from '@angular/core';
import { MatFormFieldModule } from '@angular/material/form-field';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css'],
})
export class RegisterUserComponent {
  Roles: any = ['Admin', 'Author', 'Reader'];
  constructor() {}
  ngOnInit() {}
}
