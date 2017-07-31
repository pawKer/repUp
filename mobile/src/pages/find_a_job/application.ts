import { Component } from '@angular/core';
import { NavController, NavParams, ModalController, ViewController } from 'ionic-angular';
import { ToastController } from 'ionic-angular';
import { Http, Headers, RequestOptions } from '@angular/http'

@Component({
  templateUrl: 'job_application_modal.html'
})
export class Application {
  job;
  constructor(
    params: NavParams,
    public navCtrl: NavController,
    public toastCtrl: ToastController,
    public viewCtrl: ViewController,
    public http: Http) {
    this.job = params.data.job;
  }

  sendJobApplication() {

    let url = 'http://localhost:8100/jobs/'+this.job.job_id+'/apply';
    let data = JSON.stringify({});
    let headers = new Headers({
      'Content-Type': 'application/json',
      'userId': 1
    });
    let options = new RequestOptions({ headers: headers });
    this.http.post(url, data, options).toPromise().then(
      () => {
        let toast = this.toastCtrl.create({
          message: 'Application Request Sent Successfully',
          showCloseButton: true,
          closeButtonText: 'Ok'
        });
        toast.present();
      }
    );
  }

  dismiss() {
    this.viewCtrl.dismiss();
  }

};
