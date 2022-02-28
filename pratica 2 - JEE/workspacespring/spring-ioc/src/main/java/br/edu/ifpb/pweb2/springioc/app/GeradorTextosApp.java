package br.edu.ifpb.pweb2.springioc.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.edu.ifpb.pweb2.springioc.configuration.DocumentGenerationConf;
import br.edu.ifpb.pweb2.springioc.gerador.GeradorDocumentoIntf;

public class GeradorTextosApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            DocumentGenerationConf.class);
        GeradorDocumentoIntf gerador = context.getBean(GeradorDocumentoIntf.class);

        gerador.addTexto("Olá amigo");
        gerador.addTexto("Como vai você?");

        context.close();
    }
}
