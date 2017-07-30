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
    var response = this.http.get(url).map(res => res.json());
    this.jobs = response;
    //this.http.get('https://www.reddit.com/r/gifs/new/.json?limit=10').map(res => res.json()).subscribe(data => {
    //    this.jobs = data;
    //});
  }

  openFindAJobPage() {
    this.jobs.subscribe(val =>
      {

      this.navCtrl.push(FindAJobPage, {
        jobsAvailable: [
          {
            profile: "assets/img/avatar-frodo.jpg",
            userName: "Mohammed",
            date: "28/07/2017",
            interest: "12",
            description: "I want someone to wash the dishes in my kitchen. PS: Haven't washed anything for 2 weeks",
            numberOfApplications: "23",
            expectedDuration: "2h"
          },
          {
            profile: "assets/img/avatar-gollum.jpg",
            userName: "Mihai",
            date: "28/07/2017",
            interest: "10",
            description: "I want someone to wash my car",
            numberOfApplications: "3",
            expectedDuration: "0.5h"
          }
        ]
      })
      }
    );
  }

  openPostAJobPage() {
    this.navCtrl.push(PostAJobPage);
  }

}
