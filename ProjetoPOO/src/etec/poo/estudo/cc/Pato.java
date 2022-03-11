package etec.poo.estudo.cc;

import etec.poo.estudo.inter.IAnimal;
import etec.poo.estudo.sc.Animal;

public class Pato extends Animal implements IAnimal{

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "peixe";
	}

	@Override
	public String viver() {
		// TODO Auto-generated method stub
		return "lago";
	}

}
