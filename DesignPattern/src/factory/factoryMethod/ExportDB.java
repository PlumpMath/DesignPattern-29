package factory.factoryMethod;

public class ExportDB implements ExportFileApi {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("使用数据库的方式，实现ExportFileApi中定义的文件导出功能"+data);
		return true;
	}

}
