$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(invoice, status){
			$('#idEdit').val(invoice.id);
			$('#ddlClientEdit').val(invoice.clientid);
			
			var invoicedate = invoice.invoiceDate.substr(0,10);
			$('#invoiceDateEdit').val(invoicedate);
			
			$('#ddlStatusEdit').val(invoice.invoicestatusid);
			$('#remarksEdit').val(invoice.remarks);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(invoice, status){
			$('#idDetails').val(invoice.id);
			$('#ddlClientDetails').val(invoice.clientid);
			
			var invoicedate = invoice.invoiceDate.substr(0,10);
			$('#invoiceDateDetails').val(invoicedate);
			
			$('#ddlStatusDetails').val(invoice.invoicestatusid);
			$('#remarksDetails').val(invoice.remarks);
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