import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { NgModel } from '@angular/forms';
import { Http, Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import { ToastController } from 'ionic-angular';

@Component({
  templateUrl: 'post_a_job.html'
})
export class PostAJobPage {
  job;

  constructor(public http: Http, public toastCtrl: ToastController) {
    this.job = {};
  }

  submitJob() {
    let url = 'http://localhost:8100/jobs';
    let headers = new Headers({
      'Content-Type': 'application/json',
      'userId': 1
    });
    let options = new RequestOptions({ headers: headers });
    let data = JSON.stringify(
      {
        title: this.job.jobTitle,
        remuneration: "£" + this.job.pay +" per hour",
        category: this.job.description.toString(),
        job_owner: 1,
        charity: this.job.charities.toString(),
        description: this.job.description,
        expected_duration: 2,
        datePosted: "2018-07-31",
        likes: 0
      }
    );
    this.http.post(url, data, options).toPromise().then(
      () => {
        let toast = this.toastCtrl.create({
          message: 'Job uploaded successfully',
          showCloseButton: true,
          closeButtonText: 'Ok'
        });
        toast.present();
      }
    );
  }
}
