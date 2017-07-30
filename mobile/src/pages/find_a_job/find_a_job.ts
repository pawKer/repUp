import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { JobDetailsPage } from '../job_details/job_details';

@Component({
  templateUrl: 'find_a_job.html'
})
export class FindAJobPage {
  item;
  jobsAvailable;

  constructor(public navCtrl: NavController, params: NavParams) {
    this.jobsAvailable = params.data.jobsAvailable;
  }

  goToJobDetails($job) {
    this.navCtrl.push(JobDetailsPage, {job: $job});
  }
}
