import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'currencyRight'
})
export class CurrencyRightPipe implements PipeTransform {

  transform(value: string): any {
    let cad = '';
    for (let i = 1; i < value.length; i++) {
      cad += value[i];
    }
    cad += value[0];
    return cad;
    // return value.slice(1)+value[0];
  }

}
