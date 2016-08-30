(function(e) {
	"function" == typeof define && define.amd ? define(["jquery"], e) : e(jQuery)
})(function(e) {
	var main = {
		remresizing: function() {
			$.remResizing({
				fontsize: 20
			})
		}
	}
	main.remresizing();
})
