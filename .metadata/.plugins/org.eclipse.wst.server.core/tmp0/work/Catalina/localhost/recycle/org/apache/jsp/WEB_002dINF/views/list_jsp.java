/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-06-25 10:26:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/smhrd/Desktop/Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/recycle/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1717555027210L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Recycle Map</title>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("    <!-- 외부 스타일 css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/main.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/styles.css\" />\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://dapi.kakao.com/v2/maps/sdk.js?appkey=96fa0336ba0e9190eea3854401eb131e&libraries=clusterer,services\"></script>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"#\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"is-preload\">\r\n");
      out.write("    <div id=\"page-wrapper\">\r\n");
      out.write("        <!-- Header -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- 메뉴 버튼 및 검색 입력 필드 -->\r\n");
      out.write("        <div id=\"menu_btn\">\r\n");
      out.write("            <input type=\"text\" id=\"home\" onkeyup=\"if(window.event.keyCode==13){searchLocation()}\" placeholder=\"주소 입력\" />\r\n");
      out.write("            <br>\r\n");
      out.write("            <button type=\"button\" id=\"search\" onclick=\"searchLocation()\">현재위치 검색</button>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button onclick=\"toggleMarkers('trash')\">분리수거</button>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button onclick=\"toggleMarkers('lamp')\">폐형광등</button>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button onclick=\"toggleMarkers('battery')\">폐건전지</button>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button onclick=\"toggleMarkers('medicine')\">폐의약품</button>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button onclick=\"toggleMarkers('clothes')\">의류수거함</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("		<!-- 지도 표시 영역 -->\r\n");
      out.write("        <div id=\"map\" style=\"width: 100%; height: 705px;\"></div>\r\n");
      out.write("\r\n");
      out.write("		<!-- 외부 JavaScript 파일로 스크립트 분리 -->\r\n");
      out.write("        <script src=\"resources/js/map.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function() {\r\n");
      out.write("            	// 페이지 로드 시 각 타입의 마커를 로드\r\n");
      out.write("            	// 경로를 배열에 넣어 반복문 -> loadMarkers 함수 실행\r\n");
      out.write("                ['trash', 'lamp', 'battery', 'medicine', 'clothes'].forEach(loadMarkers);\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Scripts -->\r\n");
      out.write("    <script src=\"resources/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/browser.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/breakpoints.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/util.js\"></script>\r\n");
      out.write("    <script src=\"resources/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
