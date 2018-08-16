<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<script type="text/javascript" src="js/login.js"></script>
</div>
<div id="regLogin" class="wrap">
		<div class="dialog">
			<div class="box">
				<h4>用户登录</h4>
				<form id="User_login" name="User_login">
					<div class="infos">
						<table class="field">
							<tr>
								<td  colspan="2" style="text-align:center; color:red"></td>
							</tr>
							<tr>
								<td class="field">用 户 名：</td>
								<td>
									 <input type="text" name="username" value="" id="User_login_action_name" class="text" required="true"/>
								</td>
							</tr>
							<tr>
								<td class="field">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
								<td>
									<input type="password" name="password" id="User_login_action_password" class="text" required="true"/>
								</td>
							</tr>
						</table>
						<div class="buttons">
							<input type='button' value='立即登录' onclick='userLogin()' />
							<input type='button' value='注册' onclick='document.location="register.jsp"' />
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
<%@include file="botton.jsp" %>

