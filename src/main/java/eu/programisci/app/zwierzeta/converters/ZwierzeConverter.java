package eu.programisci.app.zwierzeta.converters;

import eu.programisci.app.zwierzeta.dto.ZwierzeDTO;
import eu.programisci.app.zwierzeta.ob.ZwierzeOB;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZwierzeConverter {

    public ZwierzeDTO obToDto(ZwierzeOB in){
        ZwierzeDTO out = new ZwierzeDTO();
        out.setId(in.getId());
        out.setDataUtworzenia(in.getDataUtworzenia());
        out.setGatunek(in.getGatunek());
        out.setNazwa(in.getNazwa());
        out.setPlec(in.getPlec());
        out.setWiek(in.getWiek());
        return out;
    }

    public ZwierzeOB DtoToOb(ZwierzeDTO in){
        ZwierzeOB out = new ZwierzeOB();
        out.setId(in.getId());
        out.setDataUtworzenia(in.getDataUtworzenia());
        out.setGatunek(in.getGatunek());
        out.setNazwa(in.getNazwa());
        out.setPlec(in.getPlec());
        out.setWiek(in.getWiek());
        return out;
    }

    public List<ZwierzeDTO> obListToDtoList(List<ZwierzeOB> inList){
        if (inList == null){
            return null;
        }
        List<ZwierzeDTO> outList = new ArrayList<>();
        for (ZwierzeOB in : inList){
            outList.add(obToDto(in));
        }
        return outList;
    }

}
