package br.edu.inf011.aval3.enunciado.proxy;
import br.edu.inf011.aval3.enunciado.model.Perfil;
import br.edu.inf011.aval3.enunciado.service.Classificador;
import br.edu.inf011.aval3.enunciado.service.NivelPerfil;
//PROXY em um PROXY
public class LocalClassificadorPerfil implements Classificador {
    private Perfil perfil;
	private boolean habilitado;
    private Classificador classificadorCliente;
    
	public LocalClassificadorPerfil(Perfil perfil,Classificador classificadorCliente,String user,String pwd) {
		this.perfil = perfil;
        this.classificadorCliente=classificadorCliente;
        this.habilitado = perfil.getUser().equalsIgnoreCase(user) &&
        perfil.getPwd().equalsIgnoreCase(pwd); 
	}

    public NivelPerfil nivel()  {
        if(!habilitado) return NivelPerfil.NAO_VERIFICADO;
        return this.classificadorCliente.nivel();
	}

    @Override
	public Perfil getPerfil() {
		return this.perfil ;
	}

}
