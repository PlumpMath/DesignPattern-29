package factory.factoryMethod;

public abstract class ExportOperate {

	/**
	 * 
	 * 导出文件
	 * 
	 * @parm data 需要保存的数据
	 * @return 是否成功导出文件
	 */
	public boolean export(String data) {
		ExportFileApi api = factoryMethod();
		return api.export(data);  
	}

	protected abstract ExportFileApi factoryMethod();

}
