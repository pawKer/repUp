import { Component } from '@angular/core';
import { NavController, NavParams, ModalController, ViewController } from 'ionic-angular';
import { ToastController } from 'ionic-angular';

@Component({
  templateUrl: 'job_application_modal.html'
})
export class Application {
  job;
  constructor(
    params: NavParams,
    public navCtrl: NavController,
    public toastCtrl: ToastController,
    public viewCtrl: ViewController) {
    this.job = params.data.job;
  }

  sendJobApplication() {
    let toast = this.toastCtrl.create({
      message: 'Application Request Sent Successfully',
      showCloseButton: true,
      closeButtonText: 'Ok'
    });
    toast.present();
  }

  dismiss() {
    this.viewCtrl.dismiss();
  }

};
