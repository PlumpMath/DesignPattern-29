package factory.factoryMethod;

public class ExportDBOperate extends ExportOperate{

	@Override
	protected ExportFileApi factoryMethod() {
		// TODO Auto-generated method stub
		return new ExportDB();
	}

}
