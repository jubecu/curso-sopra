import { Component, OnInit } from '@angular/core';
import { DatosService } from '../datos.service';

@Component({
  selector: 'app-cmp-a',
  templateUrl: './cmp-a.component.html',
  styleUrls: ['./cmp-a.component.css']
})
export class CmpAComponent implements OnInit {
  datos: Array<string> = [];

  // Instancia del servicio datos. El constructor prácticamente solo se usa para eso.
  constructor(private datosService: DatosService) { }

  // Se deben inicializar los datos en el init
  ngOnInit() {
    this.datos = this.datosService.getDatos();
  }

  guardarDato(dato: string): void {
    // this.datos.push(dato);
    this.datosService.addDato(dato);
  }

  enviarDato(dato: string): void {
    this.datosService.enviar(dato);
  }

}
