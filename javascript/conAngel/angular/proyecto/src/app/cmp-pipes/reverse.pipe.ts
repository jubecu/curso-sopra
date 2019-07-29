import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'reverse'
})
export class ReversePipe implements PipeTransform {

  transform(value: string, ...args: any[]): string {
    let cadena = '';
    const tam = value.length - 1;
    for (let i = tam; i >= 0; i--) {
      cadena += value[i];
    }
    return cadena;
    // return value.split('').reverse().join('');
  }

}
