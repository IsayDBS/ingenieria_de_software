

async function updateProduct(id_producto){ //Va a esperar una respuesta (async)
    let url = `http://localhost:8080/${id_producto}`
    updateInfo = getUpdatedProductInfo()
    let opcionesRequest = {
      method: 'PUT',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: updateInfo
  
    }
    fetch(url, opcionesRequest)
    .then(response => response.json())
    .catch(error => console.error('Error:', error))
    .then(response => console.log('Success:', response))
    
    window.location = '../templates/index.html'
  
}

function enableTitle() {
    document.getElementById("nombre-producto").disabled = false;
}

function enableDesc() {
    document.getElementById("descripcion-producto").disabled = false;
}
function enablePrice() {
    document.getElementById("precio-producto").disabled = false;
}

async function loadProductInfo(nombre_producto,id_producto){
    let url = `http://localhost:8080/producto/${nombre_producto}/${id_producto}`
    fetch(url)
    .then(response => response.json())
    .then(data => {displayProductInfo(data)})
  .catch(error => console.log('error', error));
}

function displayProductInfo(data){
    document.getElementById("nombre-producto").value = data.nombre
    document.getElementById("descripcion-producto").value = data.descripcion
    document.getElementById("precio-producto").value = data.precio
    document.getElementById("inventario").value = data.inventario
    document.getElementById("imagen-producto").src = data.imagen
}


function getUpdatedProductInfo(){

    let prodInf= {
        nombre :  document.getElementById("nombre-producto").value,
        descripcion : document.getElementById("descripcion-producto").value,
        precio: document.getElementById("precio-producto").value,
        inventario: document.getElementById("inventario").value,
        imagen: document.getElementById("imagen").value
    }
    var p = document.getElementById("precio-producto").value;
  
    if(!/^\d+(\.\d{1,2})?$/.test(p)){
        var modalPrice = new bootstrap.Modal(document.getElementById('modalPrecio'),)
        modalPrice.show();
    }
    else{
        return JSON.stringify(prodInf)
    }
}