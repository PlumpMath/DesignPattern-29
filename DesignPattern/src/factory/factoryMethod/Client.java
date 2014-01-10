package factory.factoryMethod;

/**
 *客户端只知道一个统一的数据导出接口，ExportOperate。
 *但是，在实际实现该数据导出接口时，会有各种不同的实现，但是，客户端不会理会。
 *客户端，只关注，它所能操作和它所知道的ExportOperate接口，其他的，它不理会。
 *客户端，只理会，我操作了export方法，就实现了数据的导出功能，至于具体是怎么实现的，
 *客户端不理会。
 *
 * 在这样一种，客户端，只理会当前接口提供的一个服务，而实现接口定义下的服务，会有多种实现，多种实现都是实现了同一个接口，
 * 这个时候，就可以采用工厂模式。
 * 
 * 比如，下面这个例子，
 * ExportOperate提供了数据导出服务，至于该服务有多少种实现方式，客户端不理会。
 * 
 * 比如，在这个例子中，该服务，有两种实现方式，一种是ExportDBOperate,一种是ExportTextFileOperate,
 * 这两种，都可以向上转型到ExportOperate。
 * 客户端，只关注ExpoertOperate中定义的公共方法。
 * 
 * 在ExpoertOperate中，提供的服务是文件的导出功能，在提供这个服务的时候，只需要定义该服务的接口，
 * 用ExportFileApi，然后，至于具体类是如何实现文件导出的功能，ExportOperate不关注。
 * 实现文件导出功能，在这个例子中，有使用文本导出的方式实现文件导出功能，有使用数据库导出的方式实现文件导出功能。
 * 
 * 要使用这些不同的功能时，就必须是不同的实现ExportOperate中的方法的类来提供。
 * 
 * 设计模式的好处，必须是结合场景来考虑的，每个设计模式有适用场景。
 * 
 * 工厂模式：
 * 当你，定义好一个接口，比如，文件导出功能。然后，在实际开发中，有不同的实现。
 * 这个时候，你再定义一个抽象类，描述的是，根据已经定义好的文件导出接口进行的导出操作。
 * 也就是说，某个服务的特点是确定的，但是该服务有不同的实现，在这样的场景下，就可以使用工厂方法。
 * 它的好处是，代码不会因为服务的不同实现而做出修改，正如，ExportOperate中的操作，不会因为
 * ExportFileApi的不同实现而改变，反正我只是关注ExportFileApi中的定义好的方法，我的操作，
 * 也是基于ExportFileApi中定义的方法，而至于实现类是怎样实现ExportFileApi，我是不关注的。
 * 另外，我也不关注ExportOperate的具体实现类中，是如何实现的，总之，我只关注ExportOperate中
 * 定义好的接口。
 * 
 */
public class Client {

	public static void main(String[] args)
	{
		ExportOperate textFileOperate = new ExportTextFileOperate();
		ExportOperate dbOperate = new ExportDBOperate();
		
		textFileOperate.export("something");
		dbOperate.export("something_use_db_export");
	}
}
