package br.com.airhorizon.springmysql.entidades;

import javax.persistence.*;

@Entity
@Table(name = "Voo")
public class Voos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "localVoo", nullable = false)
    private String localVoo;

    @Column(name = "cliVoo", nullable = false)
    private String cliVoo;

    @Column(name = "nameCli", nullable = false)
    private String nameCli;

    public long getIdVoo() {
        return id;
    }

    public void setIdVoo(long id) {
        this.id = id;
    }

    public String getLocalVoo() {
        return localVoo;
    }

    public void setLocalVoo(String localVoo) {
        this.localVoo = localVoo;
    }

    public String getCliVoo() {
        return cliVoo;
    }

    public void setCliVoo(String cliVoo) {
        this.cliVoo = cliVoo;
    }

    public String getNameCli() {
        return nameCli;
    }

    public void setNameCli(String nameCli) {
        this.nameCli = nameCli;
    }

    @Override
    public String toString() {
        return "Voos [idVoo=" + id + ", localVoo=" + localVoo + ", cliVoo=" + cliVoo + ", nameCli=" + nameCli + "]";
    }
}
