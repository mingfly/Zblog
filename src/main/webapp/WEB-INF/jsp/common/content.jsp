<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:if test="${post.type=='post'}">
<div id="bread_crumb">
  <ul class="clearfix">
   <li><a title="首页" href="${g.domain}">首页</a></li>
   <li><a href="${g.domain}/categorys/${post.categoryName}">${post.categoryName}</a></li>
   <li class="last">${post.title}</li>
  </ul>
</div>
</c:if>
<div class="post_wrap clearfix">
  <div class="post">
   <h3 class="title"><span>${post.title}</span></h3>
   <div class="post_content">${post.content}</div>
  </div>
  <div class="meta">
    <ul>
     <li class="post_date clearfix">
       <span class="date"><fmt:formatDate value="${post.createTime}" pattern="dd" /></span>
       <span class="month"><fmt:formatDate value="${post.createTime}" pattern="MMM"/></span>
       <span class="year"><fmt:formatDate value="${post.createTime}" pattern="yyyy" /></span>
     </li>
     <li class="post_comment">${post.rcount}人阅读</li>
     <li class="post_author">
      <a title="由${post.nickName}发布" href="#">${post.nickName}</a>
     </li>
     <c:if test="${post.type=='post'}">
       <li class="post_category"><a href="${g.domain}/categorys/${post.categoryName}">${post.categoryName}</a></li>
     </c:if>
     <li class="post_comment">
       <a title="${post.title}" href="#respond">发表评论</a>
     </li>
    </ul>
  </div>
</div>
