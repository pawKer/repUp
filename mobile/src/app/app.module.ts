import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { FindAJobPage } from '../pages/find_a_job/find_a_job';
import { PostAJobPage } from '../pages/post_a_job/post_a_job';
import { HttpModule } from '@angular/http';
import { JobDetailsPage } from '../pages/job_details/job_details';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    FindAJobPage,
    PostAJobPage,
    JobDetailsPage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    HttpModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    FindAJobPage,
    PostAJobPage,
    JobDetailsPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
