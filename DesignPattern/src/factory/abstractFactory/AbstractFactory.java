package factory.abstractFactory;

/**
 *ProcutA和ProcutB的具体实现，两者的实现是有关系的，不是独立的，两者的实现，是耦合的。
 *
 * 比方说，对于一个最终的电脑来说，它的主板和CPU这两个对象是有关系的。
 * 某个特定的主板适合特定的CPU。
 * ProductA,可以比作是主板;ProductB可以比作是CPU。
 * 
 * ---------------
 * 每个实现抽象工厂接口的具体工厂类，代表一种组合结果。
 * 
 */
public interface AbstractFactory {


	public AbstractProductA createProductA();
	
	public AbstractProductB createProductB();
	
}
