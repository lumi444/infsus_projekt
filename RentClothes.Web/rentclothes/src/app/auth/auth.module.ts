import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './auth.component';

import { AppRoutingModule } from '../app-routing.module';
import { AuthRoutingModule } from './auth-routing.module';

@NgModule({
  declarations: [LoginComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    FormsModule,
    AppRoutingModule,
    AuthRoutingModule,
  ],
  exports: [LoginComponent],
})
export class AuthModule {}
