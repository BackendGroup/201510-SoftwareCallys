function agregarCompra(){
    var nombre = "Camiseta 1";
    var cantidad = 1;
    var precio = "$300";
    var talla = document.getElementById("Size:");
    var color = document.getElementById("Color:");
    
    sessionStorage.setItem(nombre,cantidad,precio,talla,color);

    display(nombre);
}
function display(nombre){
  var lista = document.getElementById("sub-icon1 list");
  var cantidad = sessionStorage.getItem(nombre);
  var precio = sessionStorage.getItem(cantidad);
  var talla = sessionStorage.getItem(precio);
  var color = sessionStorage.getItem(talla);
  lista.innerHTML = nombre + " Qty:" + cantidad + ". Price: " +precio + ". Size: " + talla + ". Color:" + color +"<br />";
}
(function () {
	var app = angular.module('detailsModule');

	app.controller('detailsCtrl', ['$scope', 'CRUDUtils', 'details.context', function ($scope, CRUDUtils, context) 
            {
                this.url = context;
                CRUDUtils.extendCtrl(this, $scope);       
            }]);
            
})();