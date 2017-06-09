package br.ufrpe.social_network.dao;

public class PersonDAO {
    
	private Person[] person;
	private int next;
	
	public PersonDAO(int tamanho){
		this.person= new Person[tamanho];
		this.next=0;
	}
	
	public void cadastrar(Person p){
		this.person[this.next]= p;
		this.next = this.next + 1;
	}
	
	public Person find(long id){
		
		int i=0;
		boolean achar = false;
		
		while((achar != true) && (i<this.next)){
			if(id == this.person[i].getId()){
				return this.person[i];
				achar = true;
				
			}else{
				i++;
			}
		}
		
	}
	
	public void delete(long id){
		long encontrado = this.person.find(id);
		
		if(){
		
		}
		
	}
	
	
    //TODO implementar singleton para esta classe - PersonDAO
    
    //TODO Implementar CRUD para classe básica Person usando array
    
    /*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
    
}
