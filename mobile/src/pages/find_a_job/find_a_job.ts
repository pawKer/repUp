import { Component } from '@angular/core';
import { NavController, NavParams, ModalController } from 'ionic-angular';
import { JobDetailsPage } from '../job_details/job_details';
import { Application } from './application';

@Component({
  templateUrl: 'find_a_job.html'
})
export class FindAJobPage {
  item;
  jobsAvailable;

  constructor(
    public navCtrl: NavController,
    public modalCtrl: ModalController,
    params: NavParams) {
    this.jobsAvailable = params.data.jobsAvailable;
  }

  goToJobDetails($job) {
    this.navCtrl.push(JobDetailsPage, {job: $job});
  }

  applyForJob($job) {
    let jobApplicationModal = this.modalCtrl.create(Application, {job: $job});
    jobApplicationModal.present();
  }
}
