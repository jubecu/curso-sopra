var operador=""
var memoria=0

function mostrar(num){
    var pantalla=document.getElementById("pantalla")
    if(operador==""){
        pantalla.value+=num
    }else{
        pantalla.value=""
        pantalla.value+=num
    }

}

function sumar(){
    var pantalla=document.getElementById("pantalla")
    operador="+"
    memoria=pantalla.value
    //pantalla.value=""
}

function restar(){
    var pantalla=document.getElementById("pantalla")
    operador="-"
    memoria=pantalla.value
    pantalla.value=""
}

function multiplicar(){
    var pantalla=document.getElementById("pantalla")
    operador="*"
    memoria=pantalla.value
    pantalla.value=""
}

function dividir(){
    var pantalla=document.getElementById("pantalla")
    operador="/"
    memoria=pantalla.value
    pantalla.value=""
}

function resolver(){
    var pantalla=document.getElementById("pantalla")
    if(operador=="+"){
        pantalla.value=parseInt(pantalla.value)+parseInt(memoria)
    }else if(operador=="-"){
        pantalla.value=parseInt(memoria)-parseInt(pantalla.value)
    }else if(operador=="*"){
        pantalla.value=parseInt(pantalla.value)*parseInt(memoria)
    }else if(operador=="/"){
        pantalla.value=parseInt(memoria)/parseInt(pantalla.value)
    }
}

function resetear(){
    document.getElementById("pantalla").value=""
    operador=""
    memoria=0
}