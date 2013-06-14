/**
 * 
 */
package ui.handler;

import java.util.Map;

import ui.bean.Page;

/**
 * @author zhangchenhao
 *
 *
 * 2013-5-14
 * 下午3:19:59
 *
 * TODO:
 */
public interface UiHandler {
	
	/**
	 * 返回可客户端呈现
	 * 
	 * @return
	 */
	Map<String,Page> getElements();
	
	
	String getName();
	
	UiHandler nextHandler();
	
}
