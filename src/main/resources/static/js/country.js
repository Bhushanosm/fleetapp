$('document').ready(function(){
	
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		// /countries/findById/?id=1
		
		var href = $(this).attr('href');
		
		$.get(href, function(country, status){
			$('#idEdit').val(country.id);
			$('#nameEdit').val(country.name);
			$('#capitalEdit').val(country.capital);
			$('#codeEdit').val(country.code);
			$('#continentEdit').val(country.continent);
			$('#nationalityEdit').val(country.nationality);
		});
		
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();
		
		var href= $(this).attr('href');
		
		$.get(href, function(country, status){
			$('#idDetails').val(country.id);
			$('#nameDetails').val(country.name);
			$('#codeDetails').val(country.code);
			$('#capitalDetails').val(country.capital);
			$('#nationalityDetails').val(country.nationality);
			$('#continentDetails').val(country.continent);
		});
		$('#detailsModal').modal();
	});
	
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
	
	$('[data-toggle="tooltip"]').tooltip();
});
