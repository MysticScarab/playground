package scarab.tryout;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * Backing Bean für den FancyButton.
 */
@Named
@SessionScoped
public class FancyButtonBean implements Serializable {

  private static final long serialVersionUID = 1L;

  private static final String outcome = "/index";

  private String label = "F A N C Y";

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String doFancy() {
    return outcome;
  }
}
