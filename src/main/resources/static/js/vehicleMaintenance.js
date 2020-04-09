$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(vehicleMaintenance, status){
			$('#idEdit').val(vehicleMaintenance.id);
			$('#ddlVehicleEdit').val(vehicleMaintenance.vehicleid);
			
			var startDate = vehicleMaintenance.startDate.substr(0,10);
			$('#startDateEdit').val(startDate);
			$('#remarksEdit').val(vehicleMaintenance.remarks);
			
			var endDate = vehicleMaintenance.endDate.substr(0,10);
			$('#endDateEdit').val(endDate);
			$('#ddlSupplierEdit').val(vehicleMaintenance.supplierid);
			$('#priceEdit').val(vehicleMaintenance.price);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(vehicleMaintenance, status){
			$('#idDetails').val(vehicleMaintenance.id);
			$('#ddlVehicleDetails').val(vehicleMaintenance.vehicleid);
			
			var startDate = vehicleMaintenance.startDate.substr(0,10);
			$('#startDateDetails').val(startDate);
			$('#remarksDetails').val(vehicleMaintenance.remarks);
			
			var endDate = vehicleMaintenance.endDate.substr(0,10);
			$('#endDateDetails').val(endDate);
			$('#ddlSupplierDetails').val(vehicleMaintenance.supplierid);
			$('#priceDetails').val(vehicleMaintenance.price);
		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
	
	$('[data-toggle="tooltip"]').tooltip();
	
});