(function () 
{

	var mainApp = angular.module('mainApp', ['ngRoute', 'homeModule', 'stampModule']);

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

        
})();