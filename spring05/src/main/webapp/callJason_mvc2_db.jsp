<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    table {
        border-collapse: collapse;
        width: 800px;
    }

    table, th, td {
        border: 2px solid black;
    }

    th, td {
        padding: 10px;
        text-align: center;
    }
</style>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
$(function() { 
    $('#b3').click(function() {
        $.ajax({
            url: "jsonbbs",
            success: function(array) {
                console.log(array) ;
                
                header = "<tr><td width=200><b>아이디</b></td><td><b>제목</b></td><td width=200><b>내용</b></td><td width=200><b>작성자</b></td></tr>";
                mid = "";

                $(array).each(function(i, json) { 
                    //function(인덱스저장변수, 하나씩꺼내서넣어줄변수) 순서대로 써주어야함.
                    id_value = json.id
                    title_value = json.title
                    content_value = json.content
                    writer_value = json.writer
                    
                    mid += "<tr><td width=200>" + id_value + "</td><td width=200>" + title_value + "</td><td width=200>" + content_value + "</td><td width=200>" + writer_value + "</td></tr>";
                }); //for
                
                $('#result').html("<table>" + header + mid + "</table>");
            }//success
        });//ajax
    });//b3
});//$
</script>
</head>
<body>
	<button id="b3">JSON으로 받아와보자(list)</button>
	<hr color="red">
	<div id="result" style="background: yellow; width:800px; hegith:800px;">ajax통신 결과들어가는 곳.<hr></div>
</body>
</html>