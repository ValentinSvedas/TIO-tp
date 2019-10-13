let direccionindex = "/TpEsp/index-c.html"
window.onload = cargarindex;
function cargarindex() {
  event.preventDefault();
  let container = document.getElementsByClassName("cuerpoentero")[0];
  container.innerHTML = "<h1>Loading xd...</h1>";
  fetch("index-c.html").then(
  function(response){
    if (response.ok){
      response.text().then(t => container.innerHTML = t);
    }
    else {
      container.innerHTML = "<h1>Fatal error</h1>";
    }
    })
}



function cargargatosgordos() {
  event.preventDefault();
  let container = document.getElementsByClassName("cuerpoentero")[0];
  container.innerHTML = "<h1>Loading...</h1>";
  fetch("gatosgordos-c.html").then(
  function(response){
    if (response.ok){
      response.text().then(t => container.innerHTML = t);
    }
    else {
      container.innerHTML = "<h1>Fatal error</h1>";
    }
    })
}

function cargarcuriosidades() {
  event.preventDefault();
  let container = document.getElementsByClassName("cuerpoentero")[0];
  container.innerHTML = "<h1>Loading...</h1>";
  fetch("curiosidadesyproductos-c.html").then(
  function(response){
    if (response.ok){
      response.text().then(t => container.innerHTML = t);
    }
    else {
      container.innerHTML = "<h1>Fatal error</h1>";
    }
    })
}

let curClick = document.getElementsByClassName("nav-item1")[0];
curClick.addEventlistener("click", cargarcuriosidades)


function cargarcontactos() {
  event.preventDefault();
  let container = document.getElementsByClassName("cuerpoentero")[0];
  container.innerHTML = "<h1>Loading...</h1>";
  fetch("gatosgordos-c.html").then(
  function(response){
    if (response.ok){
      response.text().then(t => container.innerHTML = t);
    }
    else {
      container.innerHTML = "<h1>Fatal error</h1>";
    }
    })
}
