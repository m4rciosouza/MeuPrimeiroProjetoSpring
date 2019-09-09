package br.com.meuprimeiroprojeto.parametrosspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RestController
public class ParametrosSpring {
	
	@Value​(​"${paginacao.qtd_por_pagina}"​)
	private int ​qtdPorPagina​;
	
}
