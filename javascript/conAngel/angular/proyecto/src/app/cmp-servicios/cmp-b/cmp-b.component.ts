import { Component, OnInit } from '@angular/core';
import { DatosService } from '../datos.service';

@Component({
  selector: 'app-cmp-b',
  templateUrl: './cmp-b.component.html',
  styleUrls: ['./cmp-b.component.css']
})
export class CmpBComponent implements OnInit {
  datos: Array<string> = [];
  dato: string = '';

  // Instancia del servicio datos
  constructor(private datosService: DatosService) { }

  ngOnInit() {
    this.datos = this.datosService.getDatos();
    this.datosService.datoEnviado.subscribe(
      (dato) => {
        this.dato = dato;
      }
    );
  }

  guardarDato(dato: string): void {
    this.datosService.addDato(dato);
  }
}
