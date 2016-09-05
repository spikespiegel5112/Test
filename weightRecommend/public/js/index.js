var InputWrapper = React.createClass({
	render: function() {
		return <div className='input_wrapper'>
					<ul>
						<li>
							<label>name</label>
							<input className='input_name' type='text' />
						</li>
						<li>
							<label>weight</label>
							<input className='input_weight' type='text' />
						</li>
					</ul>
					<a className='add' href="javascript:;" onClick={this.handleClick}>add</a>
				</div>
	},
	handleClick: function() {
		var inputObj = new Object();
		var trimWeight = function(options) {
			//默认的权重条目
			options = $.extend({
				'location': 50,
				'date': 75,
				'organization': 50,
				'keywords': 25
			}, options);

			var recommendNameArr = [],
				recommendWeightArr = [],
				weight = 1,
				maxFactor = 1,
				output = '';

			var outputTemplate = function(name, weight) {
				return '<li>' +
					'<label>' + name + '：</label>' +
					'<span>' + weight + '</span>' +
					'</li>';
			}

			for (var item in options) {
				recommendNameArr.push(item);
				recommendWeightArr.push(options[item]);
			}

			// recommendArr.sort(function(a, b) {
			//  return b - a;
			// });

			maxFactor = 100 / Math.max.apply(null, recommendWeightArr);
			for (var i = 0; i < recommendWeightArr.length; i++) {
				output += outputTemplate(recommendNameArr[i], recommendWeightArr[i] * maxFactor);
			}

			$('.output_wrapper').html('').append(output);
			console.log(recommendNameArr);
		}
		var nameVal = $('.input_name').val(),
			weightVal = window.parseInt($('.input_weight').val());

		if (nameVal != '' && $('.input_weight').val().replace(/[^1-9]{1}[^0-9]*/g, '') != '') {
			inputObj[nameVal] = weightVal;
		} else {
			inputObj = inputObj;
		}

		if (typeof weightVal != 'number') {
			alert('error');
			return;
		};
		trimWeight(inputObj);
	}
});
var OutputWrapper = React.createClass({
	render: function() {
		return <ul className='output_wrapper'></ul>
	}
});

var WeightTrimWrapper = React.createClass({
	render: function() {
		return <div className='weighttrim_wrapper'>
						<InputWrapper/>
						<OutputWrapper/>
					</div>
	},

})
var jsxContainer = document.getElementById('main_container');

ReactDOM.render(<WeightTrimWrapper/>, jsxContainer);