import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contador',
  templateUrl: './contador.component.html',
  styleUrls: ['./contador.component.css']
})
export class ContadorComponent implements OnInit {

  num: number = 0;

  constructor() { }

  ngOnInit() {
  }

  incrementar() {
    this.num = this.num + 1;
  }

  decrementar() {
    this.num = this.num - 1;
  }

}
