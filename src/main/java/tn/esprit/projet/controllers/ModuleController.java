package tn.esprit.projet.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.entities.Mdls;
import tn.esprit.projet.services.IMdlService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/module")
public class ModuleController {
    IMdlService mdlService ;
    @GetMapping("/retrieve-all-modules")
    @ResponseBody

    public List <Mdls> getAllModules() {
        List<Mdls> listModules = mdlService.retrieveAllMdls ();
        return listModules;
    }

    @GetMapping("/retrieve-module/{idModule}")
    public Mdls retrieveModule(@PathVariable ("idModule")Long idModule) {
        return mdlService.retrieveModule(idModule);
    }

    @PostMapping("/add-module")
    public Mdls addMdls(@RequestBody Mdls mdls) {
        Mdls modul = mdlService.addMdls(mdls);
        return  modul;
    }

    @PutMapping("update-module/{idModule}")
    public Mdls updateMdls(@PathVariable Long id, @RequestBody Mdls mdlsDetails) {
         Mdls modul = mdlService.updateMdls(id, mdlsDetails);

        return modul;
    }

    @DeleteMapping("delte-module/{idModule}")
    public void deleteMdls(@PathVariable ("idModule")  Long idModule) {
        mdlService.deleteMdls(idModule);
    }
}
