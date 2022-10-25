package br.com.airhorizon.springmysql.Db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.airhorizon.springmysql.entidades.Voos;
import br.com.airhorizon.springmysql.repositorio.VooRepotorio;


@Service
public class ServicosImpl implements Servicos{

    @Autowired
    private VooRepotorio repotorio;

    @Override
    public List<Voos> listagem() {
        
        return repotorio.findAll() ;
    }

    @Override
    public Voos guardarVoos(Voos voos) {
        
        return repotorio.save(voos);
    }

    @Override
    public Voos procurarID(Long id) {

        return repotorio.findById(id).get();
    }

    @Override
    public Voos atualizarVoos(Voos voos) {
        return repotorio.save(voos);
    }

    @Override
    public void deleteVoos(Long id) {
        repotorio.deleteById(id);
        
    }

  

   
    
}
