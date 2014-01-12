package factory.abstractFactory;

/**
 * 抽象工厂模式
 * 
 * 
 * 工厂模式，在不知道一个对象的具体实现时，可以进行编码。 抽象工厂模式，在不知道多个对象的具体实现时，可以进行编码；
 * 而这多个对象的创建顺序，及对象的匹配是有影响的，不是随便创建的。
 * 
 * -------------------
 * 
 * *ProcutA和ProcutB的具体实现，两者的实现是有关系的，不是独立的，两者的实现，是耦合的。
 *
 * 比方说，对于一个最终的电脑来说，它的主板和CPU这两个对象是有关系的。
 * 某个特定的主板适合特定的CPU。
 * ProductA,可以比作是主板;ProductB可以比作是CPU。
 * 
 * ---------------
 * 每个实现抽象工厂接口的具体工厂类，代表一种组合结果。
 * 如下面，有两种组合结果，一种是type1，一种是type2。这两个结果的区别是，
 * 其中在创建多个对象时，对象间的创建史有差异的。
 * 
 * 而工厂方法，它只创建一个对象。这个对象，可能有多种不同的实现，
 * 但是，它最终，还只是一个对象而已，不是多个对象。
 * 工厂方法，它可以有多个种类，但是每个种类，只是表示一种创建对象的方式，
 * 不表示创建多个对象；比如，在factory.factoryMethod包中，
 * 有两种工厂子类，ExportTextFileOperate,ExportDBOperate，它们
 * 各自代表创建一种具体的对象。
 * 
 * -----------------
 * 而抽象工厂方法，它的具体实现子类，表示一种对象组合，
 * 比如，在下面中，type1这种，创建ProductA1，就一定要创建ProductB1，
 * 不可以创建ProductB2。表示一种组合结果。
 * 
 * 
 */
public class Client {

	public static void main(String[] args) {
		AbstractFactory type1 = new ConcreteFactory1();
		System.out.println("" + type1.createProductA().myConcreteName()
				+ " and " + type1.createProductB().myConcreteName());
		
		AbstractFactory type2 = new ConcreteFactory2();
		System.out.println("" + type2.createProductA().myConcreteName()
				+ " and " + type2.createProductB().myConcreteName());
		

	}

}
