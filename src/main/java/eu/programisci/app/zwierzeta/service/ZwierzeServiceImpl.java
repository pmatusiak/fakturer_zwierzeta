package eu.programisci.app.zwierzeta.service;

import eu.programisci.app.zwierzeta.converters.ZwierzeConverter;
import eu.programisci.app.zwierzeta.dto.ZwierzeDTO;
import eu.programisci.app.zwierzeta.ob.ZwierzeOB;
import eu.programisci.app.zwierzeta.repository.IZwierzeRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Service
public class ZwierzeServiceImpl implements IZwierzeService{

    @Autowired
    private IZwierzeRepository zwierzeRepository;

    @Autowired
    private ZwierzeConverter zwierzeConverter;

    @Override
    public ZwierzeDTO findOne(Long id){
        ZwierzeOB ob = zwierzeRepository.findOne(id);
        ZwierzeDTO dto = zwierzeConverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<ZwierzeDTO> findAllForTable(){
        List<ZwierzeOB> obList = zwierzeRepository.findAll();
        List<ZwierzeDTO> dtoList = zwierzeConverter.obListToDtoList(obList);
        return dtoList;
    }

    @Override
    public void deleteOne(Long id) { zwierzeRepository.delete(id);}

    @Override
    public ZwierzeDTO save(ZwierzeDTO dto){
        if (dto.getId() == null) {
            return zwierzeConverter.obToDto(create(dto));
        } else {
            return zwierzeConverter.obToDto(update(dto));
        }
    }

    private ZwierzeOB create(ZwierzeDTO dto){
        ZwierzeOB ob = zwierzeConverter.DtoToOb(dto);
        ob.setDataUtworzenia(new Date());
        ob = zwierzeRepository.save(ob);
        return ob;
    }

    private ZwierzeOB update(ZwierzeDTO dto){
        ZwierzeOB ob = zwierzeRepository.findOne(dto.getId());
        ob.setWiek(dto.getWiek());
        ob.setPlec(dto.getPlec());
        ob.setNazwa(dto.getNazwa());
        ob.setGatunek(dto.getGatunek());
        ob = zwierzeRepository.save(ob);
        return ob;
    }
}
