package model.exceptions;

public class DomainException extends RuntimeException{ //EXCEPTION QUANDO É OBRIGADO TRATA EXCEÃO IGUAL O PARSE, E RUNTIMEXCEPTION QUANDO NAO É OBRIGADO dai nao precisa do throws nos metodos, porem
    //se tiver uma exceção vai quebra o programa.

    public DomainException(String msg){
        super(msg);
    }
}
