/*
 * Allow backspace key 
 */
$(':password, :text, textarea').keydown(function(e){
	if(e.keyCode==8){
	  e.stopPropagation();
	  return true;
	}
});


/*
 * Prevent backspace key & function keys (F1-F12)
 */
$(window).keydown(function(e,sender){
	if(		
			e.keyCode == 8 /*backspace*/
			|| (112<=e.keyCode && e.keyCode<=123) /*F1-F12*/ 
	){
		$('#msg_area').text("keyCode[" + e.keyCode + "] は無効化されました。");
		/*
		event.keyCode = null;
		event.returnValue = false;
		*/
		return false;
	}
	if(e.keyCode == 107 /*Plus Key*/){
		var evt = jQuery.Event("keydown",{keyCode:9});
		console.log(sender);
		$(this).trigger(evt);
		return false;
	}
	$('#msg_area').text("keyCode[" + e.keyCode + "] が押されました。");
});
