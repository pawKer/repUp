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
import { Application } from '../pages/find_a_job/application';
import { CloudSettings, CloudModule } from '@ionic/cloud-angular';

const cloudSettings: CloudSettings = {
  'core': {
    'app_id': 'eb36de4d'
  }
};


@NgModule({
  declarations: [
    MyApp,
    HomePage,
    FindAJobPage,
    PostAJobPage,
    JobDetailsPage,
    Application
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    HttpModule,
    CloudModule.forRoot(cloudSettings),
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    FindAJobPage,
    PostAJobPage,
    JobDetailsPage,
    Application
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
