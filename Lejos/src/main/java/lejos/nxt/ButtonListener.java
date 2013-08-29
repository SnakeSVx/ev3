package lejos.nxt;

/**
 * Abstraction for receiver of button events.
 * @see Button#addButtonListener
 */
public interface ButtonListener
{
  public void buttonPressed(Button b);
  public void buttonReleased(Button b);
}
