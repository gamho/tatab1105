$(document).ready(function() {
	
	$(document).on("mouseover", '#list', function(e) {
        $(this).css('background-color','red');
    });
	$(document).on("mouseout", '#list', function(e) {
		$(this).css('background-color','darkgrey');
    });
	
});