

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

async function loadProductInfo(nombre_producto, id_producto){
    let url = `http://localhost:8080/producto/${nombre_producto}/${id_producto}`
    fetch(url)
    .then(response => response.json())
    .then(data => {displayProductInfo(data)})
}

function displayProductInfo(data){
    product_name = data.nombre
    document.getElementById("nombre-producto").value = product_name
    product_desc = data.descripcion
    document.getElementById("descripcion-producto").value = product_desc
    product_price = data.precio
    document.getElementById("precio-producto").value = product_price
    product_stock = data.inventario
    document.getElementById("inventario").value = product_stock
    product_img = data.imagen
    document.getElementById("imagen-producto").src = product_img
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