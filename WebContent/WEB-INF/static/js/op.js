function addUser() {
	var username = $("#username").val();
	var password = $("#password").val();

	var user = new Object();

	if (username && password) {
		var url = "api/add";
		user.username = username;
		user.password = password;
		
		var result = sendJsonByPost(url, user);

		result.then(function(value) {
			if (value) {
				alert("添加成功啦!");
				location.reload();
			} else {
				alert("添加失败啦!");
			}
		}, function(reason) {
			alert("添加失败啦!");
		});
	}
}

function delUser(uid) {
	var url = "api/del";
	var user = new Object();
	user.uid = uid;
	if (confirm("要三思哦!")) {
		var result = sendDateByGet(url, user);
		result.then(function(value) {
			if (value) {
				alert("删除成功啦!");
				location.reload();
			} else {
				alert("删除失败啦!");
			}
		}, function(reason) {
			alert("删除失败啦!");
		});

	}
}

function getUser(uid) {
	uid = uid;
	var url = "api/user";
	var user = new Object();
	user.uid = uid;
	var result = getDateByGet(url, user);
	result.then(function(value) {
		$("#uid").val(value.uid);
		$("#uid").attr("disabled", "disabled");
		$("#new_username").val(value.username);
		$("#new_password").val(value.password);
		$("#new_status").val(value.status);
	}, function(reason) {
		alert("获取失败啦!");
	});
}

function updateUser() {
	var url = "api/update";
	var user = new Object();
	user.uid = $("#uid").val();
	user.username = $("#new_username").val();
	user.password = $("#new_password").val();
	user.status = $("#new_status").val();
	if (user.uid && user.username && user.password && user.status) {
		var result = sendJsonByPost(url, user);
		result.then(function(value) {
			if (value) {
				alert("更新成功啦!");
				location.reload();
			} else {
				alert("更新失败啦!");
			}
		}, function(reason) {
			alert("更新失败啦!");
		});
	}
}