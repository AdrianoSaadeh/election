package br.edu.ulbra.election.election.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {
	
	//GET / - Página inicial do VOTER. Aqui se faz cadastro.
	@RequestMapping("/resultados")
    public String home(){
        return "<!--Javascript description in the same page as the form: -->\r\n" + 
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
        		" \r\n" + 
        		"</script>\r\n" + 
        		"<body style=\"background: #e4e4e4; width: 1000px; margin: 0 auto; font-family: 'Open Sans';\">\r\n" + 
        		"<div class=\"menu-link\" style=\"text-align: center; margin: 0 auto; width: 600px; font-family: 'Open Sans'; margin-top: 20px;\">\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; border-radius: 10px 0 0 10px; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8081/cadastro\" style=\"text-decoration: none; color: #000;\">VOTER</a>\r\n" + 
        		"		</div>\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8082/cadastro\" style=\"text-decoration: none; color: #000;\">CANDIDATE </a>\r\n" + 
        		"		</div>\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8083/cadastro\" style=\"text-decoration: none; color: #000;\">PARTY </a> \r\n" + 
        		"		</div>\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; border-radius: 0 0 0 0;  padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8084/cadastro\" style=\"text-decoration: none; color: #000;\">ELECTION  </a>\r\n" + 
        		"		</div>\r\n" + 
        		"		<div style=\"float: left; border: 1px solid #cacaca; border-radius: 0 10px 10px 0;  padding:8px; width: 100px; text-align: center;\"> \r\n" + 
        		"		<a href=\"http://localhost:8081/login\" style=\"text-decoration: none; color: #000;\"><strong>VOTAR</strong>  </a>\r\n" + 
        		"		</div>\r\n" + 
        		"	</div>\r\n" + 
        		"	<br>\r\n" + 
        		"	<div style=\"width: 200px; margin: 0 auto; margin-top: 30px; text-align: center;font-weight: 600;\">\r\n" + 
        		"		ELECTION - RESULT\r\n" + 
        		"	</div>\r\n" + 
        		"	<div style=\"background: #fff; padding: 30px; width: 800px; margin: 0 auto; margin-top: 10px; border-radius: 10px;	padding-top: 50px;box-shadow: 0 8px 36px -6px black;\">\r\n" + 
        		"\r\n" + 
        		"		\r\n" + 
        		"		<div style=\"margin-top: 10px; \">\r\n" + 
        		"		Resultados por Candidato:\r\n" + 
        		"		\r\n" + 
        		"		<form id=\"myForm1\" target=\"_blank\">\r\n" + 
        		"			<input name=\"candidateId\" id=\"candidateId\" placeholder=\"ID candidato\" type=\"text\" >\r\n" + 
        		"			<a href=\"#\" onclick=\"this.href='http://localhost:8084/v1/result/candidate/'+document.getElementById('candidateId').value\" >\r\n" + 
        		"			<input type=\"button\" value=\"Buscar \">\r\n" + 
        		"			\r\n" + 
        		"			</a>\r\n" + 
        		"        </form >\r\n" + 
        		"		\r\n" + 
        		"		\r\n" + 
        		"		<hr>\r\n" + 
        		"		<div style=\"margin-top: 20px; \">\r\n" + 
        		"		Resultados por Eleição:\r\n" + 
        		"		\r\n" + 
        		"		<form id=\"myForm1\" target=\"_blank\">\r\n" + 
        		"			<input name=\"electionId\" id=\"electionId\" placeholder=\"ID eleição\" type=\"text\" >\r\n" + 
        		"			<a href=\"#\" onclick=\"this.href='http://localhost:8084/v1/result/candidate/'+document.getElementById('electionId').value\" >\r\n" + 
        		"			<input type=\"button\" value=\"Buscar \">\r\n" + 
        		"			\r\n" + 
        		"			</a>\r\n" + 
        		"        </form >\r\n" + 
        		"		\r\n" + 
        		"		<hr>\r\n" + 
        		"		\r\n" + 
        		"		<div style=\"margin-top: 20px; \">\r\n" + 
        		"		Votos por Eleitor:\r\n" + 
        		"		\r\n" + 
        		"		<form id=\"myForm1\" target=\"_blank\">\r\n" + 
        		"			<input name=\"voterId\" id=\"voterId\" placeholder=\"ID eleitor\" type=\"text\" >\r\n" + 
        		"			<a href=\"#\" onclick=\"this.href='http://localhost:8084/v1/result/candidate/'+document.getElementById('voterId').value\" >\r\n" + 
        		"			<input type=\"button\" value=\"Buscar \">\r\n" + 
        		"			\r\n" + 
        		"			</a>\r\n" + 
        		"        </form >\r\n" + 
        		"		\r\n" + 
        		"		<hr>\r\n" + 
        		"		\r\n" + 
        		"		\r\n" + 
        		"		<div style=\"margin-top: 20px; \">\r\n" + 
        		"		Votos por Eleitor:\r\n" + 
        		"		\r\n" + 
        		"		<form id=\"myForm1\" target=\"_blank\">\r\n" + 
        		"			<input name=\"voterId\" id=\"voterId\" placeholder=\"ID eleitor\" type=\"text\" >\r\n" + 
        		"			<a href=\"#\" onclick=\"this.href='http://localhost:8084/v1/vote/findVotesByVoter/'+document.getElementById('voterId').value\" >\r\n" + 
        		"			<input type=\"button\" value=\"Buscar \">\r\n" + 
        		"			\r\n" + 
        		"			</a>\r\n" + 
        		"        </form >\r\n" + 
        		"		\r\n" + 
        		"		<hr>\r\n" + 
        		"		\r\n" + 
        		"\r\n" + 
        		"		</div>\r\n" + 
        		"</body>\r\n" + 
        		"\r\n" + 
        		""
        		
        		
        		
        		;
    }/*ate aqui ok*/
	
}
