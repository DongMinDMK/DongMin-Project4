<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Static Navigation - SB Admin</title>
        <link href="admin/css/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="">Home</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            
            <!-- Navbar Search-->
            <!-- <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
                    <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
                </div>
            </form> -->
            
            <!-- 로그아웃 -->
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                	Admin 관리
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            
                            <div class="collapse" id="collapseLayouts" > <!-- aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion"-->
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="twoving.do?command=adminProductList">시리즈/영화 리스트</a>
                                    <a class="nav-link" href="productList_test.jsp">공지사항 리스트</a>
                                    <a class="nav-link" href="productList_test.jsp">FAQ 리스트</a>
                                    <a class="nav-link" href="productList_test.jsp">고객문의 리스트</a>
                                </nav>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
            
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <!-- <h1 class="mt-4">Static Navigation</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                            <li class="breadcrumb-item active">Static Navigation</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-body">
                                <p class="mb-0">
                                    This page is an example of using static navigation. By removing the
                                    <code>.sb-nav-fixed</code>
                                    class from the
                                    <code>body</code>
                                    , the top navigation and side navigation will become static on scroll. Scroll down this page to see an example.
                                </p>
                            </div>
                        </div> -->
                        
                        <article>
							<form method = "post" name="frm">
							<div class="tb">
								<div class="row">
									<div class="col" style="display:flex; align-items : center; border:3px solid black;">
										시리즈/영화명 : &nbsp;<input type="text" name="key" value="${key}">
										&nbsp;&nbsp;&nbsp;
										<div>
										
										<!-- <a href="twoving.do?command=adminLogout"> -->
										<img src="admin/images/search.png" style="width:30px; cursor: pointer;" onClick="go_search( 'adminProductList' )">
										
										<!-- <input class="btn" type="button" name="btn_search" value="검색"
										onClick="go_search( 'adminProductList' )">	 -->			
										</div>
										&nbsp;&nbsp;&nbsp;
										<input type="button" 
										style="margin-left: auto; background-color: black; color:white; border:none; font-size: 90%; cursor: pointer;" 
										value="시리즈/영화 등록" onclick="go_wrt();">	
									</div>
								</div>
								<!-- <br> -->
								<div class="row">			
									<div class="coltitle" style="flex:0.5;">번호</div>
									<div class="coltitle" style="flex:1;">종류</div>
									<div class="coltitle" style="flex:2;">장르</div>
									<div class="coltitle" style="flex:4;">제목</div>
									<div class="coltitle" style="flex:0.8;">Best유무</div> <!-- best/use/new -->
									<div class="coltitle" style="flex:0.8;">Use유무</div>
									<div class="coltitle" style="flex:0.8;">New유무</div>
								</div>
								<c:forEach items="${productList}" var="productVO">
									<div class="row">
										<div class="col" style="flex:0.5;">${productVO.pseq}</div>
										<div class="col" style="flex:1;">
											<c:if test="${productVO.kind eq '0'}">시리즈</c:if>
											<c:if test="${productVO.kind eq '1'}">영화</c:if>
										</div>
										<div class="col" style="flex:2;">${productVO.genre}</div>
										<div class="col" style="flex:4;">
											<a href="#" onClick="go_detail( '${productVO.pseq}' )">
												${productVO.title}
											</a>	
										</div>
										<div class="col" style="flex:0.8;">
											<c:choose>
												<c:when test="${productVO.bestyn=='N'}">일반</c:when>
												<c:otherwise><span style="font-weight: bold; color:blue;">Best</span></c:otherwise>
											</c:choose>
										</div>
										<div class="col" style="flex:0.8;">
											<c:choose>
												<c:when test="${productVO.useyn=='N'}"><span style="font-weight: bold; color:red;">미사용</span></c:when>
												<c:otherwise>사용</c:otherwise>
											</c:choose>
										</div>
										<div class="col" style="flex:0.8;">
											<c:choose>
												<c:when test="${productVO.newyn=='N'}">일반</c:when>
												<c:otherwise><span style="font-weight: bold; color:green;">New</span></c:otherwise>
											</c:choose>
										</div>
									</div>
								</c:forEach>
								<jsp:include page="/admin/paging/paging.jsp">
									<jsp:param value="twoving.do?command=adminProductList" name="address" />
								</jsp:include>
							</div>
							</form>
						</article>
                        
                        
                        <div style="height: 100vh"></div>
                    </div>
                </main>
            </div>
            
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </body>
</html>

