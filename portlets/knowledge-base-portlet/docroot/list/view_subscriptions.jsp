<%--
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/list/init.jsp" %>

<liferay-util:include page="/list/top_links.jsp" servletContext="<%= application %>" />

<liferay-portlet:renderURL varImpl="iteratorURL" />

<liferay-ui:search-container
	delta="<%= articlesDelta %>"
	headerNames="title,version"
	iteratorURL="<%= iteratorURL %>"
>
	<liferay-ui:search-container-results>

		<%
		List<Subscription> subscriptions = SubscriptionLocalServiceUtil.getUserSubscriptions(user.getUserId(), Article.class.getName());

		List<Article> articles = ArticleServiceUtil.getArticles(scopeGroupId, StringUtil.split(ListUtil.toString(subscriptions, "classPK"), 0L), WorkflowConstants.STATUS_APPROVED, new ArticleModifiedDateComparator());

		pageContext.setAttribute("results", ListUtil.subList(articles, searchContainer.getStart(), searchContainer.getEnd()));
		pageContext.setAttribute("total", articles.size());
		%>

	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="com.liferay.knowledgebase.model.Article"
		keyProperty="resourcePrimKey"
		modelVar="article"
	>
		<portlet:renderURL var="rowURL" windowState="<%= articleWindowState %>">
			<portlet:param name="jspPage" value="/list/view_article.jsp" />
			<portlet:param name="resourcePrimKey" value="<%= String.valueOf(article.getResourcePrimKey()) %>" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			property="title"
		/>

		<c:if test="<%= ArticlePermission.contains(permissionChecker, article, ActionKeys.SUBSCRIBE) %>">
			<liferay-ui:search-container-column-text
				align="right"
			>
				<portlet:actionURL name="unsubscribeArticle" var="unsubscribeArticleURL">
					<portlet:param name="redirect" value="<%= currentURL %>" />
					<portlet:param name="resourcePrimKey" value="<%= String.valueOf(article.getResourcePrimKey()) %>" />
				</portlet:actionURL>

				<liferay-ui:icon
					image="unsubscribe"
					label="<%= true %>"
					url="<%= unsubscribeArticleURL %>"
				/>
			</liferay-ui:search-container-column-text>
		</c:if>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

	<c:if test="<%= total == 0 %>">
		<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
	</c:if>
</liferay-ui:search-container>