/**
 * 
 * 以Post方式发送json数据到服务器
 * @param url 发送数据的URL
 * @param date 你要发送的json对象,自动转换为字符串
 * @returns 服务器返回 
 * 	{ "status":200 } 成功 返回true
 * 	{ "status":500 } 失败 返回false
 */

function sendJsonByPost(url, date) {
	return new Promise(function(resolve, reject) {
		$.ajax({
			url : url,
			type : "POST",
			contentType : "application/json",
			cache : false,
			data : JSON.stringify(date),
			success : function(result) {
				if (result.status == 200) {
					resolve(true)
				}
				if (result.status == 500) {
					resolve(false)
				}
			},
			error : function(err) {
				reject(false)
			},
			timeout : function() {
				reject(false)
			}
		});

	});
}

/**
 * 以Get方式发送到服务器key-value型数据
 * @param url 发送数据的URL
 * @param date 你要发送的key-value对象,自动转换
 * @returns
 * 	{ "status":200 } 成功 返回true
 * 	{ "status":500 } 失败 返回false
 */
function sendDateByGet(url, date) {
	return new Promise(function(resolve, reject) {
		$.ajax({
			url : url,
			type : "GET",
			cache : false,
			data : date,
			success : function(result) {
				if (result.status == 200) {
					resolve(true)
				}
				if (result.status == 500) {
					resolve(false)
				}
			},
			error : function(err) {
				reject(false)
			},
			timeout : function() {
				reject(false)
			}
		});

	});
}

/**
 * 以Post方式发送到服务器key-value型数据
 * @param url 发送数据的URL
 * @param date 你要发送的key-value对象,自动转换
 * @returns
 * 	{ "status":200 } 成功 返回true
 * 	{ "status":500 } 失败 返回false
 */
function sendDateByPost(url, date) {
	return new Promise(function(resolve, reject) {
		$.ajax({
			url : url,
			type : "POST",
			cache : false,
			data : JSON.stringify(date),
			success : function(result) {
				if (result.status == 200) {
					resolve(true)
				}
				if (result.status == 500) {
					resolve(false)
				}
			},
			error : function(err) {
				reject(false)
			},
			timeout : function() {
				reject(false)
			}
		});

	});
}
/**
 * 获得以Post方式从服务器获得数据
 * @param url 获得数据的URL
 * @param date 发送参数的key-value对象,自动转换
 * @returns 成功返回json 对象 失败返回error
 */
function getDateByPost(url, date) {
	return new Promise(function(resolve, reject) {
		$.ajax({
			url : url,
			type : "POST",
			cache : false,
			data : date,
			success : function(result) {
				resolve(result)
			},
			error : function(err) {
				reject("error")
			},
			timeout : function() {
				reject("error")
			}
		});

	});
}

/**
 * 获得以Get方式从服务器获得数据
 * @param url 发送数据的URL
 * @param date 发送参数的key-value对象,自动转换
 * @returns 成功返回json 对象 失败返回error
 */
function getDateByGet(url, date) {
	return new Promise(function(resolve, reject) {
		$.ajax({
			url : url,
			type : "GET",
			cache : false,
			data : date,
			success : function(result) {
				resolve(result)
			},
			error : function(err) {
				reject("error")
			},
			timeout : function() {
				reject("error")
			}
		});

	});
}