$(function() {
	var date = new Date(),
		getFullYear = date.getFullYear(),
		getMonth = date.getMonth(),
		getDay = date.getDay(),
		getHours = date.getHours(),
		getMinutes = date.getMinutes(),
		getSeconds = date.getSeconds(),
		timestamp = getFullYear.toString() + getMonth.toString() + getDay.toString() + getHours.toString() + getMinutes.toString() + getSeconds.toString(),
		client_id=100009,
		CLIENTID=client_id+'|'+timestamp,
		INFO='mQyqTv44z59oFWf2XLJf9UViA3vts7bsNsDFh9yqzWp2fH3xQOW7SzMqSXDpgNmuZMzG2TXPGgLhTcBgyuz1V80NmYyvxnoPSUoNvy2MBn4DFEj9QgM5+N+SGrTjrxha38OTIeAlzQ8j2aqljpgo3o6QY41GXUx3HDgk0SufR6A=',
		urlString='https://test.dakaqi.cn:81/token?client_id='+CLIENTID+'&info='+INFO

		console.log(urlString);
		$.ajax({
			type: 'POST',
			url: "https://test.dakaqi.cn:81/token?client_id="+CLIENTID+"&info="+INFO,
			dataType: 'json',
			success: function(data) {
				console.log(data);
			}
		})

})

//MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC0FhAal1diWCkErdynsiCaw9yKuNTs7OQwoP4rYivCNXe2bgATYRrSXNih3V+UzCdIcKZr/YI2zXOdNHwxJmORmqd+vDcDm7PeFlqWHX4tiMAEiHfvJ6r3rXW2oYhNeajvX/TqPmGF/sKsIrmFitbQfzMVjQ8RiCwDIkqRed6seQIDAQAB