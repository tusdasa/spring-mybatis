<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-theme.min.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
</head>
<body>
	<div class="row clearfix">
		<div class="col-md-2 column"></div>
		<div class="col-md-8 column">

			<h2>Mybatis + Spring MVC 增删改查</h2>
			<table class="table table-condensed table-striped">
				<thead>
					<tr>
						<th>UID</th>
						<th>用户名</th>
						<th>状态</th>
						<th>操作</th>
						<th>更新</th>

					</tr>
				</thead>
				<tbody>
				<c:if test="${ functions:length(users) eq 0 }">
					<tr><td>没有数据哦!</td><tr>
				</c:if>
					<c:if test="${ users ne null }">
						<c:forEach items="${ users }" var="u">
							<tr>
								<td>${ u.uid }</td>
								<td>${ u.username }</td>
								<td>${ u.status }</td>
								<td>
									<button type="button" class="btn btn-block btn-sm btn-primary"
										onclick="delUser(${ u.uid })">删除</button>
								</td>
								<td><a type="button" id="modal-457281"
									href="#modal-container-001" role="button"
									class="btn btn-block btn-sm btn-primary" data-toggle="modal"
									onclick="getUser(${ u.uid })">编辑</a></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
		<div class="col-md-2 column"></div>
	</div>

	<div class="row clearfix">
		<div class="col-md-4 column"></div>
		<div class="col-md-4 column">
			<a type="button" id="modal-457281" href="#modal-container-002"
				role="button" class="btn btn-block btn-sm btn-primary"
				data-toggle="modal">添加用户</a>

		</div>
		<div class="col-md-4 column"></div>
	</div>
	<div class="row clearfix" >
	<div class="col-md-12 column">
		<div style="width: 100%;height: 300px;"></div>
	</div>
	</div>
	<div class="row clearfix" >
		<div class="col-md-4 column"></div>
		<div class="col-md-4 column">
			<c:forEach step="1" end="${ page-1 }" begin="0" varStatus="varSta">
				<ul class="pagination">
					<li><a href="?page=${varSta.index}">${varSta.count}</a></li>
				</ul>
			</c:forEach>
		</div>
		<div class="col-md-4 column"></div>
	</div>
	<div class="modal fade" id="modal-container-001" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">更新</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="username">UID</label> <input type="text"
							class="form-control" name="uid" id="uid" />
					</div>
					<div class="form-group">
						<label for="username">用户名</label> <input type="text"
							class="form-control" name="new_username" id="new_username" />
					</div>
					<div class="form-group">
						<label for="username">密码</label> <input type="text"
							class="form-control" name="new_password" id="new_password" />
					</div>
					<div class="form-group">
						<label for="username">状态</label> <input type="text"
							class="form-control" name="new_status" id="new_status" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="updateUser()">保存</button>
				</div>
			</div>

		</div>

	</div>

	<div class="modal fade" id="modal-container-002" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">更新</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="username">用户名</label> <input type="text"
							class="form-control" name="text" id="username" />
					</div>
					<div class="form-group">
						<label for="password">密码</label> <input type="text"
							class="form-control" name="text" id="password" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="addUser()">添加</button>
				</div>
			</div>

		</div>

	</div>

</body>
<script type="text/javascript" src="js/op.js"></script>
</html>