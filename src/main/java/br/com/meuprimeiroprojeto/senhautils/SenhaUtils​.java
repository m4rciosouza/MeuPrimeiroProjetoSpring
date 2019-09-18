package br.com.meuprimeiroprojeto.senhautils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils​{
	
	/**
	 * ​Gera​ ​um​ ​hash​ ​utilizando​ ​o​ ​BCrypt.
	 * 
	 * @param senha
	 * @return String
	 */
	public static String gerarBcrypt(String senha){
		
		if(senha == null) {
			return senha;
		}
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		
		return bCryptEncoder.encode(senha);
	}
	
	/**
	 * Verifica se a senha e valida
	 * 
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean
	 */
	public static boolean senhaValida (String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(senha, senhaEncoded);
	}
}
