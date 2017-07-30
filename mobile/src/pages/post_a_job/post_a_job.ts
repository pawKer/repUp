import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';

@Component({
  templateUrl: 'post_a_job.html'
})
export class PostAJobPage {
  item;

  constructor(params: NavParams) {
    this.item = params.data.item;
  }
}
