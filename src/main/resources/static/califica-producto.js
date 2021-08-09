

async function postOpinion(){ //Va a esperar una respuesta (async)
    let url = "http://localhost:8080/opinion"
    if (validateRating())
    {
        opinionInfo = getOpinionInfo()
        let opcionesRequest = {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: 'opinionInfo'
        }
        fetch(url, opcionesRequest)
        .then(response => response.json())
        .catch(error => console.error('Error:', error))
        .then(response => console.log('Success:', response))

        window.location.href = '../templates/index.html'
    }
    
  
}

async function loadProductInfo(nombre_producto, id_producto){
    let url = `http://localhost:8080/producto/${nombre_producto}/${id_producto}`
    fetch(url)
    .then(response => response.json())
    .then(data => {displayProductInfo(data)})
}

function displayProductInfo(data){
    product_name = data.nombre
    document.getElementById("nombre-producto").innerHTML = product_name
    product_desc = data.descripcion
    document.getElementById("descripcion-producto").innerHTML = product_desc
    product_price = data.precio
}


function getStarRating(rate) {
    var stars = document.getElementsByName(rate);    
    for(i = 0; i < stars.length; i++) {
        if(stars[i].checked)
            return stars[i];
    }
}

function validateRating(){
    if (getStarRating("rate").value == 0) {
        var modalRating = new bootstrap.Modal(document.getElementById('modalCalificacion'))
        modalRating.show();
        return false
    } 
    else{
        return true
    }
}


function getOpinionInfo(){
    let opinion= {
        calificacion :  getStarRating("rate").value,
        comentario : document.getElementById("review").value
    }
    return JSON.stringify(opinion)
}