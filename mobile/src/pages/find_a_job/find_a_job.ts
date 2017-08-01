import { Component } from '@angular/core';
import { NavController, NavParams, ModalController } from 'ionic-angular';
import { JobDetailsPage } from '../job_details/job_details';
import { Application } from './application';
import {Http} from '@angular/http';
import 'rxjs/add/operator/map';

@Component({
  templateUrl: 'find_a_job.html'
})
export class FindAJobPage {
  item;
  jobsAvailable;

  constructor(
    public navCtrl: NavController,
    public modalCtrl: ModalController,
    params: NavParams,
    public http: Http) {
      var response = this.http.get('http://repup.herokuapp.com/jobs').map(res=>res.json()).subscribe(
        data => {
          this.jobsAvailable = data;
        }
      );
  }

  goToJobDetails($job) {
    this.navCtrl.push(JobDetailsPage, {job: $job});
  }

  applyForJob($job) {
    let jobApplicationModal = this.modalCtrl.create(Application, {job: $job});
    jobApplicationModal.present();
  }
}
