package factory.factoryMethod;

public class ExportTextFile implements ExportFileApi {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("使用导出文本文件的方式，实现ExportFileApi中定义的导出功能;"+data);
		return true;
	}

}
