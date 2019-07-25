import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form-cv',
  templateUrl: './form-cv.component.html',
  styleUrls: ['./form-cv.component.css']
})
export class FormCvComponent implements OnInit {
  nombre = '';
  apellidos = '';
  email = '';
  foto = '';
  skills: string[] = [];

  constructor() { }

  ngOnInit() {
  }

  cambiarNombre(event) {
    this.nombre = event.target.value;
  }

  cambiarApellidos(event) {
    this.apellidos = event.target.value;
  }

  cambiarEmail(event) {
    this.email = event.target.value;
  }

  cambiarFoto(event) {
    this.foto = event.target.value;
  }

  annadirSkill(ref) {
    this.skills.push(ref.value);
    ref.value = '';
  }

}
