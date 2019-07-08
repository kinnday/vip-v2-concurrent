package cn.enjoyedu.ch7.dcl;

/**
 * 在域上运用延迟 初始化 占位类  模式
 */
public class InstanceLazy {
	
	private Integer value;
	private Integer heavy;//成员变量很耗资源， 使用频率很低： 要求 用的时候再赋值 ;
	
    public InstanceLazy(Integer value) {
		super();
		this.value = value;
	}

//	内部定义一个延迟占位类， 用的时候再初始化
	private static class InstanceHolder{
        public static Integer val = new Integer(100);
    }

	public Integer getValue() {
		return value;
	}

	public Integer getVal() {
		return InstanceHolder.val;
	}

}
