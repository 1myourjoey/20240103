<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button onClick="test()">CLICK</button>
	<h1 id="title">hello JSP</h1>
	<h1 class="title2">HELLO JSP2</h1>

	<script>
		function test() {
			let str = document.getElementById("title");
			let str2 = document.querySelector("#title");
			let str3 = document.querySelector(".title2");

			console.log("hello world", 'this will be shown', str, str2, str3);
			str.innerHTML = "테스트";

		}
	</script>

</body>
</html>