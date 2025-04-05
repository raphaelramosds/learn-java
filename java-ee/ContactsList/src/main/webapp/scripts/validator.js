/**
 * Contacts form validator
 * @author rapha
 */

$(function () {
		
	window.validate = function () {
		
		if (!contactForm.name.value) {
			alert("Preencha o campo nome");
			contactForm.name.focus();
			return false;
		}
		
		if (!contactForm.phone.value) {
			alert("Preencha o campo telefone");
			contactForm.phone.focus();
			return false;
		}
		
		document.forms["contactForm"].submit();
	} 

	$(".btn-create-contact").on('click', function () {
		validate();		
	})
});