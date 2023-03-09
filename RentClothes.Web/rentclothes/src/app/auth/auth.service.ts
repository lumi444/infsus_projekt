import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError, tap } from 'rxjs/operators';
import { throwError } from 'rxjs';
import { User } from '../models/user.module';

export interface AuthResponse {
  accessToken: string;
  expiresIn: number;
}

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  private readonly API_URL = 'http://localhost:3000/auth';
  private _user = new User('example@gmail.com', 'password123');

  get user(): User {
    return this._user;
  }

  constructor(private http: HttpClient) {}

  register(email: string, password: string) {
    return this.http
      .post<AuthResponse>(`${this.API_URL}/register`, { email, password })
      .pipe(
        catchError((error) => {
          return throwError(error);
        })
      );
  }

  login(email: string, password: string) {
    return this.http
      .post<AuthResponse>(`${this.API_URL}/login`, { email, password })
      .pipe(
        catchError((error) => {
          return throwError(error);
        }),
        tap((response) => {
          const { accessToken, expiresIn } = response;
          const expirationDate = new Date(
            new Date().getTime() + expiresIn * 1000
          );
          const user = new User(accessToken, 'expirationDate');
          //this._user.next(user);
        })
      );
  }

  logout() {
    //this._user.next(null);
  }

  // autoLogin() {
  //   const userData: {
  //     token: string;
  //     expirationDate: string;
  //   } = JSON.parse(localStorage.getItem('user'));

  //   if (!userData) {
  //     return;
  //   }

  //   const loadedUser = new User(
  //     userData.token,
  //     new Date(userData.expirationDate)
  //   );

  //   if (loadedUser.token) {
  //     this._user.next(loadedUser);
  //   }
  // }

  // autoLogout(expirationDuration: number) {
  //   setTimeout(() => {
  //     this.logout();
  //   }, expirationDuration);
  // }

  // storeUserData(token: string, expiresIn: number) {
  //   const expirationDate = new Date(new Date().getTime() + expiresIn * 1000);
  //   const user = new User(token, expirationDate);
  //   localStorage.setItem('user', JSON.stringify(user));
  // }
}

// export class User {
//   constructor(public token: string, public expirationDate: Date) {}

//   get tokenIsValid() {
//     return this.token && this.expirationDate > new Date();
//   }
// }
