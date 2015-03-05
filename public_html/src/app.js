(function () 
{

	var mainApp = angular.module('mainApp', ['ngRoute', 'homeModule', 'stampModule','shirtModule','detailsModule']);

	mainApp.config(['$routeProvider', function ($routeProvider) 
            {
                    $routeProvider.when('/home', 
                    {
			templateUrl: 'src/modules/home/home.tpl.html'
                    }).otherwise('/');
                    $routeProvider.when('/stamp', 
                    {
			templateUrl: 'src/modules/stamp/stamp.tpl.html'
                    }).otherwise('/');
                    $routeProvider.when('/shirt', 
                    {
			templateUrl: 'src/modules/shirt/shirt.tpl.html'
                    }).otherwise('/');
                    $routeProvider.when('/details', 
                    {
			templateUrl: 'src/modules/details/details.tpl.html'
                    }).otherwise('/');
            }]);

	//Configuraci�n m�dulo home
	var homeModule = angular.module('homeModule', ['CrudModule', 'MockModule']);

	homeModule.constant('home.context', 'home');

	homeModule.config(['home.context', 'MockModule.urlsProvider', function (context, urlsProvider) 
        {
            urlsProvider.registerUrl(context);
        }]);
         
    //Configuraci�n m�dulo stamp
	var stampModule = angular.module('stampModule', ['CrudModule', 'MockModule']);

	stampModule.constant('stamp.context', 'stamp');

	stampModule.config(['stamp.context', 'MockModule.urlsProvider', function (context, urlsProvider) 
        {
            urlsProvider.registerUrl(context);
        }]);
//Configuraci�n m�dulo shirt
	var shirtModule = angular.module('shirtModule', ['CrudModule', 'MockModule']);

	shirtModule.constant('shirt.context', 'shirt');

	shirtModule.config(['shirt.context', 'MockModule.urlsProvider', function (context, urlsProvider) 
        {
            urlsProvider.registerUrl(context);
        }]);
    
    //Configuraci�n m�dulo shirt
	var shirtModule = angular.module('detailsModule', ['CrudModule', 'MockModule']);

	shirtModule.constant('details.context', 'details');

	shirtModule.config(['details.context', 'MockModule.urlsProvider', function (context, urlsProvider) 
        {
            urlsProvider.registerUrl(context);
        }]);
        
})();