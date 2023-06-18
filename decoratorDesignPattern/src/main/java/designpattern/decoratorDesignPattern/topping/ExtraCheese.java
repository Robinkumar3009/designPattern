package designpattern.decoratorDesignPattern.topping;

import designpattern.decoratorDesignPattern.basePizza.BasePizza;

public class ExtraCheese implements Topping {

	BasePizza basePizza;
	
	public ExtraCheese(BasePizza basePizza)
	{
		 this.basePizza=basePizza;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basePizza.cost()+10;
	}

}
