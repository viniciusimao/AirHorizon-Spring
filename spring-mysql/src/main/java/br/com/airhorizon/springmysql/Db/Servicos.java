package br.com.airhorizon.springmysql.Db;

import java.util.List;

import br.com.airhorizon.springmysql.entidades.Voos;

public interface Servicos {
    
    public List<Voos> listagem();

    public Voos guardarVoos(Voos voos);

    public Voos procurarID(Long id);

    public Voos atualizarVoos(Voos voos);

    public void deleteVoos(Long id);
}
