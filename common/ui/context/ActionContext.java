/**
 * 
 */
package ui.context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author weibinbin
 * 
 * 
 *         Jul 17, 2013 5:26:10 PM
 * 
 *         TODO:
 */
public class ActionContext implements ServletContextListener {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.ServletContextListener#contextInitialized(javax.servlet
	 * .ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			PageCacheManager.getInstance().initPageCache();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.
	 * ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

}
