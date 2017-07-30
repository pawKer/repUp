import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';

@Component({
  templateUrl: 'job_details.html'
})
export class JobDetailsPage {
  job;

  constructor(params: NavParams) {
    this.job = params.data.job;
  }
};
