var inicio=0;
var timeout=0;
var actual=0;
var points = 5000;

function diferencia(inicio,actual){
    var tiempo = new Date(actual-inicio);
    var seconds = tiempo.getTime() / 1000;
    seconds = Math.floor(seconds);
    points = points - seconds;
    if (points <= 0){
        points = 1;
    }
    else if(points >= 4970){
        points = 5000;
    }
    document.getElementById("score").value = points;
    document.getElementById("duration").value = seconds;
    return seconds,points;
}

function empezarDetener()
{
    if(timeout==0)
    {
        // Obtenemos el valor actual
        inicio=vuelta=new Date().getTime();

        // iniciamos el proceso
        funcionando();

    }
}

function funcionando()
{
    // obteneos la fecha actual
    actual = new Date().getTime();

    // obtenemos la diferencia entre la fecha actual y la de inicio
    var diff=new Date(actual-inicio);

    // mostramos la diferencia entre la fecha actual y la inicial
    var result=LeadingZero(diff.getUTCHours())+":"+LeadingZero(diff.getUTCMinutes())+":"+LeadingZero(diff.getUTCSeconds());
    document.getElementById('crono').innerHTML = result;

    // Indicamos que se ejecute esta función nuevamente dentro de 1 segundo
    timeout=setTimeout("funcionando()",1000);
}

/* Funcion que pone un 0 delante de un valor si es necesario */
function LeadingZero(Time) {
    return (Time < 10) ? "0" + Time : + Time;
}

