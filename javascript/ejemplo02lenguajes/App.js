console.log("Mi primer log en nodejs")
variableGlobal="mi variable global declarada"
var otraGlobal="Otra variable global"

laFuncionDeIrAlBar()
laFuncionDeIrAlLet()

function laFuncionDeIrAlBar(){
    var variableLocal="Estoy de mañana"
    for (var i=0; i<10;i++){
        console.log("contenido de i"+i)
    }
    console.log("valor de i al final"+i)
}

function laFuncionDeIrAlLet(){
    var otravariableLocal="Otra local"
    variableGlobaldos="ole"
    for (let i=0; i<10;i++){
        console.log("contenido de i"+i)
    }
    //Esto daría error
    //console.log("valor de i al final"+i)
}

console.log("Evaluación de los tipos de datos")
var tipoDeDatoNumerico=8
var tipoDeDatoCadena="cadena"
var tipoDeDatoFecha=new Date()
var referenciaAUnaFecha=tipoDeDatoFecha
cambiemosLaFecha(tipoDeDatoFecha)
console.log("Fecha original "+tipoDeDatoFecha)
console.log("Fecha de la referencia "+referenciaAUnaFecha)

function cambiemosLaFecha(fecha){
    fecha.setFullYear(1999)
    console.log("Fecha cambiada a " +fecha)
}

console.log("Dime el tipo de la variable con un numero "+ typeof tipoDeDatoNumerico)
console.log("Dime el tipo de la variable con una cadena "+ typeof tipoDeDatoCadena)
console.log("Dime el tipo de la variable con una fecha "+ typeof tipoDeDatoFecha)

operacionesNumericas(1,2,3,4)
operacionesNumericas()
function operacionesNumericas(){
    let miNumero=new Number(3.141592654)
    console.log("Valor almacenado "+miNumero.valueOf())
    console.log("Valor almacenado "+miNumero.toFixed())
    console.log("Valor almacenado "+miNumero.toFixed(4))
}

funcionGuay()
funcionGuay(1)
funcionGuay("a","b")
funcionGuay(2,3,4,4,6,7,8,5,43,5,6,564,5,45)
function funcionGuay(mega,guay){
    console.log("Numero de parametros recibidos "+arguments.length)
    console.log("Numero de argumentos esperados "+arguments.callee.length)
    if(arguments.length==arguments.callee.length){
        console.log(mega+" "+guay)
    }
    if(arguments.length==1){
        console.log("con "+mega+" me conformo")
    }
}

losArrays()

function losArrays(){
    let unArray=new Array() //[]
    unArray[0]=7
    unArray[1]="Mis mierdas"
    console.log("El ultimo elemento es "+unArray.length-1)
    let otroArray=[0,"valor",new Date()]
    let miArrayAsociativo=new Array()
    miArrayAsociativo['clave']="valor"
    let persona=new Array()
    persona.nombre="Juan"
    persona.apellido1="Benito"
    persona.funcioncilla=funcionGuay
    persona.funcioncilla("soy","guay")
}

function Cubata(hielos,licorcillo){
    this.losYelos=hielos
    this.licor=licorcillo
    //Sumidero de memoria, crea una funcion por cada uno de los objetos generados
    this.echarUnTrago=function(){
        return this.losYelos+" "+this.licor
    }
}

Cubata.prototype.generameUnString=function(){
    return this.losYelos+" "+this.licor
}

var miCubata=new Cubata("Dos yelos","Roncillo")
console.log(miCubata.echarUnTrago())