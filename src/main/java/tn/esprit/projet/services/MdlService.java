package tn.esprit.projet.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.projet.entities.Mdls;
import tn.esprit.projet.repositories.MdlRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class MdlService  implements IMdlService{
     MdlRepository mdlRepository ;
    @Override
    public List < Mdls > retrieveAllMdls() {

        return mdlRepository.findAll ()  ;
    }

    @Override
    public Mdls retrieveModule(Long idModule) {

        return mdlRepository.findById ( idModule ).orElse ( null );
    }



    @Override
    public Mdls addMdls(Mdls mdls) {

        return mdlRepository.save ( mdls );
    }

    @Override
    public Mdls updateMdls(Long idModule, Mdls mdlsDetails) {
        Mdls mdls = retrieveModule(idModule);
        if (mdls != null) {
            mdls.setNommodule (mdlsDetails.getNommodule ());
            mdls.setCoefficient(mdlsDetails.getCoefficient());
            return  mdlRepository.save(mdls);
        }
        return null;
    }

    @Override
    public void deleteMdls(Long idModule) {
        mdlRepository.deleteById ( idModule );

    }
}
