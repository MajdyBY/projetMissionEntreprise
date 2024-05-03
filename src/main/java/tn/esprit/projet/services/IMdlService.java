package tn.esprit.projet.services;

import tn.esprit.projet.entities.Mdls;

import java.util.List;

public interface IMdlService {
    List < Mdls > retrieveAllMdls();
    Mdls retrieveModule(Long idModule);
    Mdls addMdls(Mdls mdls);
    Mdls updateMdls(Long idModule, Mdls mdlsDetails);
    void deleteMdls(Long idModule);
}
