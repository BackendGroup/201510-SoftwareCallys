(function () {
    var purchaseModule = angular.module('purchaseModule', ['CrudModule', 'MockModule']);
    purchaseModule.constant('purchase.context', 'purchases');
    purchaseModule.constant('purchase.skipMock', true);
    purchaseModule.config(['purchase.context', 'MockModule.urlsProvider', 'purchase.skipMock', function (context, urlsProvider, skipMock)
    {
        urlsProvider.registerUrl(context, skipMock);
    }]);
})();