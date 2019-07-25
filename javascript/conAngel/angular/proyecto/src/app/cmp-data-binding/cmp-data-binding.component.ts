import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cmp-data-binding',
  templateUrl: './cmp-data-binding.component.html',
  styleUrls: ['./cmp-data-binding.component.css']
})
export class CmpDataBindingComponent implements OnInit {

  nombre: string = 'Juan';
  editando: boolean = true;

  constructor() { }

  ngOnInit() {
  }

  toggleEditando() {
    this.editando = !this.editando;
  }

  resetNombre() {
    this.nombre = '';
  }

  cambiarNombre(event) {
    // console.log(event);
    this.nombre = event.target.value;
  }

  mostrar(ref) {
    console.log(ref);
    console.dir(ref);
  }

}
