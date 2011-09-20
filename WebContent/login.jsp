<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <p align="center">
        <font size=15 face="bold">Clouding Projects</font>
        <br/>    
        <br/>        
        <img src="imagens/biblioteca.png"/>
    </p>

    <br/><br/>
    
    		
        <table align="center">
        		<tr>
        			<td>
        				<font color="red">${param.mensagem}</font>
        			</td>
        		</tr>
            <tr>
            	
                <td align="center">
                    <form action="logar.do" method="get">
                        Login:<input name="login" type="text" /><br/>
                        Senha:<input name="senha" type="password" /><br/><br/>
                        <input name="btEntrar" type="submit" value="Entrar"/>
                    </form>
                </td>
            </tr>    
        </table>
        
          
    </body>
</html>