<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <!-- font awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">   
   
    <!-- topMenu_projects.css -->
    <link rel="stylesheet" type="text/css" href="resources/css/topMenu/topMenu_projects.css">
     
    <head>
    	<script>
		$(document).ready(function() {
			// 프로젝트 버튼 클릭시 자신의 프로젝트 호출 
			$('#projectsBtn').click(function() {
				console.log("click");
				$.ajax({
					url : "boardProjectList.do",
					type : "post",
			
					success : function(data) {
						$('#wrapper').empty();
						for(i=0; i<data.length; i++) {
							console.log("ooo"+data[i]+""); 
							
							var tag1= '<div id="list" class="list['+i+']"><p style="width:50px;"><i class="fas fa-bolt"></i>'+
		                    '<div class="projectName" style="font-size:25px;">';
		                    var tag2 = '</div></p></div>'
						
		                    var tag = tag1+ data[i] + tag2;
		                    
		                    
		                    $(tag).hide().appendTo('#wrapper').show();
						}
					}
				});
			});
			
			// 프로젝트 검색
			$('#searchProject').keyup(function() {
				var input = $(this).val();
				$('#wrapper > div').hide();
				$(".projectName:contains('"+ input +"')").parent().show();
			})
			
			// 동적으로 처리할때 document.on (이벤트, 선택자, 함수(무명함수))
			// 여기서 $(this) 는 선택된 div를 바로 가르킨다 그 하위에서 찾기
			$(document).on('click', '#list', function(){
				var projectName = $(this).find('.projectName').text();
	    		console.log(projectName);
	    		
	    		$('.hiddenForm').val(projectName);
				$('.hiddenProjectName').submit();
				return false;
			})
		})
    	</script>
    </head>
     
    <body>
        <div>
            <h2>Projects</h2>
            
            <form>
                <input id="searchProject" type="text" placeholder="Search Project">
            </form>
            
            <div id="wrapper">
           		<!-- proejctList ajax 들어간 자리 -->
            </div>
        </div>
        
        <!-- 프로젝트 list submit -->
	    <form method="post" class="hiddenProjectName" action="board.do">
	    	<input class="hiddenForm" type="hidden" name="projectNames">
	    </form>
		<!-- 프로젝트 list submit -->
    </body>
</html>