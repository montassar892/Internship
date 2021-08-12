package com.datasphera.drools.Configuration;

import java.io.File;

import com.datasphera.drools.Models.Applicant;
import com.datasphera.drools.Models.Loan;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.Message;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoanConfiguration {
    private static final String drlFile = "rule.drl";
    private Logger log = LoggerFactory.getLogger(LoanConfiguration.class);

    /*@Bean
    public KieContainer kieContainer() {
        KieBaseModel model = new KieBaseModel();
        KieServices ks = KieServices.Factory.get();
        KieRepository kr = ks.getRepository();
        KieFileSystem kfs = ks.newKieFileSystem();

        kfs.write(ResourceFactory.newClassPathResource("rule.drl", this.getClass()));

        KieBuilder kb = ks.newKieBuilder(kfs);

        kb.buildAll(); // kieModule is automatically deployed to KieRepository if successfully built.
        if (kb.getResults().hasMessages(Message.Level.ERROR)) {
            throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
        }

        KieModule kieModule = kb.getKieModule();
        log.info("Kie release ID:" + kieModule.getReleaseId());

        KieContainer kContainer = ks.newKieContainer(kr.getDefaultReleaseId());

        KieSession kSession = kContainer.newKieSession();

        Applicant applicant = new Applicant("Montassar", 25);
        Loan loan = new Loan(false, 1000);
        kSession.insert(applicant);
        kSession.insert(loan);

        log.info(applicant.toString());
        log.info(loan.toString());
        log.info("==================");

        System.out.println("Fire All Rules...");
        kSession.fireAllRules();
        kSession.dispose();
        log.info(applicant.toString());
        log.info(loan.toString());
        return kContainer;
        try
        {
            KieServices kieServices = KieServices.Factory.get();

            KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
            File file = ResourceUtils.getFile(drlFile);
            log.info("File path: " + file.getName());
            org.kie.api.io.Resource resource = kieServices.getResources().newFileSystemResource(file)
                    .setResourceType(ResourceType.DRL);
            kieFileSystem.write(resource);
            // kieFileSystem.write(ResourceFactory.newClassPathResource(drlFile));
            KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
            kieBuilder.buildAll();
            KieModule kieModule = kieBuilder.getKieModule();
    
            return kieServices.newKieContainer(kieModule.getReleaseId());
        }
        catch (Exception ex) {
            log.error("Could not load kie server", ex);
            return null;
        }
        return null;
    }*/
}