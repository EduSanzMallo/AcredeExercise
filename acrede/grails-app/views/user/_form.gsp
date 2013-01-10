<%@ page import="acrede.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="user.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" maxlength="10" required="" value="${userInstance?.username}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'postcode', 'error')} required">
	<label for="postcode">
		<g:message code="user.postcode.label" default="Postcode" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="postcode" from="${1..999}" class="range" required="" value="${fieldValue(bean: userInstance, field: 'postcode')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<%--<g:field type="email" name="email" required="" value="${userInstance?.email}"/>--%>
    <g:textField name="email" required="" value="${userInstance?.email}"/>
</div>

