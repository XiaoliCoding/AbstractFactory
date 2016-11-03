package abstractpattern;

public class Factory2 implements AbstractFactory{
	@Override
	public Food CreateFood(){
		return new Apple();//����Apple����
	}
	@Override
	public Shape CreateShape(){
		return new Triangle();
	}
}
