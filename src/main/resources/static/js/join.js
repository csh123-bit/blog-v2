/**
 * 회원가입 로직
 */

	$('#join--submit').on('click', function() {
	var data = {
		username : $('#username').val(),
		password : $('#password').val(),
		email : $('#email').val()
	};

	$.ajax({
		type : 'post',
		url : '/user/join',
		data : JSON.stringify(data),
		contentType : 'application/json; charset=utf-8',
		dataType : 'json'
	}).done(function(r) {
		if (r.statusCode == 200) {
			alert('회원가입 성공');
			location.href = '/user/login';
		} else {
			if (r.msg == '아이디 중복') {
				alert('아디디가 중복되었습니다');
			} else {
				alert('회원가입 실패');
			}
		}

	}).fail(function(r) {
		alert('회원가입 실패');
	});
});
