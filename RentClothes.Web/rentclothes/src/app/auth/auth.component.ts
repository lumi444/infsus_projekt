import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AuthService } from '../auth/auth.service';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css'],
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  registerForm!: FormGroup;
  isLoading = false;
  isLoginMode = true;
  error: string = '';

  constructor(
    private authService: AuthService,
    private formBuilder: FormBuilder
  ) {}

  ngOnInit(): void {
    this.initLoginForm();
  }

  private initLoginForm() {
    this.loginForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
    });
  }

  onSubmit() {
    if (this.loginForm.invalid) {
      return;
    }

    const email = this.loginForm.value.email;
    const password = this.loginForm.value.password;

    this.isLoading = true;
    this.authService.login(email, password).subscribe(
      (response) => {
        console.log(response);
        this.isLoading = false;
        this.error = '';
      },
      (error) => {
        console.log(error);
        this.isLoading = false;
        this.error = error.error.message;
      }
    );
    this.loginForm.reset();
  }

  onSwitchMode(): void {
    this.isLoginMode = !this.isLoginMode;
  }

  get email(): any {
    return this.isLoginMode
      ? this.loginForm.get('email')
      : this.registerForm.get('email');
  }

  get password(): any {
    return this.isLoginMode
      ? this.loginForm.get('password')
      : this.registerForm.get('password');
  }

  get confirmPassword(): any {
    return this.registerForm.get('confirmPassword');
  }
}
