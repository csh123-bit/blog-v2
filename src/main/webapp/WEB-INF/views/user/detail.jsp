<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../include/nav.jsp"%>

<div class="container">
	<div class=card>
		<div class="card-header">
			<h4 class="card-title">제목</h4>

		</div>
		<div class="card-body">
			<p class="card-text">내용</p>


			<div class="card-footer">
				<button
					id="post--update--submit"
					class="btn btn-warning">수정</button>
				<button
					id="post--delete--submit"
					class="btn btn-danger">삭제</button>
				<a href="/" class="btn btn-primarㅛ">목록</a>
			</div>
		</div>
	</div>
	<div class=card>
		<div class="card-header">
			<h4 class="card-title">제목</h4>

		</div>
		<div class="card-body">
			<p class="card-text" id="content">내용</p>


			<div class="card-footer">
				<button
					id="content-save--submit"
					class="btn btn-primary">등록</button>
			</div>
		</div>
	</div>
</div>

<div class="card">
	<div class="form-group">
		<div class="card-header">
			<h4 class="card-title">댓글<리스트 /h4>
		</div>
		<div class="comment--items card-body">
			<span class="comment--item card-body">댓글 내용</span>
				<span class="comment--content">댓글 내용</span>
				<span id="comment--delete--submit" value="1">X</span>
			<span class="comment--item card-body">댓글 내용</span>
				<span id="comment--delete--submit" value="2">X</span>

		</div>
	</div>
</div>

<%@include file="../include/footer.jsp"%>