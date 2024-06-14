package Servlets;

public class UtilidadesServlets {
	
	public static String getCabecera(String titulo) {
		return "<!DOCTYPE html>\r\n"
				+ "<html lang=\"es\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>"+titulo+"</title>\r\n"
				+ "<link rel=\"stylesheet\" href=\"formato.css\">"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<header>\r\n"
				+ "		<h1>Cine MAX</h1>\r\n"
				+ "		<p>CINE DEL SUR</p>\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "	</header>"
				+ "    \r\n";
		
	}
	
	public static String getPie() {
		
		return"</body>\r\n"
				+ "</html>";
		
		
		
		
	}
	
	
	
	

}
