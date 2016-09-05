var http=require('http');

http.creatServer(function (request, response){
	response.writeHead(200,{'Content-Type':'text/plain'});
	response.end('Hello World');
}).listen(8888);

console.log('aaa')