sumar(2,3,4)
sumar(5)
sumar(7,8)
sumar(4,56,6,34,342,6,43,6)

function sumar(a,b){
    if(arguments.length>=2){
        var sumatorio=0
        for(let i=0;i<arguments.length;i++){
            sumatorio=sumatorio+arguments[i]
        }
        console.log(sumatorio)
    }
}

console.log("Ejercicio 2: Agregar a un array la funcion construida")
//Con el prototype funciona con todos los arrays.
//Le agregamos al objeto Array el método funcionQueSuma
Array.prototype.funcionQueSuma=sumar
var miArray=new Array(7,15,12)
console.log(miArray.funcionQueSuma(3,5,7))

var otroArray=[3,5,7]
console.log(miArray.funcionQueSuma(2,4,7))

console.log("Agregar una funcion a mi array que concatene su contenido")
function concatenarContenido(){
    let concatenacion=""
    for (let index = 0; index < this.length; index++) {
        concatenacion += this[index];
        
    }
    return concatenacion
}
Array.prototype.concatena=concatenarContenido
console.log(miArray.concatena())
console.log(otroArray.concatena())
