<%@ page contentType="text/html"%>
 <html>

<body>
     
    <jsp:useBean id="computer" class="elect.ComputerBean" scope="session" />  
    <jsp:setProperty name="computer" property="*" />
      <FORM action="" method=post name=form>
          <input type=text name="numberOne" value=<jsp:getProperty name="computer" property="numberOne" /> size=6>
          <Select name="operator">
              <Option value="+">+
                  <Option value="-">-
                  <Option value="*">*
                  <Option value="/">/
                  </Select>
          <Input type=text name="numberTwo" value=<jsp:getProperty name="computer" property="numberTwo" /> size=6> =
        <jsp:getProperty name="computer" property="result" />
          <BR><INPUT type="submit" value="submit your choice" name="submit">
          </FORM>
      
      </body>

</html>
<%@ page import="elect.*" %>     //