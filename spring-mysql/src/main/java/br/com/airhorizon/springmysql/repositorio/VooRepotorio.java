package br.com.airhorizon.springmysql.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.airhorizon.springmysql.entidades.Voos;

@Repository
public interface VooRepotorio extends JpaRepository<Voos, Long> {
    
}
