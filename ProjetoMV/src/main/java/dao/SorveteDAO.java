package dao;

import java.util.List;

public interface SorveteDAO {
	//adicionar o objeto sorvete no método.
	//remover e listar
	//metodos genéricos para reutilizar no futuro.
	
	public List buscarTodos(Object obj);

	public void inserir(Object obj);

	public void remover(Class classe, Object primaryKey);
		
	
	
	

}
