package eu.programisci.app.zwierzeta.dto;

import eu.programisci.app.zwierzeta.enums.EGatunek;
import eu.programisci.app.zwierzeta.enums.EPlec;

import java.util.Date;

/**
 * Created by student on 13.06.17.
 */
public class ZwierzeDTO {
    private Long id;
    private String nazwa;
    private EGatunek gatunek;
    private EPlec plec;
    private Integer wiek;

    public ZwierzeDTO(){}

    public ZwierzeDTO(Long aId, String aNazwa, EGatunek aGatunek, EPlec aPlec, Integer aWiek){
        id = aId;
        nazwa = aNazwa;
        gatunek = aGatunek;
        plec = aPlec;
        wiek = aWiek;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public EGatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(EGatunek gatunek) {
        this.gatunek = gatunek;
    }

    public EPlec getPlec() {
        return plec;
    }

    public void setPlec(EPlec plec) {
        this.plec = plec;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }
}
