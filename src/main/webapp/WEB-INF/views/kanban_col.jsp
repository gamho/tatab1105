<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>kanban-col</title>
    </head>
    <!-- css 참조 -->
    <!-- <link rel="stylesheet" type="text/css" href="resources/css/board//kanban_col_css.css"> -->
<!-- script 참조 -->
    <script src="resources/js/jquery-3.3.1.min.js"></script>
    <script src="resources/js/jquery-ui.js"></script>
    
				
<body>
        <!-- kanban-col section start -->
                <div class="kanban-col-box" id="kanban-col-box">
                    <div class="kanban-col round-border">
                        <!-- 이름 start -->
                        <div class="kanban-head">
<!--                            <input type="text" class="col-title-input" autofocus>-->
                            <p class="col-title-show-1" >Notice</p>
                            <img class="toggle body-up-img" src="resources/img/board/sort-up.png">
                            <img class="toggle body-down-img" src="resources/img/board/sort-down.png">
                        </div>
                        <!-- 이름 end -->

                        <!-- 내용 start -->
                        <div class="kanban-body tasksortable" id="kanban-body">
                            <!-- task start -->
                           	<jsp:include page="/WEB-INF/views/kanban_task.jsp"/>
                            <!-- task end -->
                            <div class="add-task-line"></div>
                        </div>
                        <div class="add-task-box">
                            <a href="#"><i class="fas fa-plus-circle task-add-btn add"></i></a>
                        </div>
                    </div>
                </div>

</body>
</html>