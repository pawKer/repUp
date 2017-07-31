import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { FindAJobPage } from '../find_a_job/find_a_job';
import { PostAJobPage } from '../post_a_job/post_a_job';
import {Http} from '@angular/http';
import 'rxjs/add/operator/map';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})

export class HomePage {
  jobs: any;

  constructor(public navCtrl: NavController, public http: Http) {
    var url = 'http://repup.herokuapp.com/jobs';
    var response = this.http.get(url).map(res => res.json()).subscribe(
      data => {
        this.jobs = data;
      }
    );
  }

  openFindAJobPage() {
    let jobsList = {jobsAvailable: this.jobs};
    this.navCtrl.push(FindAJobPage, jobsList);
  }

  openPostAJobPage() {
    this.navCtrl.push(PostAJobPage);
  }

}
