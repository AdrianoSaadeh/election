package br.edu.ulbra.election.election.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteController {
	
	//GET / - Página inicial do VOTER. Aqui se faz cadastro.
	@RequestMapping("/vote")
    public String home(){
        return "<head>\r\n" + 
        		"	<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.7.1.js\"></script>\r\n" + 
        		"		<script type=\"text/javascript\">\r\n" + 
        		"		$(function(){\r\n" + 
        		"			$('#areaCode,#firstNum,#secNum,#thirNum').keyup(function(e){\r\n" + 
        		"				if($(this).val().length==$(this).attr('maxlength'))\r\n" + 
        		"					$(this).next(':input').focus()\r\n" + 
        		"			})\r\n" + 
        		"		});\r\n" + 
        		"		\r\n" + 
        		"	\r\n" + 
        		"		\r\n" + 
        		"		</script>\r\n" + 
        		"		\r\n" + 
        		"		<!--Javascript Code in the same page as the form: -->\r\n" + 
        		"   <script type=\"text/javascript\">\r\n" + 
        		"$.fn.serializeObject = function()\r\n" + 
        		"{\r\n" + 
        		"    var o = {};\r\n" + 
        		"    var a = this.serializeArray();\r\n" + 
        		"    $.each(a, function() {\r\n" + 
        		"        if (o[this.name] !== undefined) {\r\n" + 
        		"            if (!o[this.name].push) {\r\n" + 
        		"                o[this.name] = [o[this.name]];\r\n" + 
        		"            }\r\n" + 
        		"            o[this.name].push(this.value || '');\r\n" + 
        		"        } else {\r\n" + 
        		"            o[this.name] = this.value || '';\r\n" + 
        		"        }\r\n" + 
        		"    });\r\n" + 
        		"    return o;\r\n" + 
        		"};\r\n" + 
        		"\r\n" + 
        		"$(function() {\r\n" + 
        		"    $('form').submit(function() {\r\n" + 
        		"        $('#result').text(JSON.stringify($('form').serializeObject()));\r\n" + 
        		"        return false;\r\n" + 
        		"    });\r\n" + 
        		"});\r\n" + 
        		" </script>\r\n" + 
        		"	</head>\r\n" + 
        		"	<div style=\"width: 800px;margin: 0 auto;\">\r\n" + 
        		"	<div class=\"menu-link\" style=\"text-align: center; margin: 0 auto; width: 600px; font-family: 'Open Sans'; margin-top: 20px;\">\r\n" + 
        		"			<div style=\"float: left; border: 1px solid #cacaca; border-radius: 10px 0 0 10px; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"			<a href=\"http://localhost:8081/cadastro\" style=\"text-decoration: none; color: #000;\">VOTER</a>\r\n" + 
        		"			</div>\r\n" + 
        		"			<div style=\"float: left; border: 1px solid #cacaca; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"			<a href=\"http://localhost:8082/cadastro\" style=\"text-decoration: none; color: #000;\">CANDIDATE </a>\r\n" + 
        		"			</div>\r\n" + 
        		"			<div style=\"float: left; border: 1px solid #cacaca; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"			<a href=\"http://localhost:8083/cadastro\" style=\"text-decoration: none; color: #000;\">PARTY </a> \r\n" + 
        		"			</div>\r\n" + 
        		"			<div style=\"float: left; border: 1px solid #cacaca; border-radius: 0 0 0 0;  padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"			<a href=\"http://localhost:8084/cadastro\" style=\"text-decoration: none; color: #000;\">ELECTION  </a>\r\n" + 
        		"			</div>\r\n" + 
        		"			<div style=\"float: left; border: 1px solid #cacaca; border-radius: 0 10px 10px 0;  padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"			<a href=\"http://localhost:8081/login\" style=\"text-decoration: none; color: #000;\"><strong>VOTAR</strong>  </a>\r\n" + 
        		"			</div>\r\n" + 
        		"		</div>\r\n" + 
        		"		<br>\r\n" + 
        		"		<div style=\"font-family: 'Open Sans'; width: 200px; margin: 0 auto; margin-top: 30px; text-align: center;font-weight: 600;\">\r\n" + 
        		"			VOTAÇÃO\r\n" + 
        		"		</div>\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"		<div>\r\n" + 
        		"		<br>\r\n" + 
        		"			<div style=\"border-bottom: 100px solid #cec9b6;border-left: 30px solid transparent;border-right: 30px solid transparent;height: 0; font-family: 'Open Sans';\">\r\n" + 
        		"			</div>\r\n" + 
        		"			<div style=\"border: 10px solid #c5bdaa; height: 300; padding: 30px; background: radial-gradient(ellipse at center, rgba(218,212,200,1) 44%,rgba(196,185,159,1) 100%); font-family: 'Open Sans';border-radius: 0 0 8px 8px; box-shadow: 0 8px 36px -6px black;\">\r\n" + 
        		"			\r\n" + 
        		"				<div style=\"background: linear-gradient(to right, rgba(230,230,230,1) 0%,rgba(193,193,193,1) 98%); width: 65%; text-align: center; height: 300px; float: left; border: 2px solid #a9a6a6;\">\r\n" + 
        		"					\r\n" + 
        		"					\r\n" + 
        		"					<div style=\"margin-top: 20px; margin-bottom: 20px; font-weight: 600;\">\r\n" + 
        		"						AQUI VAI O NOME DO CARGO\r\n" + 
        		"					</div>\r\n" + 
        		"					\r\n" + 
        		"										\r\n" + 
        		"					<form name=\"votacao\" >\r\n" + 
        		"					<div  class=\"codigo-candidate\" style=\"margin-left: 10px; text-align: left; display: inline-block; width: 400px;\">\r\n" + 
        		"					NÚMERO: \r\n" + 
        		"\r\n" + 
        		"					<input type=\"text\" id=\"ans\" value=\"\" class=\"inputs\"  id=\"areaCode\" maxlength=\"5\" onkeypress=\"if (!isNaN(String.fromCharCode(window.event.keyCode))) return true; else return false;\" style=\"background: transparent; width: 180px; border: 1px solid; height: 35px; font-size: 25px; letter-spacing: 20px; text-align: center; padding-left: 15px; padding-right: 10px;\" id=\"digitos\"  autofocus></input>\r\n" + 
        		"					</form>\r\n" + 
        		"						\r\n" + 
        		"						\r\n" + 
        		"					</div>\r\n" + 
        		"					<div style=\"margin-top: 0px;margin-left: 10px; text-align: left; display: inline-block; width: 400px; \">\r\n" + 
        		"					NOME:\r\n" + 
        		"					<br/><br/>\r\n" + 
        		"					</div>	\r\n" + 
        		"					<div style=\"margin-left: 15px; text-align: left; display: inline-block; width: 400px; \">\r\n" + 
        		"					PARTIDO:\r\n" + 
        		"					</div>	\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<hr style=\"border: 1px solid;\">\r\n" + 
        		"					<div style=\"margin-left: 10px; text-align: left; display: inline-block; width: 500px; font-size: 12px;\">\r\n" + 
        		"					APERTE AS TECLAS:<BR>\r\n" + 
        		"					VERDE: para CONFIRMAR este voto<BR>\r\n" + 
        		"					LARANJA: para REINICIAR este voto<BR>\r\n" + 
        		"					BRANCO: para votar em BRANCO\r\n" + 
        		"					</div>	\r\n" + 
        		"					\r\n" + 
        		"					\r\n" + 
        		"				</div>\r\n" + 
        		"				\r\n" + 
        		"				\r\n" + 
        		"				<div style=\"background: #464545; color:#fff; width: 30%; float: right; text-align: center; height: 300px;\">\r\n" + 
        		"					<div style=\"display: inline-block;\">\r\n" + 
        		"					<img src=\"https://cdn.awsli.com.br/588/588953/arquivos/logo_JE.png\" style=\"width:216px;\">\r\n" + 
        		"					</div>\r\n" + 
        		"				\r\n" + 
        		"					<div style=\"padding: 5px; font-family: 'Open Sans';\">\r\n" + 
        		"						<div style=\" margin-top: 10px; margin-bottom: 5px; display: inline-block;\">\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-right: 5px; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\" value=\"1\" onClick=\"document.votacao.ans.value+='1'\">\r\n" + 
        		"								1\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-right: 5px; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"  value=\"2\" onClick=\"document.votacao.ans.value+='2'\">\r\n" + 
        		"								2\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"  value=\"3\" onClick=\"document.votacao.ans.value+='3'\" >\r\n" + 
        		"								3\r\n" + 
        		"							</div>\r\n" + 
        		"						</div>\r\n" + 
        		"						\r\n" + 
        		"						<div style=\" margin-bottom: 5px; display: inline-block;\">\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-right: 5px; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"  value=\"4\" onClick=\"document.votacao.ans.value+='4'\">\r\n" + 
        		"								4\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-right: 5px; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"  value=\"5\" onClick=\"document.votacao.ans.value+='5'\">\r\n" + 
        		"								5\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"  value=\"6\" onClick=\"document.votacao.ans.value+='6'\" >\r\n" + 
        		"								6\r\n" + 
        		"							</div>\r\n" + 
        		"						</div>\r\n" + 
        		"						\r\n" + 
        		"						<div style=\" margin-bottom: 5px; display: inline-block; \">\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-right: 5px; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"  value=\"7\" onClick=\"document.votacao.ans.value+='7'\">\r\n" + 
        		"								7\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-right: 5px; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"  value=\"8\" onClick=\"document.votacao.ans.value+='8'\">\r\n" + 
        		"								8\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer;float: left; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"   value=\"9\" onClick=\"document.votacao.ans.value+='9'\">\r\n" + 
        		"								9\r\n" + 
        		"							</div>\r\n" + 
        		"						</div>\r\n" + 
        		"						\r\n" + 
        		"						\r\n" + 
        		"						<div style=\" margin-bottom: 15px; display: inline-block; \">\r\n" + 
        		"							<div style=\"float: left; margin-right: 5px; width: 60px; border: 1px solid #464545; background: #464545; font-size: 25px;  border-radius: 5px;\" >\r\n" + 
        		"								\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-right: 5px; width: 60px; border: 1px solid #000; background: #000; font-size: 25px;  border-radius: 5px;\"  value=\"0\" onClick=\"document.votacao.ans.value+='0'\">\r\n" + 
        		"								0\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"float: left; width: 60px; border: 1px solid #464545; background: #464545; font-size: 25px;  border-radius: 5px;\" >\r\n" + 
        		"								\r\n" + 
        		"							</div>\r\n" + 
        		"						</div>\r\n" + 
        		"						\r\n" + 
        		"						\r\n" + 
        		"						\r\n" + 
        		"						<div style=\" margin-bottom: 5px; display: inline-block; text-align: center; font-weight: 600; font-family: 'Open Sans';\">\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-top: 14px; margin-right: 5px; width: 60px; border: 1px solid #fff; background: #fff; font-size: 10px;  border-radius: 5px; color: #000;  font-family: 'Open Sans';\" >\r\n" + 
        		"								BRANCO\r\n" + 
        		"								<BR><BR>\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; margin-top: 14px; margin-right: 5px; width: 60px; border: 1px solid #f09d51; background: #f09d51; font-size: 10px;  border-radius: 5px; color: #000;  font-family: 'Open Sans';\"value=\"2\" onClick=\"document.votacao.ans.value=''\" >\r\n" + 
        		"								CORRIGE\r\n" + 
        		"								<BR><BR>\r\n" + 
        		"							</div>\r\n" + 
        		"							\r\n" + 
        		"							<div style=\"cursor: pointer; float: left; width: 60px; border: 1px solid #3cab64; background: #3cab64; font-size: 10px;  border-radius: 5px; color: #000;  font-family: 'Open Sans';\" >\r\n" + 
        		"								CONFIRMA\r\n" + 
        		"								<BR><BR><BR>\r\n" + 
        		"							</div>\r\n" + 
        		"						</div>\r\n" + 
        		"						\r\n" + 
        		"					</div>\r\n" + 
        		"				</div>\r\n" + 
        		"				\r\n" + 
        		"				\r\n" + 
        		"			</div>\r\n" + 
        		"\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 75px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 145px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 215px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 285px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 355px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 425px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 495px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 565px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 635px;float: left;\"></div>\r\n" + 
        		"			<div style=\"width: 5px;border: 1px solid;height: 20px;background: #000;margin-top: -22px;margin-left: 710px;float: left;\"></div>\r\n" + 
        		"		</div>\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"	</div><br><br>\r\n" + 
        		"	"
        		
        		
        		
        		;
    }/*ate aqui ok*/
	
}
