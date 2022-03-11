package etec.poo.estudo.cc;

import etec.poo.estudo.inter.IAnimal;
import etec.poo.estudo.sc.Animal;

public class Lontra extends Animal implements IAnimal {

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "lagosta";
	}

	@Override
	public String viver() {
		// TODO Auto-generated method stub
		return "mar";
	}

}
