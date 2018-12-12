import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    LoginComponent,
    RegistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	RouterModule.forRoot([
		{
			path : 'welcome',
			component: WelcomeComponent
		},
		{
			path : '',
			component : LoginComponent
		},
		{
			path : 'registration',
			component : RegistrationComponent
		}
	])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
