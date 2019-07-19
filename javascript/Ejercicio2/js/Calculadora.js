function Calculadora(){
    this._display=0
    this.sumar
}

Calculadora.prototype.sumar=function(valor){
    this._display+=valor;
}

Calculadora.prototype.getDisplay=function(){
    return this._display
}

Calculadora.prototype.reset=function(){
    this._display=0
}

Calculadora.prototype.operar=function(operador,valor){
    this._display=eval(this._display+" "+operador+" "+valor)
}