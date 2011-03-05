package ro.lmn.maven.recipe.gwtdev.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProfileDemo implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
      
      RootPanel rootPanel = RootPanel.get();
      rootPanel.add(new HTML("<h1>Welcome</h1>"));
      rootPanel.add(new HTML("<p>Sample GWT project.</p>"));
  }
}
