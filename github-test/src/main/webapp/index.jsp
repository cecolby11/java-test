<html>
<body>
<h2>Welcome to Casey Test API!</h2>
<ul>
	<li><a target="_blank" href="http://localhost:8080/github-test/rest/hello/text">GET /text</a></li>
	<li><a target="_blank" href="http://localhost:8080/github-test/rest/hello/test">GET /test</a></li>
	<li><a target="_blank" href="http://localhost:8080/github-test/rest/hello/json">GET /json</a></li>
	<li><a target="_blank" href="http://localhost:8080/github-test/rest/hello/sampletext">GET /your_text_here</a></li>
</ul>
<h3>Or send a post request in postman to test the conversion of a string into a java object!</h3>
<ul>
	<li>
		request url: http://localhost:8080/github-test/rest/hello/json
	</li>
	<li>request method: POST</li>
	<li>request body: {results: "hello there to you!"}</li>
</ul>
</body>
</html>
