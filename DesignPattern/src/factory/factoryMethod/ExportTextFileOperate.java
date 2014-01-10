package factory.factoryMethod;

public class ExportTextFileOperate extends ExportOperate {

	@Override
	protected ExportFileApi factoryMethod() {
		// TODO Auto-generated method stub
		return new ExportTextFile();
	}

}
