package br.com.meuprimeiroprojeto.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meuprimeiroprojeto.entidades.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	Empresa findByCnpj(String cnpj);
}
