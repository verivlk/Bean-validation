package com.github.verivlk;


//import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes(
        "javax.validation.Valid")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
//@AutoService(Processor.class)
public class BuilderProcessor extends AbstractProcessor {

  /*  @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        System.out.println("v builder procesoru");

        for (TypeElement annotation : annotations) {
            Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
            System.out.println("anotace");
            System.out.println(annotatedElements.toString());
            // …
        }

        return true;
    }

   */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "spusten proces");
        for ( TypeElement annotation : annotations ) {
            for ( Element element : roundEnv.getElementsAnnotatedWith(annotation) ) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "found bean validation (@Valid) at " + element);
            }
        }
        return true;
    }

}